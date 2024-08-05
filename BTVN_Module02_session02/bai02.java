package BTModule02_session02;

import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" hãy nhập số bạn muốn kiểm tra");
        int n = sc.nextInt();
        sc.close();
        if(n%3==0&&n%5==0) {
            System.out.println(n+" chia hết cho cả 3 và 5");
        } else if (n%3==0) {
            System.out.println(n+" chia hết cho 3");
        } else if (n%5==0) {
            System.out.println(n+" chia hết cho 5");
        }else {
            System.out.println(n+" không cha hết cho 3 và 5");
        }
    }


}
