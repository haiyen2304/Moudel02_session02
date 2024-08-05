package BTModule02_session02;

import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập số đầu tiên");
        int a = sc.nextInt();
        System.out.println("hãy nhập số cuối cung");
        int b = sc.nextInt();
        sc.close();
        int sum=0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("tổng các số chẵn là : "+sum);

    }
}
