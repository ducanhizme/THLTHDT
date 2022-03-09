package Bai5;

import java.util.Scanner;

public class main {

    public static void menu(){
        System.out.println("---Menu---");
        System.out.println("1.Nhập thông tin khách hàng nước ngoài");
        System.out.println("2.Nhập thông tin khách hàng việt");
        System.out.println("3.Tổng số lượng của từng khách hàng");
        System.out.println("4.Trung bình công thành tiền của khách hàng nước ngoài");
        System.out.println("5.Xuất ra các hóa đơn của 09 tháng 3 năm 2013");
        System.out.println("6.Hiện thong tin danh sách");
        System.out.println("0.EXIT");
    }

    public static void main(String[] args) {
        int choice;
        QuanLyKhanhHang qlkh  = new QuanLyKhanhHang();
        menu();
        while(true){
            System.out.println("Nhập vào lựa chọn của bạn: ");
            int chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    qlkh.inputKhachHangNuocNgoai();
                    break;
                case 2:
                    qlkh.inputKhachHangViet();
                    break;
                case 3:
                    qlkh.tongSL();
                    break;
                case 4:
                    qlkh.tbc();
                    break;
                case 5:
                    qlkh.hienThongTin();
                    break;
                case 0:
                    return ;
                case 6:
                    qlkh.print();
                default:
                    System.out.println("Nhập sai");

            }
        }
    }
}
