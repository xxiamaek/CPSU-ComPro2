package FromC2Java;

import java.util.Scanner;

public class NoDivideByZero {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            
            if(z != 0) {
                double result = ((x + y) / z);
                System.out.printf("%.6f", result);
            }  else {
                System.out.print("cannot divide by zero");
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}