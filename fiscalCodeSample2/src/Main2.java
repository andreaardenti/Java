public class Main2 {

    public static void main(String[] args) {

        String cfName = generateCFName("Adea");
        String cfName2 = generateCFName("Andrea Roberto");
        String cfName3 = generateCFName("Margherita Anna");
        System.out.println(cfName);
    }

        private static String generateCFName(String name) {
            char[] chars = name.toLowerCase().toCharArray();

            String consonants = "";
//            char[] consonants = new char[10];
//            int countConsonant = 0;

            String vowels = "";
//            char[] vowels = new char[10];
//            int countVowels = 0;

            for (int i=0; i<chars.length; i++) {
                char ch = chars[i];
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                    vowels[countVowels] = ch;
//                    countVowels++;
                    vowels += ch;
                } else if(ch != ' '){
//                    consonants[countConsonant] = ch;
//                    countConsonant++;
                    consonants += ch;
                }
            }
            System.out.println ("Consonants: " + consonants);
//            System.out.println ("Consonants: " + countConsonant);
            System.out.println ("Vowels: " + vowels);
//            System.out.println ("Vowels: " + countVowels);

//            switch (consonants.length()) {
//                case 4:
//                        System.out.println ("" + consonants.charAt(0) + consonants.charAt(2) + consonants.charAt(3));//
//                break;
//            }

            if (consonants.length() >= 4) {
                System.out.println ("" + consonants.charAt(0) + consonants.charAt(2) + consonants.charAt(3));
            } else if (consonants.length() == 3){
                System.out.println ("" + consonants.charAt(0) + consonants.charAt(1) + consonants.charAt(2));
            } else if (consonants.length() == 2) {
                System.out.println ("" + consonants.charAt(0) + consonants.charAt(1) + vowels.charAt(0));
            } else if (consonants.length() == 1) {
                System.out.println ("" + consonants.charAt(0) + vowels.charAt(0) + vowels.charAt(1));
            }

            return "";
        }



}


