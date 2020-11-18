import java.util.Scanner;
public class Alcohol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if(age > 17) {
            System.out.println("You can drink");
        } else { 
            System.out.println("You aren't allowed to drink");
        }
    }
}