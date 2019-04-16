public class Car {

    private String brand;
    private int price;
    private int speed;

    public Car (int price, int speed) {
        this.price=price;
        this.speed=speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
