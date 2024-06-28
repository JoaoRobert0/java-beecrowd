// beecrowd | 1010
// Simple Calculate

import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] stringLine = inputLine.split(" ");

        double[] array = new double[stringLine.length];
        
        for (int i = 0; i < stringLine.length; i++) {
            array[i] = Double.parseDouble(stringLine[i]);
        }

        double total = array[1] * array[2];

        inputLine = scanner.nextLine();
        stringLine = inputLine.split(" ");

        array = new double[stringLine.length];
        
        for (int i = 0; i < stringLine.length; i++) {
            array[i] = Double.parseDouble(stringLine[i]);
        }

        total += array[1] * array[2];

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

        scanner.close();
    }
    
}