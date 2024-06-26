// beecrowd | 1006
// Average 2

import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        

        double average = ((a * 2) + (b * 3) + (c * 5)) / 10;
        
        System.out.println("MEDIA = " + String.format("%.1f", average));

        input.close();
    }    
}
