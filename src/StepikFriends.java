import java.util.Scanner;

public class StepikFriends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // ��� - �� ������
        int t = sc.nextInt(); // ��������� �� ���
        int k = sc.nextInt(); // ��������� ���������
        int n = sc.nextInt(); // ��� - �� ��������
        System.out.print(x*((t / 100) + (k * n)));
    }
}
  //  Scanner sc = new Scanner(System.in);
  // int t = sc.nextInt();
//int s = sc.nextInt();
//  Systen.out.print(t*s)