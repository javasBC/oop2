public abstract class Shape extends Object{
    //DATA
    private double area;
    private double hekef;
    //FUNC
    public Shape() {
    }
    public void calcArea(){

    }
    public abstract void calcHekef();
    //GETTs
    public double getArea() {
        return area;
    }
    public double getHekef() {
        return hekef;
    }
    //SETTERs
    public void setArea(double area) {
        this.area = area;
    }
    public void setHekef(double hekef) {
        this.hekef = hekef;
    }
    @Override
    public String toString(){
        return String.format("the area of this shape is %.3f  " +
                "and the hekef is %.3f",this.area,this.hekef);
    }
}
