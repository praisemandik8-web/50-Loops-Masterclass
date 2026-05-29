//23. Print an inverted triangle pattern.

public class InvertedTriangle{
    
    public static void main(String[]args){

        for(int column = 5; column >=1; column--){
            for(int row = 4; row >column; row++){
                System.out.println(" ");
            }
            System.out.print("* ");
        }
        
    }

}
