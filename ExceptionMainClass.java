import java.util.*;

class ExceptionClass{

    int x;
    int y;

    public static void main(String a[])   
    {   
        ExceptionClass obj = new ExceptionClass();
        boolean isException = true;
        while(isException){
            try{
                isException = false;
                obj.getInputs();
            }catch(Exception e){
                isException = true;
            }
        }
        obj.swap();
        
    }  


    public void getInputs(){
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        x =  sc.nextInt() ;  
        y =  sc.nextInt() ;  
    }

    public void swap(){
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping:\nx ==> "+x +"\ny ==> " + y);   
    }
}


class ExceptionMainClass {
    public static void main(String a[])   
    {   
        ExceptionClass obj = new ExceptionClass();
        boolean isException = true;
        while(isException){
            try{
                isException = false;
                obj.getInputs();
            }catch(Exception e){
                isException = true;
            }
        }
        obj.swap();
        
    }  
}