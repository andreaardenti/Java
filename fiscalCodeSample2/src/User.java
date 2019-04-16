import java.util.Calendar;

public class User {
    private String name;
    private String surname;
    private Calendar dateOfBirth;
    private String sex;
    private String fiscalCode;
    private String fiscalCode2;


    public User(String param1, String param2, Calendar date, String param3) {
        this.surname = param1;
        this.name = param2;
        this.dateOfBirth = date;
        this.sex = param3;
        this.fiscalCode = generateFCSurame();
        this.fiscalCode2 = generateCFName();
    }

    public String generateCFName() {
        char[] chars = this.name.toLowerCase().toCharArray();

        String consonants = "";
        String vowels = "";

        for (int i=0; i<chars.length; i++) {
            char ch = chars[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                vowels += ch;
            } else if(ch != ' '){
                consonants += ch;
            }
        }

        int year = this.dateOfBirth.get(Calendar.YEAR);
        String yearString = String.valueOf(year);

        int monthValue = this.dateOfBirth.get(Calendar.MONTH);
        char month = this.convertMonth(monthValue);

        int dayValue = this.dateOfBirth.get(Calendar.DAY_OF_MONTH);

        if (this.sex=="f") {
            dayValue +=40;
        }
        String day = this.convertDay(dayValue);


        if (consonants.length() >= 4) {
            System.out.println ("" + consonants.charAt(0) + consonants.charAt(2) + consonants.charAt(3) + yearString.substring(2,4) + month + day);
        } else if (consonants.length() == 3){
            System.out.println ("" + consonants.charAt(0) + consonants.charAt(1) + consonants.charAt(2) + yearString.substring(2,4) + month + day);
        } else if (consonants.length() == 2) {
            System.out.println ("" + consonants.charAt(0) + consonants.charAt(1) + vowels.charAt(0) + yearString.substring(2,4) + month + day);
        } else if (consonants.length() == 1) {
            System.out.println ("" + consonants.charAt(0) + vowels.charAt(0) + vowels.charAt(1) + yearString.substring(2,4) + month + day);
        }

        return "";
    }

    public String generateFCSurame() {
        char[] chars = this.surname.toLowerCase().toCharArray();
        String consonants = "";
        String vowels = "";
        for (int i=0; i < chars.length; i++){
            char ch = chars[i];
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels += ch;
            } else if (ch != ' '){
                consonants += ch;
            }
        }
        switch (consonants.length()){
            case 0: return "" + vowels.charAt(0) + vowels.charAt(1) + vowels.charAt(2);
            case 1: return "" + consonants.charAt(0) + vowels.charAt(0) + vowels.charAt(1);
            case 2: return "" + consonants.charAt(0) + consonants.charAt(1) + vowels.charAt(0);
            default: return "" + consonants.charAt(0) + consonants.charAt(1) + consonants.charAt(2);
        }
    }

    private String convert(String str) {
        String result = "";
        //step 1 uppercase
        str = str.toUpperCase();
        //step 2 transform str to Char[]
        char[] charArray = str.toCharArray();
        // step3 ciclo for
        for(int i=0; i < charArray.length; i++) {
            char letter = charArray[i];
            //char letter = str.charAt(i);
            if (!(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')) {
                result += letter;
            }
            if (result.length() == 3) {
                break;
            }
        }
        // step4
        switch (result.length()){
            case 2: result += 'X';break;
            case 1: result += "XX";break;
            case 0: result += "XXX";break;
        }
        return result;
    }

    private char convertMonth(int month) {
        return "ABCDEHLMPRST".charAt(month);
    }

    private String convertDay(int value){
        String valueInString = String.valueOf(value);
        if(valueInString.length() == 1){
            return "0"+valueInString;
        }
        return valueInString;
    }
}