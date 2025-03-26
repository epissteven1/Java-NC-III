package Arrays;

public class practice {
    int[] grades = { 85, 90, 78, 88, 92 };
    double average = 0.0;
    int Largest = grades[0];

    void calculateAverage() {
        for (int i = 0; i < grades.length; i++) {
            average += grades[i];
        }
        average /= grades.length;
        System.out.println("Average: " + average);
    }

    void findLargest() {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > Largest) {
                Largest = grades[i];
            }
        }
        System.out.println("Largest: " + Largest);
    }

    public static void main(String[] args) {
        practice obj = new practice();
        obj.calculateAverage();
        obj.findLargest();

    }

}
