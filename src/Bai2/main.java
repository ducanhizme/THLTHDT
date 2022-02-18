package Bai2;

import java.util.Scanner;

public class main {
    public static void menu(){
        System.out.println("---Menu---");
        System.out.println("1.Nhập thông tin tài khoản");
        System.out.println("2.Nạp tiền");
        System.out.println("3.Rút tiền");
        System.out.println("4.Chuyển tiền");
    }

    public static void main(String[] args) {
        QuanLyNganHang  qlnh = new QuanLyNganHang();
        menu();
        while(true){
            System.out.println("Nhập vào lựa chọn của bạn: ");
            int lc = new Scanner(System.in).nextInt();
            switch(lc) {
                case 1:
                    System.out.println("Nhập vào tên tài khoản: ");
                    String tentk = new Scanner(System.in).nextLine();
                    System.out.println("Nhập vào số tài khoản: ");
                    long stk = new Scanner(System.in).nextLong();
                    Account tk = new Account(stk, tentk);
                    qlnh.addAccount(tk);
                    break;
                case 2:
                    System.out.println("Nhập vào tên tài khoản muốn nạp tiền: ");
                    String tentknap = new Scanner(System.in).nextLine();
                    qlnh.addMoney(tentknap);
                    qlnh.printAccount();
                    break;
                case 3:
                    System.out.println("Nhập vào tên tài khoản muốn rút tiền: ");
                    String tentkrut = new Scanner(System.in).nextLine();
                    System.out.println("Nhập số tiền bạn muốn rút: ");
                    double tienrut = new Scanner(System.in).nextDouble();
                    qlnh.minusMoney(tentkrut,tienrut);
                    qlnh.printAccount();
                    break;
                case 4:
                    qlnh.transferMoney();
                    qlnh.printAccount();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Moi ban nhap lai: ");
                    continue;
            }
        }
    }
}
