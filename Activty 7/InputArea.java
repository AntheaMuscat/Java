import java.util.Scanner;
public class InputArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input length: ");
        double length = sc.nextDouble();
        
        System.out.print("Input breath: ");
        double breath = sc.nextDouble();
        
        double sum = length * breath;
        System.out.print("Length: " + length + "cm\nBreath: " + breath + "cm\nArea: " + sum + "sqr cm");
        
    }
}