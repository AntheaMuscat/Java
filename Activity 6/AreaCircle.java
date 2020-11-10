import java.util.Scanner;
public class AreaCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double sum = 0;
        double radius = 5;
        double pi = 3.142;
        
        sum = radius * radius * pi;
        System.out.print("The sum is " + sum);
    }
}