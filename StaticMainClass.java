import java.util.*;  
class Static   
{  
    public static int x;
    public static int y;

   

     public static void swap(){        
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping:\nx ==> "+x +"\ny ==> " + y);   
    }
}  

class StaticMainClass {
 public static void main(String m[])   
    {   
        System.out.println("Enter the value of a and b");  
        Scanner sc = new Scanner(System.in);  
        int a =  sc.nextInt() ;  
        int b =  sc.nextInt() ;  
        Static.x = a;
        Static.y = b;
        Static.swap();

    }   

}