package Bai7;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class HoaDonGIo extends HoaDon{
    private int gio;

    public HoaDonGIo() {
    }

    public HoaDonGIo(String maHD, Date ngayHD, String tenKH, String maP, double donGia, int gio) {
        super(maHD, ngayHD, tenKH, maP, donGia);
        this.gio = gio;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return "HoaDonGIo{" +
                "gio=" + gio +
                "} " + super.toString()+thanhTien();
    }

    public void nhap() throws ParseException {
        System.out.println("Nhập số giờ: ");
        int gio = new Scanner(System.in).nextInt();
        if(gio > 30){
            System.out.println("Chuyển sang hóa đơn theo ngày: ");
        }else {
            setGio(gio);
            super.nhap();
        }
    }

    public double thanhTien(){
        if(this.gio > 24 && this.gio < 30)
            return 24*super.getDonGia();
        else
            return this.gio*super.getDonGia();
    }
}
