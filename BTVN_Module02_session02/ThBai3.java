package BTModule02_session02;

import java.util.Scanner;

public class ThBai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập so a");
        int a = sc.nextInt();
        System.out.println("nhập số b");
        int b = sc.nextInt();
        sc.close();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0){
            System.out.println("khong co UCLN");
        }
        while(a!=b){
            if(a>b){
                a=a-b;
                System.out.println("a=" + a);
            }else {
                b=b-a;
                System.out.println("b=" + b);
            }
        }
        System.out.println("UCLN la : "+a);
    }
}
