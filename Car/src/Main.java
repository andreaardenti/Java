public class Main {

    public static void main(String[] args) {

        int maxSpeed=0;
        int maxPrice=0;
        int bestCar=0;
        int worstCar=0;
        int currentIndexSpeed=0;
        int currentIndexPrice=0;
        int currentIndexBest=0;

        Car c1 = new Car(20000, 180);
        Car c2 = new Car(10000, 150);
        Car c3 = new Car(25000, 130);
        Car c4 = new Car(13000, 160);
        Car c5 = new Car(22000, 100);

        Car cars[] = new Car[5];

        cars[0]=c1;
        cars[1]=c2;
        cars[2]=c3;
        cars[3]=c4;
        cars[4]=c5;

        c1.setBrand("Ford");
        c2.setBrand("Ferrari");
        c3.setBrand("Bentley");
        c4.setBrand("Audi");
        c5.setBrand("Lada");

        maxSpeed = c1.getSpeed();
        for (int i=0; i < cars.length; i++){
            //cars[i].getSpeed();
            if (cars[i].getSpeed() > maxSpeed){
                maxSpeed = cars[i].getSpeed();
                currentIndexSpeed=i;
            }
        }
        System.out.println("La macchina con la velocità maggiore fa: " + maxSpeed + " " + cars[currentIndexSpeed].getBrand());

        maxPrice = c1.getPrice();
        for (int i=0; i < cars.length; i++){
            //cars[i].getSpeed();
            if (cars[i].getPrice() > maxPrice){
                maxPrice = cars[i].getPrice();
                currentIndexPrice=i;
            }
        }
        System.out.println("La macchina con il prezzo maggiore è: " + maxPrice + " " + cars[currentIndexPrice].getBrand());

        bestCar = c1.getPrice() / c1.getSpeed();
        for (int i=0; i < cars.length; i++) {
            worstCar = cars[i].getPrice()/cars[i].getSpeed();
            if (bestCar > worstCar) {
                bestCar = worstCar;
                currentIndexBest=i;
            }
        }
        System.out.println("Il miglior rapporto qualità/prezzo è: " + bestCar + " " + cars[currentIndexBest].getBrand());


        for (int i=0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
