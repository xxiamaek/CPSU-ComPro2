package FromC2Java;

import java.util.Scanner;

public class OperSelect {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            switch (z) {
                case 1 -> System.out.print(x + y);
                case 2 -> System.out.print(x - y);
                case 3 -> System.out.print(x * y);
                case 4 -> {
                    if (y == 0) {
                        System.out.print("cannot divide by zero");
                    } else {
                        System.out.print(x / y);
                    }
                }
                case 5 -> {
                    if (y == 0) {
                        System.out.print("cannot divide by zero");
                    } else {
                        System.out.print(x % y);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}