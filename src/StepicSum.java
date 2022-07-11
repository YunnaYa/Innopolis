import javax.swing.*;
import java.util.Scanner;

public class StepicSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(((h-b-1) /(a-b))+ 1);



        }

    }

/* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(((a / 100) + ((a % 100)/10) + (a % 10)));
        /*
 */