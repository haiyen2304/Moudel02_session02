package BTModule02_session02;

import java.util.Scanner;

public class ThBai6 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. banh ngot");
            System.out.println("2. bánh man");
            System.out.println("3. bánh nướng");
            System.out.println("0. exit");
            System.out.println("hãy nhập số mà bạn chọn cho menu");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Banh ngot 5 sao");
                    break;
                case 2:
                    System.out.println("bánh mặn 4 sao");
                    break;
                case 3:
                    System.out.println("bánh nướng 3 sao");
                case 0:
                    break;
                default:
                    System.out.println("vui lòng hãy nhập lại");

            }
        }
    }
}
