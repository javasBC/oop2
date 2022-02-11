import javax.lang.model.element.NestingKind;
import java.awt.*;

public class Car {
    //DATA
    public String make;
    public String model;
    public  int hp;public Color color;
    public  boolean sunRoof;

    //func


    public Car() {
    }
    public Car(Car other){
        this.model= other.model;
        this.make=other.make;
        this.hp= other.hp;
        this.color=other.color;
        this.sunRoof= other.sunRoof;
    }

    //Code >>> GENERATE >>> CONSTRUCTOR
    public Car(String make, String model, int hp, Color color, boolean sunRoof) {
        this.make = make;
        this.model = model;
        this.hp = hp;
        this.color = color;
        this.sunRoof = sunRoof;
    }

    public void go(){
        System.out.println("going forward!!!!!!!!!");
    }

    public void brake(){
        System.out.println("STOPPPPPPPPPPPPPPPPPING");
    }

    public void copy(Car other){
        this.model= other.model;
       other.make=this.make;
       other.hp= this.hp;
       other.color=this.color;
       other.sunRoof= this.sunRoof;


    }


    @Override
    public String toString(){
        return "Car >>>  \n make:"+this.make+" model: "+this.model
                +" horse Power :"+this.hp+" Color :"+color+" Sunroof?"
                +this.sunRoof;
    }


}























