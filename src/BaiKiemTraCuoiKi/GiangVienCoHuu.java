package BaiKiemTraCuoiKi;

import java.io.Serializable;
import java.util.Scanner;

public class GiangVienCoHuu extends CanBo implements Serializable {
    private double dinhMucThanhToan;
    private int soTiet;

    public GiangVienCoHuu() {}

    public GiangVienCoHuu(String hoTen, String sdt, boolean gt, double dinhMucThanhToan, int soTiet) {
        super(hoTen, sdt, gt);
        this.dinhMucThanhToan = dinhMucThanhToan;
        this.soTiet = soTiet;
    }

    public double getDinhMucThanhToan() {
        return dinhMucThanhToan;
    }

    public void setDinhMucThanhToan(double dinhMucThanhToan) {
        this.dinhMucThanhToan = dinhMucThanhToan;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    @Override
    public double tinhLuong(){
        return this.soTiet*this.dinhMucThanhToan;
    }

    @Override
    public String toString() {
        return "GiangVienCoHuu{" +
                "dinhMucThanhToan=" + dinhMucThanhToan +
                ", soTiet=" + soTiet +
                "} " + super.toString()+tinhLuong();
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập định mức thanh toán: ");
        this.dinhMucThanhToan = new Scanner(System.in).nextDouble();
        System.out.println("Nhập định mức số tiết: ");
        this.soTiet = new Scanner(System.in).nextInt();

    }
}
