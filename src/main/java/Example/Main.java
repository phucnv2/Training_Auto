package Example;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TinhsToans tinhtoan = new TinhsToans(1234567890, 1234567890, 1934567890077l);
        long cong = tinhtoan.tinhTong();
        System.out.println("Tổng ba số là: "+cong);
        long tich = tinhtoan.tinhTich();
        System.out.println("Tích nhân với 10 là: "+tich);
        long hieu = tinhtoan.tinhHieu();
        System.out.println("Hiệu ba số là: "+hieu);
        long chia = tinhtoan.tinhChia();
        System.out.println("Thương của phép toán là: "+chia);

        TinhsToans tt = new TinhsToans(10,3);
        double ttt = tt.convert();
        System.out.println(ttt);
    }
}
