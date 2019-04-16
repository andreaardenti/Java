package itsjobs.programming.shape;

public class Rectangle extends Shape {
    public Rectangle() {
        this.name="Rettangolo";
    }

    public Rectangle(float base, float height) {
        super("Rettangolo", base, height);
    }

    public float getArea(){

        return this.base*this.height;
    }
}
