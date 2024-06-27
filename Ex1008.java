// beecrowd | 1008
// Salary

import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        int hours = input.nextInt();
        double hour = input.nextDouble();

        System.out.println(
            "NUMBER = " + number +
            "\nSALARY = U$ " + String.format("%.2f", (hours * hour)) 
        );

        input.close();
    }
}