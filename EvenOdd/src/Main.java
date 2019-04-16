public class Main {

    public static void main(String[] args) {
        EvenOdd game = new EvenOdd();
        Division division = new Division();

        System.out.println("In this match you have scored " + game.launch("even", 1) + " points!");
        System.out.println(" " + division.launchDivision(2));
    }
}
