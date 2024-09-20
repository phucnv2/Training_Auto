package OOP;

public abstract class NhanVien {
    protected String hoTen;
    protected String queQuan;
    protected int cccd;
    protected double luongNhanVienFullTime = 2100000; // 850$

    protected double ngayCong = 21;

    // constructer có đối số

    public NhanVien(String hoTen, String queQuan, int cccd) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.cccd = cccd;
    }

    // Phuong thuc
    public abstract double tinhLuong();
}
