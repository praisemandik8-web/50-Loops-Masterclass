//multiplication table of 7
public class TableSeven{

    public static void main(String[]args){
        
        int result = 0;
        int base = 7;
            for(int times = 1; times<=12; times++){
               result = base*times;
                System.out.println(base+" X "+times+ "="+ result); 
            }
        

    }
}
