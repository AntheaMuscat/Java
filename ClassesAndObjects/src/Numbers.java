public class Numbers {
    public static double max(double[] numbers) {
        // Method 1
        double heighest = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > heighest)
                heighest = numbers[i];
        }

        return heighest;
    }

    public static int countEvenNumbers(double[] numbers) {
        int evenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
               evenNumbers++;
        }
        return evenNumbers;
    }

    public static double product(double[] numbers) {
        double ans = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) // index < array length
                ans *= (numbers[i + 1]); // multiplying next value in array
        }
        return ans;
    }
}
