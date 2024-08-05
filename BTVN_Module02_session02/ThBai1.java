package BTModule02_session02;

import java.util.Scanner;

public class ThBai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập cân nặng cua bạn");
        float weight= sc.nextFloat();
        System.out.println("hãy nhập chiều cao của bạn");
        float height = sc.nextFloat();
        sc.close();
        float bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        if(bmi < 18.5){
            System.out.println("Thiếu cân");
        }else if(bmi < 25){
            System.out.println("bình thường");
        }else if(bmi < 30){
            System.out.println("gần béo phì");
        }else{
            System.out.println("béo phì");
        }


    }
}
