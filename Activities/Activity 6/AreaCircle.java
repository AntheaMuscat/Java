import java.util.Scanner;
public class AreaCircle{
    public static void main(String[] args){
        /* Here a scanner object is created. An object is an instance (copy) of a class.
         * This has to be done in order to make use of the Scanner class since it is not static.
         * Scanner => class name
         * sc => name assigned to instance
         * new Scanner => syntax to create the instance
         * System.in => parameter
        */
        Scanner sc = new Scanner(System.in);
        
        double sum = 0;
        double radius = 5;
        double pi = 3.142;
        
        sum = radius * radius * pi;
        
        // Concatenation => When a string and a variable are joined by the addition operator
        System.out.print("The sum is " + sum);
    }
}
