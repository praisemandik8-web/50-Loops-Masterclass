//Find the smallest number from 5 user inputs
import java.util.Scanner;

public class Smallest{

    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
        int [] numbers = new int[5];
    
        int smallest = numbers[0];
        for(int count = 0; count <5; count++){
            System.out.println("Enter 5 numbers");
            numbers[count]= inputCollector.nextInt();

            
            if(numbers[count]< smallest){
                smallest = numbers[count];
                
            }
            
        }
        System.out.println("Smallest is "+smallest);
    }

}
