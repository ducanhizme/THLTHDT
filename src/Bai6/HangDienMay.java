package Bai6;

import java.text.ParseException;
import java.util.Scanner;

public class HangDienMay extends Hang {
    private int thangBH;
    private double soKW;

    public HangDienMay() {
    }

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double giaTien, int thangBH, double soKW) {
        super(maHang, tenHang, soLuongTon, giaTien);
        this.thangBH = thangBH;
        this.soKW = soKW;
    }

    public int getThangBH() {
        return thangBH;
    }

    public void setThangBH(int thangBH) {
        if(thangBH > 0){
            this.thangBH = thangBH;
        }else{
            System.out.println("Nhập sai tháng: ");
            this.thangBH = new Scanner(System.in).nextInt();
        }
    }

    public double getSoKW() {
        return soKW;
    }

    public void setSoKW(double soKW) {
        if(soKW >=0){
            this.soKW = soKW;
        }else{
            System.out.println("Nhập sai công suất: ");
            this.soKW = new Scanner(System.in).nextDouble();
        }
    }

    @Override
    public String toString() {
        return "HangDienMay{" +
                "thangBH=" + thangBH +
                ", soKW=" + soKW +
                "} " + super.toString()+check();
    }

    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập vào tháng bảo hành: ");
        setThangBH(new Scanner(System.in).nextInt());
        System.out.println("Nhập vào công suất: ");
        setSoKW(new Scanner(System.in).nextInt());
    }



    public String check() {
        if(super.getSoLuongTon() > 3)
            return "Bán được";
        return "";
    }
}
