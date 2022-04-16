package BaiKiemTraCuoiKi;

import java.io.Serializable;
import java.util.Scanner;

public class NhanVien extends CanBo implements Serializable {
    private String nv;
    private double hsl;
    private double mucPhuCap;


    public NhanVien() {}

    public NhanVien(String hoTen, String sdt, boolean gt, String nv, double hsl, double mucPhuCap) {
        super(hoTen, sdt, gt);
        this.nv = nv;
        this.hsl = hsl;
        this.mucPhuCap = mucPhuCap;
    }

    public String getNv() {
        return nv;
    }

    public void setNv(String nv) {
        this.nv = nv;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public double getMucPhuCap() {
        return mucPhuCap;
    }

    public void setMucPhuCap(double mucPhuCap) {
        this.mucPhuCap = mucPhuCap;
    }

    @Override
    public double tinhLuong(){
        return this.hsl*1300000 + this.mucPhuCap;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "nv='" + nv + '\'' +
                ", hsl=" + hsl +
                ", mucPhuCap=" + mucPhuCap +
                "} " + super.toString() + tinhLuong();
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập nhiệm vụ: ");
        this.nv = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào hệ số lương: ");
        this.hsl = new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào mức phụ cấp: ");
        this.mucPhuCap= new Scanner(System.in).nextDouble();
    }
}
