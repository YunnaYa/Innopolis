import java.util.Scanner;

public class StepikVallyRoad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = (t*x);
        System.out.print(t + (r/y));
    }
}
