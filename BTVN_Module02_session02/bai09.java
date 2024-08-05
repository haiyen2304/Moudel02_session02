package BTModule02_session02;

import java.util.Scanner;

public class bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=-1;
        float A;
        float B;
        while (choice!=0){
            System.out.println("menu gồm: ");
            System.out.println("1. tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. tính chu vi và diện tích hình tam giác");
            System.out.println("3. tính chu vi và diện tích hình tròn");
            System.out.println("0. thoát khỏi chương trình");
            System.out.println("hãy nhập lựa chọn của bạn vào");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("bạn lựa chọn 1. tính chu vi và diện tích hình chữ nhật");
                    System.out.println("hãy nhập chiều dài của hình chữ nhật");
                    float cndai= sc.nextFloat();
                    System.out.println("hãy nhập chiều rộng của hình chữ nhật");
                    float cnrong= sc.nextFloat();
                    A=(cndai+cnrong)*2;
                    System.out.println("chu vi hình chữ nhật là: "+A);
                    B=cndai*cnrong;
                    System.out.println("diện tích hình chữ nhật là: "+B);
                    break;
                case 2:
                    System.out.println("bạn lựa chọn 2. tính chu vi và diện tích hình tam giác");
                    int a = 0,b = 0,c = 0;
                    do {
                        System.out.println("hãy nhập 3 cạnh của tam giác");
                        System.out.println("nhập cạnh a của tam giác");
                        a = sc.nextInt();
                        System.out.println("nhập cạnh b của tam giác");
                        b = sc.nextInt();
                        System.out.println("nhập cạnh c của tam giác");
                        c = sc.nextInt();
                    } while (!(a+b>c && a+c>b && b+c>c));
                    float p= (float) (a+b+c)/2;
                    A=(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println("diện tich tam giác là : "+A);
                    B=(float)(a+b+c);
                    System.out.println("chu vi tam giác là: "+B);
                    break;
                case 3:
                    System.out.println("bạn lựa chọn 3. tính chu vi và diện tích hình tròn");
                    System.out.println("hãy nhập bán kính hình tròn");
                    double radius=sc.nextFloat();
                    double pi=Math.PI;
                    double chuvi= 2*pi*radius;
                    System.out.println("chu vi hình tròn là: "+chuvi);
                    double dientich=pi*radius*radius;
                    System.out.println("diện tích hình tròn là: "+dientich);
                    break;
                case 0:
                    System.out.println("bạn chọn 0, đã thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("!!!!!!!!!!!!hãy lựa chọn trong các lựa chọn trên");
            }
        }
        sc.close();

    }
}
