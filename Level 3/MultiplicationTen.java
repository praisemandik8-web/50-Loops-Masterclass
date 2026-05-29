//25. Print a multiplication table from 1 to 10.

public class MultiplicationTen{
    public static void main(String[]args){
        for(int base = 1; base<=10; base++){
            for(int num = 1; num<=12; num++){
                int result = base*num;
                System.out.println(base+ " X "+ num+ " = "+ result);
            }        
            System.out.println();
        }

    }
}
