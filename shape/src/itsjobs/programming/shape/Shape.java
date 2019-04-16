package itsjobs.programming.shape;

public class Shape {

    public Shape() {
        this.name="Generic shape";
    }

    public Shape(float base, float height) {
        this.name="shape";
        this.base=base;
        this.height=height;
    }

    public Shape(String name, float base, float height) {
        this.name=name;
        this.base=base;
        this.height=height;
    }

    protected float base;
    protected float height;

    protected String name;

    public float getArea(){
        return Float.NaN;
    }

    @Override
    public String toString() {
        return
                "base=" + base +'\n'+ "height=" + height +'\n'+ "name=" + name + "\n"+"area="+this.getArea()+'\n';
    }
}
