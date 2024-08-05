package BTModule02_session02;

import java.util.Scanner;

public class bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=-1;
        int number=0;
        while (choice!=0){
            System.out.println("Menu gồm : ");
            System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. kiểm tra số nguyên tố");
            System.out.println("3.kiểm tra một số có chia hết cho 3 không?");
            System.out.println("0. thoát khỏi chương trình");
            System.out.println("chọn số trong menu ứng với phân kiểm tra mà bạn muốn");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("bạn chọn 1.Kiểm tra tính chẵn lẻ của 1 số");
                    System.out.println("hãy nhập số bạn muốn kiểm tra");
                    number=sc.nextInt();
                    if(number%2==0){
                        System.out.println(number+" là số chẵn");
                    }else {
                        System.out.println(number+" là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("bạn chọn 2. kiểm tra số nguyên tố");
                    System.out.println("hãy nhập số bạn muốn kiểm tra");
                    number=sc.nextInt();
                    boolean check=true;
                    if(number<=2){
                        check=false;
                        break;
                    }
                    for ( int i=2;i<=Math.sqrt(number);i++){
                        if(number%i==0){
                            check=false;
                            break;
                        }
                    }if(!check){
                    System.out.println(number+" không phải số nguyên tố");
                    }else {
                    System.out.println(number+" là số nguyên tố");
                }break;
                case 3:
                    System.out.println("bạn chọn 3.kiểm tra một số có chia hết cho 3 không?");
                    System.out.println("hãy nhập số bạn muốn kiểm tra");
                    number=sc.nextInt();
                    if(number%3==0){
                        System.out.println(number+" là số chia hết cho 3");
                    }else {
                        System.out.println(number+" là số không chia hết cho 3");
                    }
                    break;
                case 0:
                    System.out.println("bạn chọn 0, đã thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Nhập sai,vui lòng lựa chọn đúng số trong menu");
            }
        }sc.close();
    }
}
