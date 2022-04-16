package BaiTapLonJava;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Nguoi implements Serializable {
    private String hoTen;
    private String diaChi;
    private int tuoi;
    private boolean gioiTinh;
    private String soDT;

    public Nguoi() {}

    public Nguoi(String hoTen, String diaChi, int tuoi, boolean gioiTinh, String soDT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    @Override
    public String toString() {
        String temp = "";
        if (this.gioiTinh == true)
            temp = "Nam";
        else if (this.gioiTinh == false)
            temp = "Nữ";
        return "\n" +
                "Họ và tên: "+hoTen+"\t\t" +
                "Địa chỉ: "+diaChi+"\t\t" +
                "Tuổi: "+tuoi+"\t" +
                "Giới tính: "+temp +"\t" +
                "SDT: "+soDT +"\t\t";
    }


    public void nhap(){
        System.out.println("Nhập vào tên :");
        this.hoTen=new Scanner(System.in).nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        this.diaChi = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào tuổi:  ");
        this.tuoi= new Scanner(System.in).nextInt();
        System.out.println("Nhập vào giới tính(1:Nam/2:Nữ) : ");
        int gioiTinh = new Scanner(System.in).nextInt();
        if(gioiTinh == 1){
            this.gioiTinh = true;
        }else if(gioiTinh ==2){
            this.gioiTinh = false;
        }
        System.out.println("Nhâp vào số điện thoại: ");
        this.soDT = new Scanner(System.in).nextLine();
    }


}
