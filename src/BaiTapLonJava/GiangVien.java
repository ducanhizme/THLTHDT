package BaiTapLonJava;

import java.util.Scanner;

public class GiangVien extends Nguoi implements KhenThuong {
    private String maGiaoVien;
    private String boMonPhuTrach;
    private String hocVi;
    private int soLuongCongTrinh;
    private int soLuongLopPhuTrach;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String diaChi, int tuoi, boolean gioiTinh, String soDT, String maGiaoVien, String boMonPhuTrach, String hocVi, int soLuongCongTrinh, int soLuongLopPhuTrach) {
        super(hoTen, diaChi, tuoi, gioiTinh, soDT);
        this.maGiaoVien = maGiaoVien;
        this.boMonPhuTrach = boMonPhuTrach;
        this.hocVi = hocVi;
        this.soLuongCongTrinh = soLuongCongTrinh;
        this.soLuongLopPhuTrach = soLuongLopPhuTrach;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getBoMonPhuTrach() {
        return boMonPhuTrach;
    }

    public void setBoMonPhuTrach(String boMonPhuTrach) {
        this.boMonPhuTrach = boMonPhuTrach;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public int getSoLuongCongTrinh() {
        return soLuongCongTrinh;
    }

    public void setSoLuongCongTrinh(int soLuongCongTrinh) {
        this.soLuongCongTrinh = soLuongCongTrinh;
    }

    public int getSoLuongLopPhuTrach() {
        return soLuongLopPhuTrach;
    }

    public void setSoLuongLopPhuTrach(int soLuongLopPhuTrach) {
        this.soLuongLopPhuTrach = soLuongLopPhuTrach;
    }

    //// TODO: 17/03/2022 Format lại toString để in ra thông tin ( Không phải hiện hàm hiện nữa )
    @Override
    public String toString() {
        return "GiangVien{" +
                "maGiaoVien='" + maGiaoVien + '\'' +
                ", boMonPhuTrach='" + boMonPhuTrach + '\'' +
                ", hocVi='" + hocVi + '\'' +
                ", soLuongCongTrinh=" + soLuongCongTrinh + '\'' +", soLuongLopPhuTrach="+soLuongLopPhuTrach+
                "} " + super.toString();
    }

    @Override
    public boolean checkKhenThuong() {
        if(this.soLuongCongTrinh > 3&&this.soLuongLopPhuTrach>8)
            return true;
        else
            return false;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập vào mã giảng viên:");
        this.maGiaoVien = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào bộ môn phụ trách: ");
        this.boMonPhuTrach = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào học vị : ");
        this.hocVi = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào số lương công trình: ");
        this.soLuongCongTrinh = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số lớp phụ trách: ");
        this.soLuongLopPhuTrach = new Scanner(System.in).nextInt();
    }

}
