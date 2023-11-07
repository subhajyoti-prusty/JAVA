package OOPS.src;

//Abstraction: Hiding all the unnecessary details and showing only the imp parts to the user
//Abstract class:-
//-Cannot create create an instance of abstract class 
//-Can have abstract/non-abstract methods
//-Can have constructors
public class OOPS_5 {
    public static void main(String[] args) throws Exception{
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

        Mustang myHorse = new Mustang();
        //Animal-->Horse-->Mustang
    }
    
}
abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor is called");
        color = "Brown";
    }
    void eat(){
        System.out.println("Animal is eating");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
        color = "Brown";
    }

    void changecolor(){
        color="Dark Brown";
    }
    void walk(){
        System.out.println("Horse is walking with four legs.");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
class chicken extends Animal{
    void changecolor(){
        color="White";
    }
    void walk(){
        System.out.println("Chicken is waddling in circles.");
    }
}