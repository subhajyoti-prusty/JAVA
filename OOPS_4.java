package JAVA.OOPS;
//Method Overloading
//Multiple functions with the same name but different parameters 

public class OOPS_4 {
    public static void main(String[] args) throws Exception{
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1.2,2.5));
        System.out.println(calc.add(1,2,3));

        Deer D1 = new Deer();
        D1.eat();

    }
    
}
class Animal{
    void eat(){
        System.out.println("Animal is eating");         
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eat grass");
    }

}

class Calculator{
    int add(int a, int b){
        return (a+b);
    }
        double add(double c, double d){
            return (c +d );
        }
            int add(int a,int b,int c){
                return(a+b+c);
            }
        
}

//Method Overriding 
//Parent and child classes both contain the same function with a different defination 