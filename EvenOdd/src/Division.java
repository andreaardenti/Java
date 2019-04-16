public class Division {

    public int launchDivision(int human) {

        //assegnazione del numero al giocatore pc con Math.Random()
        double randomBis = Math.random();
        int division = 0;
        int pcBis = 1;
        if (randomBis < 0.20) {
            pcBis = 1;
        } else if (randomBis < 0.40) {
            pcBis = 2;
        } else if (randomBis < 0.60) {
            pcBis = 3;
        } else if (randomBis < 0.80) {
            pcBis = 4;
        } else if (randomBis < 0.99){
            pcBis = 5;
        }

        System.out.println("\nHuman:" + human);
        System.out.println("PC:" + pcBis);

        //versione alternativa con la divisione
        if (pcBis > human) {
            division = pcBis / human;
        } else {
            division = human / pcBis;
        }

        if ((division == 2) || (division == 4)) {
            System.out.println("Even Win!");
        } else {
            System.out.println("Odd Win!");
        }
        return division;
    }
}
