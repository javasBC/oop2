import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Color c = new Color(0x005AF1);
        Car myCar = new Car("seat","arona",185,c,false);
        Car dorCar = new Car("ford","mustang",300,c,true);
        Car car3= new Car(dorCar);
//
        System.out.println(myCar);
        System.out.println(dorCar);
//
        //myCar=dorCar;
        myCar.copy(dorCar);
        System.out.println("after = ");
        System.out.println(myCar);
        System.out.println(dorCar);
        dorCar.make="kia";
        System.out.println(myCar);
        System.out.println(dorCar);
//
        Employee e1;
        e1=new Employee("yoav",2000);
        Employee e2 = new Employee(e1);

        e1.setSalary(100);
        System.out.println(e1.getSalary());
        e1.setSalary(5000);
        System.out.println(e1.getSalary());
        System.out.println(e1);

       Author donlad_trump = new Author("Donlad Trump", "haha-whiteHouse@USA.com");
       Author driedrich_nietzsche = new Author("Friedrich Nietzsche", "antisT@USA.com");
       Author beni_Goren = new Author("bennie goren", "math_is_life@ort.com");
       Book book1=new Book("i2255","how to get rich",donlad_trump,29.90,4);
       Book book2=new Book("i22995","the art of comeback",donlad_trump,50.90);
       Book book3 = new Book("i8577","806",beni_Goren,129.90,90);


        System.out.println(donlad_trump);
        System.out.println(book1.getAuthor().getEmail());
        System.out.println(book2);
        System.out.println(book3);

       Book[] books={book1,book2,book3};
       //Book[] booksarray=new Book[3];
       //booksarray[0]=book1;
       //booksarray[2]=book2;
       //booksarray[3]=book3;
       int auther1Counter=0,auther2Counter=0;
       for (int i=0;i<books.length;i++){
           //book[i].getAuthor()  => obj Auther    name , email
           //auther.getName()    => string name
           //equals  to check the values
           //donlad_trump.getName()  ==> String
           //String.equals(String)
           if(books[i].getAuthor().getName().equals(donlad_trump.getName()))
               auther1Counter+=books[i].getQty();
           else
               auther2Counter+=books[i].getQty();;
       }

      if (auther1Counter>auther2Counter)
          System.out.println(auther1Counter+""+ donlad_trump );
      else
          System.out.println(auther2Counter+""+beni_Goren);

       Vehicle vehicle1= new Vehicle();
      //CarV car1= new CarV();
      //Bike bike1= new Bike();
//
       //vehicle1.make="volvo";
       System.out.println(vehicle1.make);
       //car1.make="audi";
       //System.out.println(car1.make);
       //System.out.println(bike1.make);
//
       vehicle1.go();
       //car1.go();
       //car1.stop();
       //bike1.go();
//
//
       vehicle1.stop();
       //car1.stop();
       //bike1.stop();
       //vehicle1.speed;
       //System.out.println(car1.speed);

        Vehicle v1= new Vehicle("bmw",4,
                'b');
        System.out.println(v1);

        CarV c1=new CarV("seat",4,
                'b',200);

        Circle circle= new Circle(4.3);
        System.out.println(circle);
        //Reactangle reactangle= new Reactangle(8,5);
        //System.out.println(reactangle);



    }
}




























