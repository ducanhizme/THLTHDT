package BaiTapLonJava;

import java.util.Scanner;

public class SinhVien extends Nguoi implements KhenThuong {
    private String maSinhVien;
    private String lopHC;
    private double gpa;
    private double diemrenluyen;

    public SinhVien(){}

    public SinhVien(String hoTen, String diaChi, int tuoi, boolean gioiTinh, String soDT, String maSinhVien, String lopHC, double gpa , double diemrenluyen) {
        super(hoTen, diaChi, tuoi, gioiTinh, soDT);
        this.maSinhVien = maSinhVien;
        this.lopHC = lopHC;
        this.gpa = gpa;
        this.diemrenluyen = diemrenluyen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getLopHC() {
        return lopHC;
    }

    public void setLopHC(String lopHC) {
        this.lopHC = lopHC;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getDiemrenluyen() {
        return diemrenluyen;
    }

    public void setDiemrenluyen(double diemrenluyen) {
        this.diemrenluyen = diemrenluyen;
    }

    //// TODO: 17/03/2022 Format lại toString để in ra thông tin ( Không phải hiện hàm hiện nữa )
    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", lopHC='" + lopHC + '\'' +
                ", gpa=" + gpa +'\''+ ", diemrenluyen="+diemrenluyen+
                "} " + super.toString();
    }

    @Override
    public boolean checkKhenThuong() {
        if(this.gpa >=3.2&&this.diemrenluyen>8)
            return true;
        else
            return false;

    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập vào mã sinh viên: ");
        this.maSinhVien = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào lớp hành chính: ");
        this.lopHC = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào GPA: ");
        this.gpa = new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào điểm rèn luyện :");
        this.diemrenluyen = new Scanner(System.in).nextDouble();

    }
}
