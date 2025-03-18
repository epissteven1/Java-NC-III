package assigmentOperator_II;

public class combinedOperatorsN {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > 0 && b > 0) {
            a += b; // Add a and b and store the result in a
            b *= 2; // Multiply a by 2 and store the result in b
        }

        System.out.println("Final value of a: " + a);
        System.out.println("Final value of b: " + b);
    }
}
