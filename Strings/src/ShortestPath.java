package Strings.src;
public class ShortestPath {
    public static float Path(String Path){
        int x=0 , y=0 ;
        for (int i = 0; i < Path.length(); i++) {
            char Direction = Path.charAt(i);
            //South
            if(Direction == 'S'){
                y--;
            //North
            }else if (Direction == 'N') {
                y++;              
            //East  
            } else if (Direction == 'E') {
                x++;
            //West
            } else if(Direction == 'W'){
                x--;                
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float) Math.sqrt(X+Y);
    }
    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(Path(Path));
    }
    
}
