package JAVA.OOPS;
public class OOPS_1 {
    
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.size=5;
        System.out.println("Pen Size: "+p1.size);
        p1.color="Yellow";
        System.out.println("Pen Color: "+p1.color);
        p1.setColor("Red");   //using setter function instead of direct assignment
        System.out.println("New Pen Color after using Setter Function :"+p1.getcolor());
        p1.setSize(8);//Using getter functions in place of accessing member variable directly
        System.out.println("Updated pen size:"+p1.getsize());


        BankAccount myAcc= new BankAccount();
        //myAcc is an object of the type "BankAccount" and it has two instance variables
        myAcc.usearname="Subhajyoti";
        //myAcc.passwors="<PASSWORD>";  Not allowed to access the password directly from
        //outside of this object, hence we need a method for setting it
        myAcc.setpassword("<PASSWORD>");
    }
}
//Getter and Setters
//Get:to return value
//Set:To change or assign or modify values
//this:this keyword is used to refer to current object
class BankAccount{
    public String usearname;
    private String passwors;
    public void setpassword(String pwd){
        passwors =pwd ;
    }
}
class Pen{
    String color;
    int size;
    String getcolor(){
        return this.color;
    }
    int getsize(){
        return this.size;
    }
    void setColor(String newcolor){
    color= newcolor;
    }
    void setSize(int newsize){
    size= newsize;
    }
}



