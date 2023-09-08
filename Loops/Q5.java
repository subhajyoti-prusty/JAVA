// What is Wrong with this Question
package JAVA_QUESTIONS.Loops;

public class Q5 {
    public static void main(String[] args) {
        // for(int i = 0; i <= 5; i++ ) {
        //     System.out.println("i = " + i );
        // }
        // System.out.println("i after the loop = " + i ); 

        //Correct Code
            for(int i = 0; i <= 5; i++ ) {
                System.out.println("i = " + i );
                System.out.println("i after the loop = " + i );
            }
    }
    
}
//In the line 9 
//i can't be resolved to a variable as its outside the for loop 