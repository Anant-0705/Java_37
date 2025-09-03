package Unit1;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z = 0;
        System.out.println("Enter the first two numbers");
        x = input.nextInt();
        y = input.nextInt();
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(z);
        }
    }
}