public class EvenOdd {

// ESERCIZIO SVOLTO CON LA SCELTA DI PARI O DISPARI DA PARTE DELL'UTENTE

    public int launch(String param1, int human) {

        //assegnazione del numero al giocatore pc con Math.Random()
        double random = Math.random();
        int pc;
        if (random < 0.20) {
            pc = 1;
        } else if (random < 0.40) {
            pc = 2;
        } else if (random < 0.60) {
            pc = 3;
        } else if (random < 0.80) {
            pc = 4;
        } else {
            pc = 5;
        }

        System.out.println("Human: " + param1 + " " + human);
        System.out.println("PC:" + pc);

        //condizioni di vincita
        if ((param1 == "even") && ((human%2)==0) && ((pc%2)==0)) {
            System.out.println("Human Win!");
            return 1;
        } else if ((param1 == "even") && ((human%2)==0) && ((pc%2)==1)) {
            System.out.println("PC Win!");
            return 0;
        } else if ((param1 == "even") && ((human%2)==1) && ((pc%2)==0)){
            System.out.println("PC Win!");
            return 0;
        } else if ((param1 == "odd") && ((human%2)==0) && ((pc%2)==0)) {
            System.out.println("PC Win");
            return 0;
        } else if ((param1 == "odd") && ((human%2)==0) && ((pc%2)==1)) {
            System.out.println("Human Win!");
            return 1;
        } else {
            System.out.println("Human Win!");
            return 1;
        }
    }



// ESERCIZIO SVOLTO SENZA LA SCELTA DI PARI O DISPARI DA PARTE DELL'UTENTE

//    public int launch(int human) {
//
//        //assegnazione del numero al giocatore pc con Math.Random()
//        double random = Math.random();
//        int pc;
//        if (random < 0.20) {
//            pc = 1;
//        } else if (random < 0.40) {
//            pc = 2;
//        } else if (random < 0.60) {
//            pc = 3;
//        } else if (random < 0.80) {
//            pc = 4;
//        } else {
//            pc = 5;
//        }
//
//        System.out.println("Human:" + human);
//        System.out.println("PC:" + pc);
//
//        //condizioni di vincita
//        if (pc == human) {
//            System.out.println("I'm sorry the game is a draw!");
//            return 0;
//        } else if ((((human % 2) == 0) && (pc % 2) == 1)) {
//            System.out.println("PC Win!");
//            return -1;
//        } else if ((((human % 2) == 1) && (pc % 2) == 0)){
//            System.out.println("Human Win!");
//            return 1;
//        } else if ((((human % 2) == 0) && (pc % 2) == 0)) {
//            System.out.println("I'm sorry the game is a draw!");
//            return 0;
//        } else {
//            System.out.println("I'm sorry the game is a draw!");
//            return 0;
//        }
//
//    }

}
