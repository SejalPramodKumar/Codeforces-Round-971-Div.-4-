// A. Minimize! (2009A)
import java.util.Scanner;
 
public class MinimizeExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the number of test cases
        int t = scanner.nextInt();
 
        // Process each test case
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
 
            // Output the difference b - a
            System.out.println(b - a);
        }
      
    }
}
