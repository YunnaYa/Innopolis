import java.util.Scanner;

public class StepikVallyPassword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print((a % 10) + (b % 10) + (c % 10) + "vll");
    }
}