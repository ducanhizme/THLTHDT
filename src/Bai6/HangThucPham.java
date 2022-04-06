package Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham extends Hang  {
    private Date ngaySX;
    private Date ngayHetHan;
    private String nhaSX;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double giaTien, Date ngaySX, Date ngayHetHan, String nhaSX) {
        super(maHang, tenHang, soLuongTon, giaTien);
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaSX = nhaSX;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) throws ParseException {
        do{
            if(this.ngaySX.before(ngayHetHan)){
                this.ngayHetHan = ngayHetHan;
                break;
            }else{
                System.out.println("Ngày hết hạn phải sau ngày sản xuất: ");
                Date ngayHetHan1 = sdf.parse(new Scanner(System.in).nextLine());
                this.ngayHetHan = ngayHetHan1;
            }
        }while(this.ngaySX.before(ngayHetHan));
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    @Override
    public String toString() {
        try {
            return "HangThucPham{" +
                    "ngaySX=" + ngaySX +
                    ", ngayHetHan=" + ngayHetHan +
                    ", nhaSX='" + nhaSX + '\'' +
                    "} " + super.toString()+check();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập vào ngày sản xuất: (dd-mm-yyyy)");
        setNgaySX(sdf.parse(new Scanner(System.in).nextLine()));
        System.out.println("Nhập vào ngày hết hạn: (dd-mm-yyyy)");
        setNgayHetHan(sdf.parse(new Scanner(System.in).nextLine()));
        System.out.println("Nhập nhà sản xuất: ");
        setNhaSX(new Scanner(System.in).nextLine());

    }


    public String check() throws ParseException {
        Date dateNow = new Date();
        if (super.getSoLuongTon() > 0 && dateNow.after(this.ngayHetHan))
            return "Khó bán ";
        return " ";
    }
}
