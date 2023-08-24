
public class Question2 {
    public static void main(String[] args) {
        // with extra variable
        int x = 100, y = 200;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        //without extra variable
       int  a=5, b=10;              
       a=a*b;      
       b=a/b;       
       a=a/b;    
       System.out.println(a + " " + b);
       
    }
}
