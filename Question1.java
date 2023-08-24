/**
 * Question1
 */
public class Question1 {
   public static int factorial(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        int ans = n * factorial(n - 1);
        return ans;
    }
 
public static void main(String[] args) {
    int ans2 = factorial(1);
    System.out.println(ans2);


}
    
}
