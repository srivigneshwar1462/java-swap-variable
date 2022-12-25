import java.util.*;  
class Constructor   
{  
    public Constructor(int x, int y){
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping:\nx ==> "+x +"\ny ==> " + y);   
    }

   
}  


class ConstructorMainClass {
     public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        int x =  sc.nextInt() ;  
        int y =  sc.nextInt() ;  
        Constructor obj = new Constructor(x,y);
    }   
}