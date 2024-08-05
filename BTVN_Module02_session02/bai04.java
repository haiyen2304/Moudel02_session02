package BTModule02_session02;

import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập điểm Toán");
        float toan = sc.nextFloat();
        System.out.println("hãy nhập điểm Ly");
        float ly = sc.nextFloat();
        System.out.println("hãy nhập điểm Hoa");
        float hoa = sc.nextFloat();
        System.out.println("hãy nhập điểm Văn");
        float van = sc.nextFloat();
        System.out.println("hãy nhập điểm Tiếng Anh");
        float anh = sc.nextFloat();
        sc.close();
        float TB=(toan+ly+hoa+van+anh)/5;
        System.out.println("điểm trung bình các môn là: "+TB);
        if(TB>=0&&TB<5){
            System.out.println(" Xếp loại yếu .");
        }else if(TB<6.5){
            System.out.println("Xếp loại trung bình.");
        } else if (TB<8) {
            System.out.println("Xếp loại khá");
        } else if (TB<9) {
            System.out.println("Xếp loại giỏi");
        }else {
            System.out.println("Xếp loại xuất sắc");
        }
    }
}
