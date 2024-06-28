import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double x = scanner.nextDouble();
        
        double total = (4/3.0) * 3.14159 * (x * x * x);
        
        System.out.println("VOLUME = " + String.format("%.3f", total));

        scanner.close();
    }
}
