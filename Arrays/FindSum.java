package Arrays;

public class FindSum {
    int[] numbers = { 5, 10, 15, 20, 25 };
    int sum = 0;

    void calculateSum() {
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        FindSum obj = new FindSum();
        obj.calculateSum();

    }
}
