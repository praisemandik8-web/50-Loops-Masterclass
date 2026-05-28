//14.Calculate the sum of even numbers from 1 to 50.
//level 2, question 13
public class SumEven{

    public static void main(String[]args){
        int sum = 0;
        for(int number = 1; number<=50; number++){
            if(number % 2== 0){
                sum+=number;
                System.out.println(sum);
            }
           
        }
        System.out.println("Sum of even numbers is "+ sum);
    }

}
