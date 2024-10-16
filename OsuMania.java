// B. osu!mania (2009B)
import java.util.Scanner;

public class OsuMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            // Read the number of rows for this test case
            int n = scanner.nextInt();
            scanner.nextLine();  // Consume the remaining newline
            
            int[] columns = new int[n]; // To store the column of '#' for each row
            
            // Read each row of the beatmap
            for (int i = 0; i < n; i++) {
                String row = scanner.nextLine();
                for (int j = 0; j < 4; j++) {
                    if (row.charAt(j) == '#') {
                        columns[i] = j + 1; // Store the 1-based index of the '#'
                        break;
                    }
                }
            }
            
            // Output the column indices in reverse order
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(columns[i] + " ");
            }
            System.out.println(); // Move to the next line after each test case
        }
        
    }
}
