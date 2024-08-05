package BTModule02_session02;

import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm số nguyên dương nhỏ nhất chia hết cho 5,7 và 11");
        int N=1;
        while(!(N%5==0&&N%7==0&&N%11==0))  {
            N++;
            if(N%5==0&&N%7==0&&N%11==0) {
                System.out.println("số bạn cần tìm là: "+N);
            }
        }
    }
}
