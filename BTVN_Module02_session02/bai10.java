package BTModule02_session02;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        sc.close();
        float p= (float) (a+b+c)/2;
        float A=(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("diện tich tam giác là : "+A);
        float B=(float)(a+b+c);
        System.out.println("chu vi tam giác là: "+B);


    }
}
// while ( true) thì sẽ đi lên