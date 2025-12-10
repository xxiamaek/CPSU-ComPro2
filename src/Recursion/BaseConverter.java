package Recursion;

import java.util.Scanner;

public class BaseConverter {
    String convertBase(int decimal, int base) {
        String result = "";
        while(decimal != 0) {
            result = ((decimal % base) + result);
            decimal = (decimal / base);
        }
        if(result == "") result = "0";
        return result;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            BaseConverter bc = new BaseConverter();
            int decimal = sc.nextInt();
            int base = sc.nextInt();

            String result = bc.convertBase(decimal, base);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    } 

}