//15. Ask the user for 5 numbers and calculate the total
import java.util.Scanner;
public class TotalFive{

    public static void main(String[]args){

        Scanner inputCollector = new Scanner(System.in);
       // int [] numbers = new int[5];

        
        for(int count = 1; count<=5; count++){
            System.out.println("Enter numbers");
           int numOne = inputCollector.nextInt();
            int numTwo = inputCollector.nextInt();
            int numThree = inputCollector.nextInt();
            int numFour = inputCollector.nextInt();
            int numFive = inputCollector.nextInt();  

           int total= numOne+numTwo+numThree+numFour+numFive;
           System.out.println(total);

        }

        
    }


}
