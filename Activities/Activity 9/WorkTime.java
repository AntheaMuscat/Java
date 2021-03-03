import java.util.Scanner;
public class WorkTime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter time worked: ");
        float timeWorked = sc.nextFloat();
        float hours = 0;
        
        if(timeWorked > 40) {
            hours = timeWorked - 40;
        } else {
            hours = timeWorked;
        }
        System.out.println(hours);
    }
}