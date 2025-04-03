package Strings;

public class StringDataProcessing {

    public static void main(String[] args) {
        int iterations = 100_000;
        String word = "Java";

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += word;
        }
        long endTime = System.currentTimeMillis();
        long stringTime = endTime - startTime;
        System.out.println("Appending 100,000 times using String took: " + stringTime + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(word);
        }
        endTime = System.currentTimeMillis();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Appending 100,000 times using StringBuilder took: " + stringBuilderTime + "ms");

        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(word);
        }
        endTime = System.currentTimeMillis();
        long stringBufferTime = endTime - startTime;
        System.out.println("Appending 100,000 times using StringBuffer took: " + stringBufferTime + "ms");

        String fastestMethod;
        if (stringTime < stringBuilderTime && stringTime < stringBufferTime) {
            fastestMethod = "String";
        } else if (stringBuilderTime < stringBufferTime) {
            fastestMethod = "StringBuilder";
        } else {
            fastestMethod = "StringBuffer";
        }
        System.out.println("Fastest method: " + fastestMethod);
    }
}
