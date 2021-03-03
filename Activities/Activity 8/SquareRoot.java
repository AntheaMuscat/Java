import java.util.Scanner;
public class SquareRoot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        double square = sc.nextInt();
        double root = Math.sqrt(square);
        
        System.out.print("The square root of " + square + " is: " + root);
    }
}
