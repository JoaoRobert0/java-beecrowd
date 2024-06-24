// beecrowd | 1004
// Simple Product

import java.io.IOException;
import java.util.Scanner;
 
public class Ex1004 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        System.out.println("PROD = " + (x * y));
    }
 
}