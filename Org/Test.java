package Org;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number a: ");
            int a = sc.nextInt();

            System.out.print("Enter the number b: ");
            int b = sc.nextInt();

            int addResult = a + b;
            System.out.println("Addition: a + b = " + addResult);

            int subResult = a - b;
            System.out.println("Subtraction: a - b = " + subResult);

            int mulResult = a * b;
            System.out.println("Multiplication: a + b = " + mulResult);

            if (b != 0) {
                double divResult = (double) a / b;
                System.out.println("Division: a / b = " + divResult);
            } else {
                System.out.println("Division: a / b = Cannot divide by zero");
            }
        }
    }
}



