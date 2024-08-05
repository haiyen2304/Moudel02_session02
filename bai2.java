import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        //Bước 2: Khai báo biến tỷ giá (rate) để lưu giá trị tỷ giá
        // giữa VND và USD. Hiện nay, tỷ giá có thể là 23000 VND/USD.
       float rate = 23000.0f;
        System.out.println("Hiện nay, tỷ giá có thể là " +rate+" VND/USD.");

       // khởi tạo đối tượng sanner để đọc dữ liệu từ người dùng
        Scanner scanner=new Scanner(System.in);
        // in ra dòng yêu cầu người dùng nhập vào
        System.out.println("hãy nhập giá trị USD:");
        // đọc giá trọ USD từ người dùng và gán cho biến USD;
        float usd=scanner.nextFloat();
        // tính giá trị tương đương VND bằng cách nhân giá trị USD với tỉ giá `rate`
        float vnd= usd*rate;
        // in ra giá trị tương đuơng vnd
        System.out.println("giá trị VND tương đương là: "+vnd+"VND");




    }
}
