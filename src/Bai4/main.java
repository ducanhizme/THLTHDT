package Bai4;

import java.util.Scanner;

public class main {
    public static void menu(){
        System.out.println("----Menu----");
        System.out.println(
                "1.Nhập danh sách các giao dịch.\n" +
                "2.Tính tổng số lượng cho từng loại.\n" +
                "3.Tính trung bình thành tiền của giao dịch tiền tệ.\n" +
                "4.Xuất ra các giao dịch có đơn giá > 1 tỷ. \n" +"5.In danh sách\n"+"0.Exit");
    }
    public static  GiaoDich inputGiaoDichVang(){
        System.out.println("Nhập mã giao dịch: ");
        String maGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày giao dịch");
        int ngay = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tháng giao dịch: ");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào năm giao dịch: ");
        int nam = new Scanner(System.in).nextInt();
        Ngay ngayGiaoDich = new Ngay(ngay,thang,nam);
        System.out.println("Nhâp vào đơn giá: ");
        float donGia = new Scanner(System.in).nextFloat();
        System.out.println("Nhập vào số lương: ");
        int soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào loại vàng: ");
        String loaiVang = new Scanner(System.in).nextLine();
        return new GiaoDichVang( maGiaoDich,  ngayGiaoDich, donGia,  soLuong,  loaiVang);
    }

    public static GiaoDich inputGiaoDichTienTe(){
        System.out.println("Nhập mã giao dịch: ");
        String maGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày giao dịch");
        int ngay = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tháng giao dịch: ");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào năm giao dịch: ");
        int nam = new Scanner(System.in).nextInt();
        Ngay ngayGiaoDich = new Ngay(ngay,thang,nam);
        System.out.println("Nhâp vào đơn giá: ");
        float donGia = new Scanner(System.in).nextFloat();
        System.out.println("Nhập vào số lương: ");
        int soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tỷ giá: ");
        double tyGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào loại tiền: ");
        String loaiTien = new Scanner(System.in).nextLine();
        return   new GiaoDichTienTe( maGiaoDich, ngayGiaoDich, donGia, soLuong,tyGia, loaiTien);
    }

    public static void main(String[] args) {
        QuanLyGiaoDich ql = new QuanLyGiaoDich();
        menu();
        while(true){
            System.out.println("Nhập lựa chọn của bạn : ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập vào lựa chọn của bạn: ");
                    System.out.println("1.Giao dịch vàng \n"+ "2.Giao dịch tiền tệ \n"+"0.EXIT");
                    int luaChon = new Scanner(System.in).nextInt();
                        switch(luaChon){
                            case 1:
                                ql.insert(inputGiaoDichVang());
                                break;
                            case 2:
                                ql.insert(inputGiaoDichTienTe());
                                break;
                            default:
                                System.out.println("Mời bạn nhập lại: ");
                        }
                    break;
                case 2:
                    System.out.println("Tổng số lượng giao dịch tiền tệ: "+ ql.tinhTongGiaoDichTienTe());
                    System.out.println("Tổng số lượng giao dịch vàng : "+ ql.tinhTongGiaoDichVang());
                    break;
                case 3:
                    System.out.println("Trung bình thành tiền của giao dịch tiền tệ" );
                    ql.in();
                    break;
                case 4:
                    System.out.println("Giao dịch có đơn giá trên 1 tỷ: ");
                    ql.xuatDonGia1ty();
                    break;
                case 0:
                    return;
                case 5:
                    ql.printList();
                default:
                    System.out.println("Nhập sai");
            }
        }
    }
}
