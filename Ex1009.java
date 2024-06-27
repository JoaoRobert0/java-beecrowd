// beecrowd | 1009
// Salary with Bonus

import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double fixed = input.nextDouble();
        double sale = input.nextDouble();

        double total = fixed + ((sale * 15) / 100);

        System.out.println("TOTAL = R$ " + String.format("%.2f", total));

        input.close();
    }
}
