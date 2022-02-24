package Bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Rational ps1 = new Rational();
        Rational ps2 = new Rational();
        Rational psThuong;
        System.out.println("Nhap du lieu cho phan so 1:");
        ps1.enter();
        System.out.println("Nhap du lieu cho phan so 2:");
        ps2.enter();
        System.out.println("Phan so 1 vua nhap la:");
        ps1.display();
        System.out.println("Phan so 2 vua nhap la:");
        ps2.display();
        System.out.println("Toi gian phan so 1: ");
        ps1.reduce(ps1);
        System.out.println("Toi gian phan so 2:");
        ps2.reduce(ps2);
        System.out.println("Nghich dao phan so 1: ");
        ps1.inverse(ps1);
        System.out.println("Nghich dao phan so 2: ");
        ps2.inverse(ps2);
        Rational psTong = ps1.add(ps2);
        System.out.println("Phan so tong la:");
        psTong.display();
        Rational psHieu =ps1.sub(ps2);
        System.out.println("Phan so hieu la: ");
        psHieu.display();
        Rational psTich = ps1.mul(ps2);
        System.out.println("Tich phan so: ");
        psTich.display();
        System.out.println("Thuong phan so: ");
        psThuong = ps1.div(ps2);
        psThuong.display();
        Rational ss = new Rational();
        System.out.println("Phan so lon nhat la: ");
        Rational psSoSanh = ss.CompareRational(ps1, ps2);
        psSoSanh.display();

    }
}
