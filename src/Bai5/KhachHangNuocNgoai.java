package Bai5;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachHangNuocNgoai(){}

    public KhachHangNuocNgoai(String maKh, String tenKh, Ngay ngayRaHoaDon, double soLuong, int donGia, String quocTich) {
        super(maKh, tenKh, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void thanhTien(){
        double ttien =0;
        ttien = super.getSoLuong()*super.getDonGia();
        super.setThanhTien(ttien);
    }
}
