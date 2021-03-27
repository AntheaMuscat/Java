import java.util.Arrays;

public class UsingNumbers {
    public static void main(String[] args) {
        double[] numbers = {3,6,9,15,12.3};
        double max = Numbers.max(numbers);
        int evenNums = Numbers.countEvenNumbers(numbers);

        String sArr = Arrays.toString(numbers);
        System.out.printf("Array => %s, Max => %.2f\n", sArr, max);
        System.out.printf("Array => %s, Even Numbers (Count) => %d\n\n", sArr, evenNums);

        double[] productArray = {5,4,3,2,1};
        double product = Numbers.product(productArray);

        System.out.println(product);
    }
}
