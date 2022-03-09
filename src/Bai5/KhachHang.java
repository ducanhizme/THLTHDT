package Bai5;

public class KhachHang {
    private String maKh;
    private String tenKh;
    private Ngay ngayRaHoaDon;
    private double soLuong;
    private int donGia;
    private double thanhTien;

    public KhachHang() {}

    public KhachHang(String maKh, String tenKh, Ngay ngayRaHoaDon, double soLuong, int donGia) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public Ngay getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(Ngay ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKh='" + maKh + '\'' +
                ", tenKh='" + tenKh + '\'' +
                ", ngayRaHoaDon=" + ngayRaHoaDon +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
