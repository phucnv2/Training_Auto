package OOP;

public class NhanVienFullTime extends NhanVien {

    public NhanVienFullTime(String hoTen, String queQuan, int cccd) {
        super(hoTen, queQuan, cccd);
    }
    double thoiGianOT = 4;
    double banNgay = 1.5;
    double banDem = 2;
    @Override
    public double tinhLuong() {
        double luongTong = ((((luongNhanVienFullTime / ngayCong) / 8)* thoiGianOT * banNgay)+luongNhanVienFullTime);
        return luongTong;
    }
}
