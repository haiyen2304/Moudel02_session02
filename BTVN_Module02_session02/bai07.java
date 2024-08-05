package BTModule02_session02;

import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập số bạn muốn kiểm tra");
        int number = sc.nextInt();
        sc.close();


        int count = 0;
        while (count <20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number%i==0){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
                System.out.println(number+" là số nguyên tố");
            }
            number++;
        }
    }
}
