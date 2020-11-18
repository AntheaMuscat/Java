import java.util.Scanner;
public class InputArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input length: ");
        
        /* In the next line the length is being inputted by the user and stored in the variable length.
         * This is done by using the instance of the scanner class followed by the nextDouble() method.
         * A method is distinguished by the paranthesis "()" at the end of the method name.
        */
        double length = sc.nextDouble();
        
        System.out.print("Input breath: ");
        double breath = sc.nextDouble();
        
        double sum = length * breath;
        System.out.print("Length: " + length + "cm\nBreath: " + breath + "cm\nArea: " + sum + "sqr cm");
        
    }
}
