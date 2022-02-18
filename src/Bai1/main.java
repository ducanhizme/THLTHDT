package Bai1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    Vehicle dsxe = new Vehicle();
    public static void menu() {
        System.out.println("-----MENU-----");
        System.out.println("1.Nhập thông tin xe");
        System.out.println("2.Hiện thuế của từng xe");
        System.out.println("3.Thoát");
    }

    public static void nhap( ArrayList<Vehicle> dsxe) {
        System.out.println("Nhập vào giá trị xe " + " :");
        int giatri = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào dung tích của xe " + " :");
        int dungTich = new Scanner(System.in).nextInt();
        Vehicle xeN = new Vehicle(giatri, dungTich);
        dsxe.add(xeN);
    }

    public static void hien(ArrayList<Vehicle> dsxe){
        for(Vehicle info : dsxe){
            System.out.println("Thông tin thuế:" +
                    info.tinhThue());
        }
    }


    public static void main(String[] args) {
        ArrayList dsxe = new ArrayList<>();
        while (true) {
            menu();
            System.out.println("Moi ban chon: ");
            int chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                   nhap(dsxe);
                    break;
                case 2:
                    hien(dsxe);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhap sai,Moi ban nhap lai:");
            }
        }
    }
}

