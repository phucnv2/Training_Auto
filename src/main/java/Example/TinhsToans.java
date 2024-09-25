package Example;

public class TinhsToans {
public long soThuNhat;
public long soThuHai;
public long soThuBa;
public int age1 = 10;
public int age2 = 3;

    public TinhsToans(long soThuNhat, long soThuHai, long soThuBa) {
        this.soThuNhat = soThuNhat;
        this.soThuHai = soThuHai;
        this.soThuBa = soThuBa;
    }
    public long tinhTong(){
        long Tong = soThuNhat + soThuBa + soThuHai;
        return Tong;
    }
    public long tinhTich(){
        long Tich = soThuBa *10;
        return Tich;
    }
    public long tinhHieu(){
        long Hieu = soThuBa - soThuHai - soThuNhat;
        return Hieu;
    }
    public long tinhChia(){
        long Chia = soThuBa/soThuHai;
        return Chia;
    }

    public TinhsToans(int age2, int age1) {
        this.age2 = age2;
        this.age1 = age1;
    }

    public double convert(){
        double age3 = ((double) age1 / age2);
        return age3;
    }
}
