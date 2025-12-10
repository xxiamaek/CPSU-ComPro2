package FromC2Java;

import java.util.Scanner;

public class OddvsEven {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int sumOdd=0, sumEven=0;

            for(int i=0 ; i < 8 ; i++) {
                int input = sc.nextInt();

                boolean isEven = ((input % 2) == 0);
                if(isEven) {
                    sumEven+=input;
                } else {
                    sumOdd+=input;
                }
            }

            if(sumEven > sumOdd) {
                System.out.println("even");
            } else if(sumOdd > sumEven) {
                System.out.println("odd");
            } else {
                System.out.println("equal");
            }
            System.out.println(sumEven);
            System.out.println(sumOdd);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
