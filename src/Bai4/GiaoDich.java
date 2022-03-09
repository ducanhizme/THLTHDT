package Bai4;

public class GiaoDich {
    private String maGiaoDich;
    private Ngay NgayGiaoDich;
    private float donGia;
    private int soLuong;

    public GiaoDich(String maGiaoDich, Ngay ngayGiaoDich, float donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        NgayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Ngay getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(Ngay ngayGiaoDich) {
        NgayGiaoDich = ngayGiaoDich;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", NgayGiaoDich=" + NgayGiaoDich +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }
}
