package Bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyKhanhHang {
    private List<KhachHang> lkh;
    private int sum1 =0;
    private int sum2 =0;
    private int dem =0;
    private int sumThanhTien =0;
    public QuanLyKhanhHang() {
        this.lkh = new ArrayList<>();
    }

    public void inputKhachHangViet(){
        System.out.println("Nhập vào mã khách hàng:  ");
        String maKh = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào tên khách hàng: ");
        String tenKh = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào ngày ra hóa đơn: ");
        int ngay = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tháng ra hóa đơn: ");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("Nhâp vào năm ra hóa đơn: ");
        int nam = new Scanner(System.in).nextInt();
        Ngay ngayRaHoaDon = new Ngay(ngay,thang,nam);
        System.out.println("Nhập vào số lượng : ");
        double soLuong = new Scanner(System.in).nextDouble();
        System.out.println("Nhâp vào đơn giá: ");
        int donGia = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào định mức: ");
        int dinhMuc = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào loại khách hàng( 1:Sinh hoạt 2:Kinh Doanh 3:Sản xuất");
        int loaiKh = new Scanner(System.in).nextInt();
        KhachHangViet khv = new KhachHangViet(maKh,tenKh,ngayRaHoaDon,soLuong,donGia,dinhMuc,loaiKh);
        khv.thanhTien();
        sum1 += khv.getSoLuong();
        lkh.add(khv);
    }

    public void inputKhachHangNuocNgoai(){
        System.out.println("Nhập vào mã khách hàng:  ");
        String maKh = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào tên khách hàng: ");
        String tenKh = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào ngày ra hóa đơn: ");
        int ngay = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tháng ra hóa đơn: ");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("Nhâp vào năm ra hóa đơn: ");
        int nam = new Scanner(System.in).nextInt();
        Ngay ngayRaHoaDon = new Ngay(ngay,thang,nam);
        System.out.println("Nhập vào số lượng : ");
        double soLuong = new Scanner(System.in).nextDouble();
        System.out.println("Nhâp vào đơn giá: ");
        int donGia = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào quốc tịch");
        String quocTinh = new Scanner(System.in).nextLine();
        KhachHangNuocNgoai khnn = new KhachHangNuocNgoai(maKh,tenKh,ngayRaHoaDon,soLuong,donGia,quocTinh);
        khnn.thanhTien();
        sum2 += khnn.getSoLuong();
        sumThanhTien += khnn.getThanhTien();
        dem++;
        lkh.add(khnn);
    }

    public void print() {
        this.lkh.forEach(System.out::println);
    }

    public void tongSL(){
        System.out.println("Tổng số lượng của khách hàng Việt: "+ sum1);
        System.out.println("Tổng số lượng của khách hàng nước ngoài: "+ sum2);
    }

    public void tbc(){
        System.out.println("Trung bình thành tiền của người nước ngoài"+(sumThanhTien/dem));
    }

    public void hienThongTin(){
           for(KhachHang e : lkh){
               String temp = String.valueOf(e.getNgayRaHoaDon());
               if(temp.contains("Ngay{" +
                       ", thang=" + 9 +
                       ", nam=" + 2013+
                       '}')){
                   System.out.println(e.toString());
               }
           }
    }
}