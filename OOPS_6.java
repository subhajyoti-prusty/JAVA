package OOPS.src;
//Interface
//
public class OOPS_6 {
    public static void main(String[] args) throws Exception{
        Queen Q1 =new Queen();
        Q1.moves();
        Rook R2= new Rook();
        R2.moves();
        Bishop B3= new Bishop();
        B3.moves();
        Pawn p4= new Pawn();
        p4.moves();
        Knight k5= new Knight();
        k5.moves();
        King king6= new King();
        king6.moves();
    }
    
}

//Multipule inheritance 

interface Herbivore{

}

interface Carnivore{
    
}

class Bear implements Carnivore,Herbivore{
    //... methods and fields here..
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
     public void moves() { 
        System.out.println("up, down, left, right, diagonal (in all 4 dirns)");
     }
}

class Rook implements ChessPlayer {
     public void moves() { 
        System.out.println("up, down, left, right");
     }
}

class King implements ChessPlayer {
     public void moves() { 
        System.out.println("up, down, left, right, diagonal (by 1 step)");
     }
}

class Bishop implements ChessPlayer {
     public void moves() { 
        System.out.println("diagonal (in all 4 direction)");
     }
}

class Knight implements ChessPlayer {
     public void moves() { 
        System.out.println("moves 2 and half step");
     }
}

class Pawn implements ChessPlayer {
     public void moves() { 
        System.out.println("1 move up");
     }
}



