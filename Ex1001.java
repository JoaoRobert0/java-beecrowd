// beecrowd | 1001
// Extremely Basic

import java.io.IOException;
import java.util.Scanner;
 
public class Ex1001 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        
        System.out.println("X = " + (x + y));

        scanner.close();
    }
 
}