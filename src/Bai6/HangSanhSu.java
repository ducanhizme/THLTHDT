package Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HangSanhSu extends Hang {
    private String nhaSX;
    private Date ngayNhapKho;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public HangSanhSu() {
    }

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double giaTien, String nhaSX, Date ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, giaTien);
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public String toString() {
        try {
            return "HangSanhSu{" +
                    "nhaSX='" + nhaSX + '\'' +
                    ", ngayNhapKho=" + ngayNhapKho +
                    "} " + super.toString()+check();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập vào nhà sản xuất: ");
        setNhaSX(new Scanner(System.in).nextLine());
        System.out.println("Nhập vào ngày nhập kho: ");
        setNgayNhapKho(sdf.parse(new Scanner(System.in).nextLine()));
    }


    public String check() throws ParseException {
        Date now = new Date();
        long diff = now.getTime() - this.ngayNhapKho.getTime();
        TimeUnit time = TimeUnit.DAYS;
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        if(diffrence > 10 && super.getSoLuongTon() >50)
            return "Bán chậm ";

        return "";
    }
}
