package FromC2Java;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int result = (number % 10); 
            
            System.out.print(result);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}