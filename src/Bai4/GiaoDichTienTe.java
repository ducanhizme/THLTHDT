package Bai4;

public class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    private String loaiTien;

    public GiaoDichTienTe(String maGiaoDich, Ngay ngayGiaoDich, float donGia, int soLuong, double tiGia, String loaiTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" +
                "tiGia=" + tiGia +
                ", loaiTien='" + loaiTien + '\'' +
                "} " + super.toString();
    }

    public double thanhTien(){
        if(this.loaiTien.equalsIgnoreCase("usd")|| this.loaiTien.equalsIgnoreCase("euro"))
            return super.getSoLuong()*super.getDonGia()*this.tiGia;
        else if(this.loaiTien.equalsIgnoreCase("vn"))
            return super.getSoLuong()*super.getDonGia();
        return 0;
    }
}
