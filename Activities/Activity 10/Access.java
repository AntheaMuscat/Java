import java.util.Scanner;
public class Access{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter password: ");
        int password = sc.nextInt();
        int rightPassword = 123456;
        
        if(password == rightPassword){
            System.out.print("Acces granted");
        } else {
            System.out.print("Access denied");
    }
  }
}