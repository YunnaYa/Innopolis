import java.util.Scanner;

public class Stepic1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int price = ((a * 100) + b);
        int n = sc.nextInt();
        int res = (price * n);

        System.out.print((res/100) +  " " + (res %100));
        //System.out.print(res %100);
    }
}

       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a+1) %2 ;
        int c = 0;
        System.out.print (b);

double a = sc.nextDouble();
        double b = sc.nextDouble();
        double price = (a + b / 100);
        int n = sc.nextInt();
        double res = (price * n);


    }
}
   /*    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resPer = (a * b);
        int resArea = ((a + b) * 2);
        System.out.println(resPer);
        System.out.print(resArea);*/


