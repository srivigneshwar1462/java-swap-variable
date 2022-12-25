import java.util.*;  

class MultiThreading extends Thread {
	public void run()
	{
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


public class Multithread {
	public static void main(String[] args)
	{
		MultiThreading object = new MultiThreading();
		object.start();
	}
}
