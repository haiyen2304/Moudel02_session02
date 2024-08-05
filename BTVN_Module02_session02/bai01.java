package BTModule02_session02;

import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập số từ 1 đến 9");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("một");
            case 2:
                System.out.println("hai");
            case 3:
                System.out.println("ba");
            case 4:
                System.out.println("bốn");
            case 5:
                System.out.println("năm");
            case 6:
                System.out.println("sáu");
            case 7:
                System.out.println("bảy");
            case 8:
                System.out.println("tám");
            case 9:
                System.out.println("chín");
            default:
                System.out.println("không đúng, hãy nhập lại đúng yêu cầu");
        }


    }
}
