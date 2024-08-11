public class LambdaWithOneVariable {
    interface Announcement {
        // Adding a parameter to the method with a String variable
        public String announce(String annText);
    }

    public static void main(String[] args) {
        // First lambda expression begins
        Announcement a1 = (annText) -> { 
            return "We have an important announcement to be made. " + annText;
        };
        System.out.println(a1.announce("The flight going to New York has been cancelled due to the extreme weather."));
        
        // Second lambda expression begins
        Announcement a2 = annText -> { 
            return "We have an important announcement to be made. " + annText;
        }; 
        System.out.println(a2.announce("The flight going to Boston has been cancelled due to a hailstorm."));
    }
}
