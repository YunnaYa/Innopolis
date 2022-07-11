import java.util.Scanner;

public class StepikFriends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // кол - во друзей
        int t = sc.nextInt(); // стоимость кг чая
        int k = sc.nextInt(); // стоимость пирожного
        int n = sc.nextInt(); // кол - во пирожных
        System.out.print(x*((t / 100) + (k * n)));
    }
}
  //  Scanner sc = new Scanner(System.in);
  // int t = sc.nextInt();
//int s = sc.nextInt();
//  Systen.out.print(t*s)