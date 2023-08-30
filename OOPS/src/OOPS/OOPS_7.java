package OOPS;
//static keyword in Java is used to share the same variable or method of a given class.
//- Properties
//- Functions
//- Blocks
//- Nested Classes
public class OOPS_7 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.schoolName ="KV";
        
        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        //System.out.println(s3.schoolName);


    }
    
}

class Student {
    String name;
    int rollNo;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
      
    String getName(){
        return this.name;
    }
}
