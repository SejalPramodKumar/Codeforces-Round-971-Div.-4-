// C. The Legend of Freya the Frog (2009C)
import java.util.Scanner;
 
public class FreyaTheFrog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < t; i++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long d = scanner.nextLong();
            long x_moves,y_moves;
            long ans = 0;
            if(x > y) {
            x_moves=(x + d - 1) / d ;
            y_moves=Math.max(((x + d - 1) / d )- 1, (y + d - 1) / d);
            ans=ans+x_moves+y_moves;
            }
            else {
            y_moves=(y + d - 1) / d ;
            x_moves=Math.max(((x + d - 1) / d ), (y + d - 1) / d);
            ans=ans+x_moves+y_moves;  
            }
            System.out.println(ans);    
        }
    }
}
