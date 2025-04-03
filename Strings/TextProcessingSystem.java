package Strings;

import java.util.Scanner;

public class TextProcessingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String paragraph = scanner.nextLine();

        String[] words = paragraph.trim().split("\\s+");
        int wordCount = words.length;

        String modifiedParagraph = paragraph.trim().replaceAll("\\s+", " ").replace("Java", "Python");

        System.out.println("Word Count: " + wordCount);
        System.out.println("Modified Paragraph: " + modifiedParagraph);

        scanner.close();
    }
}
