package BaiKiemTraCuoiKi;

import java.io.Serializable;
import java.util.Scanner;

public class CanBo implements Serializable,Comparable<CanBo> {
    private String hoTen;
    private String sdt;
    private boolean gt;
    public CanBo() {}

    @Override
    public int compareTo(CanBo o) {
        if (this.tinhLuong() > o.tinhLuong()) {
            return 1;
        } else if (this.tinhLuong() < o.tinhLuong()) {
            return -1;
        }
        return 0;
    }

    public CanBo(String hoTen, String sdt, boolean gt) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.gt = gt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public  double tinhLuong(){
        return 0;
    }

    @Override
    public String toString() {
        String temp = null;
        if(this.gt)
            temp ="Nam";
        else
            temp = "Nữ";
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", sdt='" + sdt + '\'' +
                ", gt=" + temp +
                '}';
    }

    public void nhap(){
        System.out.println("Nhập họ và tên: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập giới tính: (1:Nam 2:Nữ");
        int gioiTinh = new Scanner(System.in).nextInt();
        if(gioiTinh ==1){
            this.gt = true;
        }else {
            this.gt = false;
        }
        System.out.println("Nhập vào số điện thoại: ");
        this.sdt = new Scanner(System.in).nextLine();
    }
}
