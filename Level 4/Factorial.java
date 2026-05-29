//31. Find the factorial of a number.
import java.util.Scanner;

public class Factorial{

    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = inputCollector.nextInt();
    
        int factorial = 1;
        for(int num = 1; num<=number; num++){
            factorial= factorial * num;
            System.out.println(factorial);        
        }
        
    }

}
