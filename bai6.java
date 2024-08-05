import java.util.Scanner;

//Viết chương trình nhập từ bàn phím 3 số thực điểm Toán, Văn, Anh. Tính tổng điểm và điểm trung bình và in kết quả ra màn hình console (chính xác tới 2 số thập phân)
//Hướng dẫn :
//Bước 1: Tạo dự án mới và khai báo hàm main()
//Bước 2: Nhập điểm 3 môn Toán, Văn, Anh.
//Bước 3: Tính tổng điểm 3 môn và điểm trung bình
//Bước 4: In kết quả ra màn hình.
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hãy nhập điểm toán");
        double toan = scanner.nextDouble();
        System.out.println("nhập điểm văn");
        double van = scanner.nextDouble();
        System.out.println("nhập điểm Tiếng Anh");
        double anh = scanner.nextDouble();
        double sum=toan+van+anh;
        double tb=sum/3;
        System.out.printf("| %s | %.2f |\n","tổng điểm 3 môn là: ",sum);
        System.out.printf("| %s | %.2f |","điểm trung bình 3 môn là: ",tb);
    }
}
