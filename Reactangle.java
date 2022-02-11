public abstract class Reactangle extends Shape{
    //DATA
    //super ----- area hekef
    private double a;
    private double b;

    public Reactangle(double a,double b) {
        this.a = a;
        this.b = b;
        this.calcArea();
        this.calcHekef();
    }

    @Override
    public void calcArea() {
        super.setArea(a *b);
    }


    @Override
    public String toString() {
        return super.toString()+" a is "+this.a+" b is "+this.b;
    }
}
