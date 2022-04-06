package Bai7;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class HoaDonNgay extends HoaDon {
    private int soNgay;

    public HoaDonNgay() {
    }

    public HoaDonNgay(String maHD, Date ngayHD, String tenKH, String maP, double donGia, int soNgay) {
        super(maHD, ngayHD, tenKH, maP, donGia);
        this.soNgay = soNgay;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return "HoaDonNgay{" +
                "soNgay=" + soNgay +
                "} " + super.toString();
    }

    public void nhap() throws ParseException {
        System.out.println("Nhập vào số ngày: ");
        this.soNgay = new Scanner(System.in).nextInt();
        super.nhap();
    }

    public double thanhTien(){
        if(this.soNgay > 7)
            return this.soNgay * super.getDonGia()*0.2;
        else
            return this.soNgay * super.getDonGia();
    }


}
