package itsjobs.programming.shape;

public class Triangle extends Shape {
    public Triangle () {
        this.name="Triangle";
    }

    public Triangle(float base, float height) {
        super("Triangle", base, height);
    }

    public float getArea(){

        return this.base*this.height/2;
    }


}
