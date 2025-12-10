package FromC2Java;

import java.util.Scanner;

public class TheVoiceSU {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int c1=0, c2=0;

            int n = sc.nextInt();
            int k = sc.nextInt();

            for(int i = 1 ; i <= n ; i++) {
                int g = sc.nextInt();
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                
                if((s1 >= 9) && (c1 < k) && (g == 1)) {
                    System.out.println(i+" 1");
                    c1++;
                } else if((s2 >= 9) && (c2 < k) && (g == 2)) {
                    System.out.println(i+ " 2");
                    c2++;
                } else if((s1 >= 9) && (c1 < k)) {
                    System.out.println(i+" 1");
                    c1++;
                } else if((s2 >= 9) && (c2 < k)) {
                    System.out.println(i+" 2");
                    c2++;
                } 
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    } 
}