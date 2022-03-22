package BaiTapLonJava;

import java.util.Objects;
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

    @Override
    public String toString() {
        return super.toString()+" Chức vụ : Sinh viên \t" +
                "Mã sinh viên: "+maSinhVien+"\t\t" +
                "Lớp hành chính: "+lopHC+"\t\t" +
                "GPA: "+gpa+"\t" +
                "Điểm rèn luyện: "+diemrenluyen+"\t";
    }

    @Override
    public boolean checkKhenThuong() {
        if(this.gpa >=3.2&&this.diemrenluyen>7)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Double.compare(sinhVien.gpa, gpa) == 0 && Double.compare(sinhVien.diemrenluyen, diemrenluyen) == 0 && Objects.equals(maSinhVien, sinhVien.maSinhVien) && Objects.equals(lopHC, sinhVien.lopHC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maSinhVien, lopHC, gpa, diemrenluyen);
    }
}
