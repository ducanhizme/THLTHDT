package BaiKiemTraCuoiKi;

import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1.Nhập vào cán bộ");
        System.out.println("2.Hiện thông tin danh sách cán bộ đã nhập");
        System.out.println("3.Giảng Viên cơ hữu");
        System.out.println("4.Cán bộ có lương cao nhất");
        System.out.println("5.Sắp xếp cán bộ theo lương giảm dần");
    }
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        int chon;
        do{
            menu();
            System.out.println("Nhập vào chức năng : ");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    ql.inPut();
                    break;
                case 2:
                    ql.hien();
                    break;
                case 3:
                    ql.hienGiangVienCoHuu();
                    break;
                case 4:
                    ql.luongMaxCanBo();
                    break;
                case 5:
                    ql.sapXep();
                    break;
                default:
                    System.out.println("Không có chức năng: ");
            }
        }while(chon !=0);
    }
}
