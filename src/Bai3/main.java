package Bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction psTong;
        Fraction psThuong;

        // Nhap du lieu
        System.out.println("Nhap du lieu cho phan so 1:");
        ps1.enterFrac(sc);
        System.out.println("Nhap du lieu cho phan so 2:");
        ps2.enterFrac(sc);

        // Hien thi
        System.out.println("Phan so 1 vua nhap la:");
        ps1.display();
        System.out.println("Phan so 2 vua nhap la:");
        ps2.display();

        // Cong 2 phan so
        psTong = ps1.add(ps2);

        // Chia 2 phan so
        psThuong = ps1.div(ps2);

        // Hien thi
        System.out.println("Phan so tong la:");
        psTong.display();
        System.out.println("Thuong phan so la:");
        psThuong.display();


    }
}

