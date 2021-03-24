import java.util.Arrays;

public class Methods {
    // Question 1
    public static double smallestNumber(double num1, double num2, double num3){
        double smallest;

        if (num1 < num2)
            smallest = num1;
        else
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;

        return smallest;
    }

    // Question 2
    public static double getAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Question 3
    public static String getMiddleCharacter(String word) {
        int wordLength = word.length();
        String middle = "";

        if (wordLength % 2 == 0) {
            middle += word.charAt((wordLength / 2) - 1);
            middle += word.charAt((wordLength / 2));
        }
        else
            middle += word.charAt((int) Math.ceil(wordLength/2.0) - 1);

        return middle;
    }

    // Question 4
    public static int countVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int numberOfVowels = 0;

        // array, nested for loop, counter
        for (int i = 0; i < word.length(); i++) {
            for (char vowel : vowels) {
                if (word.charAt(i) == vowel)
                    numberOfVowels++;
            }
        }

        return numberOfVowels;
    }

    // Question 5
    public static int getNumberOfWords(String sentence){
        int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i)))
                wordCount++;
        }
        return wordCount+1;
    }

    // Question 6 //
    public static double[] calculateCompoundInterest(double p, double r, double t) {
        int arraySize = (int) Math.ceil(t);
        double[] amounts = new double[arraySize];

        // a = p(1 + R/100)^ t//
        double compoundInterest = 0;

        for (int i = 0; i < arraySize; i++) {
            compoundInterest = p * Math.pow((1 + (r/100)), i);
            amounts[i] = compoundInterest;
        }
        return amounts;
    }

    // Main Method
    public static void main(String[] args) {
        // Question 1 //
        double smallest = smallestNumber(23234, 23332, 24);
        System.out.println(smallest);

        // Question 2 //
        double average = getAverage(25, 45, 65);
        System.out.println("Average for 25, 45, 65 is " + average);

        // Question 3 //
        String middle = getMiddleCharacter("anthea");
        System.out.println(middle);

        // Question 4 //
        int vowels = countVowels("anthea");
        System.out.println(vowels);

        // Question 5 //
        int wordCount = getNumberOfWords("The quick brown fox jumps over the lazy dog.");
        System.out.println(wordCount);

        // Question 6 //
        double[] cI = calculateCompoundInterest(1000, 10, 5);
        System.out.println("Years\tFutureValue");
        for (int i = 0; i < cI.length; i++)
            System.out.printf("%d\t%.2f\n", (i+1), cI[i]);
    }
}
