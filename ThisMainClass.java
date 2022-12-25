import java.util.*;  
class This   
{  
    int x;
    int y;

    public void swap(){
        this.x = this.x + this.y;   
        this.y = this.x - this.y;   
        this.x = this.x - this.y;   
        System.out.println("After swapping:\nx ==> "+this.x +"\ny ==> " + this.y);   
    }
} 



class ThisMainClass {
    
    public static void main(String x[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        int a =  sc.nextInt() ;  
        int b =  sc.nextInt() ;  
        This obj = new This();
        obj.x = a;
        obj.y = b;
        obj.swap();
    }   
}