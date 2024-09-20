package OOP;

public class QLCTY {
    public static void main(String[] args) {
        NhanVienFullTime nhanvien = new NhanVienFullTime("Phuc", "NA", 12341);
        double nv = nhanvien.tinhLuong();
        System.out.println(nv);

        //interface
        System.out.println("----------");
        keThuaInterface inter = new keThuaInterface();
        double tinh = inter.tinhLuong(250,25);
        System.out.println(tinh);
    }
}
