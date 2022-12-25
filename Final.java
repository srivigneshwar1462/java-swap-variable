import java.util.*;  
class Final   
{  
    public final int a = 1;
    public final int b = 2;

    public static void main(String a[])   
    {   
        Final obj = new Final();
        obj.swap();
    }   


     public void swap(){
        int x = a;
        int y = b;
        
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping:\nx ==> "+x +"\ny ==> " + y);   
    }
}  