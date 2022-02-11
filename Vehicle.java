public class Vehicle {
    //DATA
    public String make;
    public int numberOfWheels;
    private char licenseType;

    //Func
    public Vehicle(){}

    public Vehicle(String model, int numberOfWheels, char licenseType) {
        this.make = model;
        this.numberOfWheels = numberOfWheels;
        this.licenseType = licenseType;
    }

    public void go(){
        System.out.println("moving  ...   ....   .... ");
    }

    public final void stop(){
        System.out.println("waiting ... ... ... waiting");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + super.toString() + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", licenseType=" + licenseType +
                '}';
    }
}
