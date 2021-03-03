import javax.swing.*;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        for (int i = 0; i < 10; i++)
            System.out.println(names[i]);
    }
}