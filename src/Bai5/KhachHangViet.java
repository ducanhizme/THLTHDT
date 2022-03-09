package Bai5;

public class KhachHangViet extends KhachHang{
    private int dinhMuc;
    private int loaiKh;

    public KhachHangViet() {}

    public KhachHangViet(String maKh, String tenKh, Ngay ngayRaHoaDon, double soLuong, int donGia, int dinhMuc, int loaiKh) {
        super(maKh, tenKh, ngayRaHoaDon, soLuong, donGia);
        this.dinhMuc = dinhMuc;
        this.loaiKh = loaiKh;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public int getLoaiKh() {
        return loaiKh;
    }

    public void setLoaiKh(int loaiKh) {
        this.loaiKh = loaiKh;
    }

    public void thanhTien(){
        double ttien =0;
        if(super.getSoLuong() <= this.dinhMuc) {
             ttien = super.getDonGia() * super.getSoLuong();
            super.setThanhTien(ttien);
        }else {
           ttien = this.dinhMuc * super.getDonGia() +  (super.getSoLuong()-this.dinhMuc)*super.getDonGia()*2.5;
           super.setThanhTien(ttien);
        }
    }

    @Override
    public String toString() {
        String temp="";
        if(this.loaiKh == 1)
            temp ="Sinh hoạt";
        else if(this.loaiKh == 2)
            temp ="Kinh Doanh";
        else if(this.loaiKh == 3)
            temp ="Sản xuất";

        return "KhachHangViet{" +
                "dinhMuc=" + dinhMuc +
                ", loaiKh=" + temp +
                "} " + super.toString();
    }
}
