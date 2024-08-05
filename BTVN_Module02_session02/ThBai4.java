package BTModule02_session02;

import java.util.Scanner;

public class ThBai4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("số tiền gửi");
      float money = sc.nextFloat();
      System.out.println("tỉ lệ lãi suất");
      float ratio=sc.nextFloat();
      System.out.println("số tháng gửi");
      float month=sc.nextFloat();
      float interest=money*(ratio/100)/12*month;
      System.out.println("số tiền lai la"+interest);
      sc.close();
    }
}
