// beecrowd | 1005
// Average 1

import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double average = ((a * 3.5) + (b* 7.5)) / 11;
        
        System.out.println("MEDIA = " + String.format("%.5f", average));

        input.close();

    }    
}
