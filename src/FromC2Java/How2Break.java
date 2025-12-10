package FromC2Java;

import java.util.Scanner;

public class How2Break {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int sum = 0;

            for( ; ; ) {
                int input = sc.nextInt();

                boolean isZero = (input == 0);
                if(isZero) {
                    break;
                } else {
                    sum++;
                }
            }

            System.out.print(sum);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}