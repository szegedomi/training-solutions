package stringscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringScanner {

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public int readAndSumValues(String intString, String delimiter) {
        try (Scanner scanner = new Scanner(intString)) {
            if (!isEmpty(delimiter)) {
                scanner.useDelimiter(delimiter);
            }
            return calculateWithScanner(scanner);
        }
    }

    public int readAndSumValues(String intString) {
        try (Scanner scanner = new Scanner(intString)) {
            return calculateWithScanner(scanner);
        }
    }

    private int calculateWithScanner(Scanner sc) {
        int sum = 0;
        try {
            while (sc.hasNext()) {
                sum += sc.nextInt();
            }
        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Incorrect parameter string!", ex);
        }
        return sum;
    }


    public String filterLinesWithWordOccurrences(String text, String word) {
        if (isEmpty(text) || word == null || "".equals(word)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        try (Scanner sc = new Scanner(text)) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(word)) {
                    sb.append(line);
                    sb.append("\n");
                }
            }
            return sb.toString().trim();
        }
    }


}