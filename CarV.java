public class CarV extends Vehicle{
    //DATA
    public int maxSpeed;

    //func
    public CarV(String make,int numberOfWheels,char licenseType,int maxSpeed){
        super(make,numberOfWheels,licenseType);
        this.maxSpeed=maxSpeed;
        super.go();


        //this.make=make;
        //this.numberOfWheels=numberOfWheels;
        //this.licenseType=licenseType;
//
    }


    //@Override
    //public void go(){
    //    System.out.println("going fast ... ... ..  .");
    //}

    //@Override
    //public void stop(){
    //    System.out.println("breaking ............");
    //}
}























