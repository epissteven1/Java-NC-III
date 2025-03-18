package Assignment;

// This program demonstrates the use of the modulus operator in Java.
// It calculates the remainder of the division of two numbers and checks if one number is divisible by another.

public class modulusOperatorRDU {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int remainder = num1 % num2;
        System.out.println("Remainder of " + num1 + " divided by " + num2 + " is: " + remainder);

        int num3 = 15;
        int num4 = 5;
        if (num3 % num4 == 0) {
            System.out.println(num3 + " is divisible by " + num4);
        } else {
            System.out.println(num3 + " is not divisible by " + num4);
        }
    }
}
