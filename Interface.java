import java.util.*;  


interface swap {
   void swap();
}


class Interface implements swap
{  
    public static void main(String a[])   
    {   
        Interface obj = new Interface(); 
        obj.swap();
    }   

    public void swap(){
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
