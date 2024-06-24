// beecrowd | 1002
// Area of a Circle

import java.io.IOException;
import java.util.Scanner;
 
public class Ex1002 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        double pi = 3.14159;
        double r = scanner.nextDouble();
        
        double area = pi * (r * r);
        
        System.out.println("A=" + String.format("%.4f", area));

        scanner.close();
    }
 
}