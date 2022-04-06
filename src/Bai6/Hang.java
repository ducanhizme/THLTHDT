package Bai6;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Scanner;

public abstract class Hang implements Serializable {
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private double giaTien;

    public Hang() {}

    public Hang(String maHang, String tenHang, int soLuongTon, double giaTien) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.giaTien = giaTien;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        do{
            if(soLuongTon >=0){
                this.soLuongTon = soLuongTon;
                break;
            }else{
                System.out.println("Số lượng hàng tồn không được bé hơn 0");
                soLuongTon = new Scanner(System.in).nextInt();
                this.soLuongTon = soLuongTon;
            }
        }while(soLuongTon >=0);

    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
//       if(giaTien > 0){
//           this.giaTien = giaTien;
//       }else{
//           System.out.println("Giá tiền không được bé hơn 0: ");
//           this.giaTien = new Scanner(System.in).nextDouble();
//       }
        do{
            if(giaTien >=0){
                this.giaTien = giaTien;
                break;
            }else{
                System.out.println("Giá tiền không được bé hơn 0");
                giaTien = new Scanner(System.in).nextInt();
                this.giaTien = giaTien;
            }
        }while(soLuongTon >=0);
    }

    @Override
    public String toString() {
        return "Hang{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soLuongTon=" + soLuongTon +
                ", giaTien=" + giaTien +
                '}';
    }

    public void  nhap() throws ParseException {
        System.out.println("Nhập vào mã hàng: ");
        setMaHang(new Scanner(System.in).nextLine());
        System.out.println("Nhập vào tên hàng: ");
        setTenHang(new Scanner(System.in).nextLine());
        System.out.println("Nhập số lượng tồn: ");
        setSoLuongTon(new Scanner(System.in).nextInt());
        System.out.println("Nhập giá tiền: ");
        setGiaTien(new Scanner(System.in).nextDouble());
    }
}
