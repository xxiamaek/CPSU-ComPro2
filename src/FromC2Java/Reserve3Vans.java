package FromC2Java;

import java.util.Scanner;

public class Reserve3Vans {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
             int vanA=0, vanB=0, vanC=0;
            
            int n = sc.nextInt();

            for(int i=0 ; i < n ; i++) {
                int day = sc.nextInt();
                if ((vanA <= vanB) && (vanA<=vanC)) {
                    vanA+=day;
                    System.out.println("A");
                } else if ((vanB <= vanA) && (vanB <= vanC)) {
                    vanB+=day;
                    System.out.println("B");
                } else {
                    vanC+=day;
                    System.out.println("C");
                }
            }

        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}