// beecrowd | 1007
// Difference

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int difference = (a * b - c * d);

        System.out.println("DIFERENCA = " + difference);

        input.close();
    }
}
