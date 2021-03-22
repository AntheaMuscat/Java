public class Methods {
    public static double getAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

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

    public static void main(String[] args) {
//        double average = getAverage(25, 45, 65);
//        System.out.println("Average for 25, 45, 65 is " + average);
//
//        String middle = getMiddleCharacter("anthea");
//        System.out.println(middle);

        System.out.println(countVowels("anthea"));
    }
}
