import swap.SwapClass;
import java.util.*;  

class MainClass
{
    public static void main(String a[]){
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        int x =  sc.nextInt() ;  
        int y =  sc.nextInt() ;  
        SwapClass obj = new SwapClass(x,y);
    }
}