//Find the largest number from 5 user inputs
import java.util.Scanner;

public class Largest{

    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
        int [] numbers = new int[5];
    
        int largest = numbers[0];
        for(int count = 0; count <5; count++){
            System.out.println("Enter 5 numbers");
            numbers[count]= inputCollector.nextInt();

            
            if(numbers[count]> largest){
                largest = numbers[count];
                
            }
            
        }
        System.out.println("Largest is "+largest);
    }

}
