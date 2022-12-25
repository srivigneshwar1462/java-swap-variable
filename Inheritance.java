import java.util.*;  


class Swap {
    Swap(){
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        int x =  sc.nextInt() ;  
        int y =  sc.nextInt() ;  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping:\nx ==> "+x +"\ny ==> " + y);   
    }
}


class Inheritance extends Swap
{  
    public static void main(String a[])   
    {   
        Inheritance obj = new Inheritance(); 
    }   
}  
