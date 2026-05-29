//15. Ask the user for 5 numbers and calculate the total
import java.util.Scanner;
public class TotalFive{

    public static void main(String[]args){

        Scanner inputCollector = new Scanner(System.in);
        int [] numbers = new int[5];

        int total = 0;
        for(int count = 0; count<5; count++){
            System.out.println("Enter numbers");
            numbers[count]= inputCollector.nextInt();   
            total=total + numbers[count]+1;
           
           

        }
        System.out.println(total);
        
    }


}
