public class Circle extends Shape{
    //DATA
    // Shape--- area,hekef
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.calcArea();//X super
        this.calcHekef();
    }

    @Override
    public void calcArea() {
        super.setArea(Math.PI*this.radius*this.radius);
    }

    @Override
    public void calcHekef() {
        this.setHekef(Math.PI*2*this.radius);
    }

    @Override
    public String toString() {
        return super.toString()+"radius is "+this.radius;
    }
}
