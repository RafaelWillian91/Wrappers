package Wrappers.app1.WrappersExercises02;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = formates();

        System.out.println("Octal=> " + Integer.toOctalString(a));
        System.out.println("Binary => " + Integer.toBinaryString(a));
        System.out.println("HexaDecimal => " + Integer.toHexString(a));



    }

    private static int formates() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Number: ");
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {

            }

        }


    }
}
