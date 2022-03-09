package Bai4;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang(String maGiaoDich, Ngay ngayGiaoDich, float donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" +
                "loaiVang='" + loaiVang + '\'' +
                "} " + super.toString();
    }

    public float thanhTien(){
        return super.getSoLuong()*super.getDonGia();
    }
}
