package Bai7;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class HoaDon implements Serializable {
    private String maHD;
    private Date ngayHD;
    private String tenKH;
    private String maP;
    private double donGia;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public HoaDon(){

    }

    public HoaDon(String maHD, Date ngayHD, String tenKH, String maP, double donGia) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKH = tenKH;
        this.maP = maP;
        this.donGia = donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHD='" + maHD + '\'' +
                ", ngayHD=" + ngayHD +
                ", tenKH='" + tenKH + '\'' +
                ", maP='" + maP + '\'' +
                ", donGia=" + donGia +
                '}';
    }

    public void nhap() throws ParseException {
        System.out.println("Nhập vào mã hóa đơn: ");
        this.maHD = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào ngày hóa đơn: ");
        this.ngayHD = sdf.parse(new Scanner(System.in).nextLine());
        System.out.println("Nhập vào tên khách hàng: ");
        this.tenKH = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào mã phòng: ");
        this.maP = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextDouble();
    }
}
