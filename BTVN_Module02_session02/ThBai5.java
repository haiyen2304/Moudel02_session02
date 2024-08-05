package BTModule02_session02;

import java.util.Scanner;

public class ThBai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập số bạn muốn kiểm tra");
        int number = sc.nextInt();
        boolean check =true;
        if(number<2){
            System.out.println("không phải số nguyên tố");
        }else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }

            if(check){
                System.out.println(number+" là số nguyên tố");
            }else {
                System.out.println(number+" không phải số nguyên to");
            }
        }


        sc.close();
    }
}
