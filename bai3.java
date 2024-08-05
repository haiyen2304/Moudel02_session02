import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("hãy nhập chiều dài vào: ");
        double dai= scanner.nextDouble();
        System.out.println("hãy nhập chiều rộng vào: ");
        double rong = scanner.nextDouble();
        double C=(dai+rong)*2;
        double S=dai*rong;
        System.out.println("chu vi của hình chữ nhật là: "+C+" m");
        System.out.println("diện tích của hình chữ nhật là: "+S+" m vuông");
    }
}
