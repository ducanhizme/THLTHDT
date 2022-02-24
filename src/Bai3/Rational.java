package Bai3;

import java.util.Scanner;

public class Rational {
    private int tuSo;
    private int mauSo;

    public Rational() {
        tuSo = 0;
        mauSo = 1;
    }
    public Rational(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong duoc bang 0");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }
    public void enter() {
        int ts, ms;
        do {
            System.out.print("\tNhap vao tu so: ");
            ts = new Scanner(System.in).nextInt();
            System.out.print("\tNhap vao mau so: ");
            ms = new Scanner(System.in).nextInt();

            if (ms == 0) {
                System.out.println("Nhap lai thong tin cho phan so!");
            }
        } while (ms == 0);
        tuSo = ts;
        mauSo = ms;
    }
    public void display() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }

    public Rational add(Rational ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Rational(ts, ms);
    }

    public Rational sub(Rational ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Rational(ts, ms);
    }

    public Rational mul(Rational ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new Rational(ts, ms);
    }

    public void inverse(Rational ps) {
        int tg = ps.tuSo;
        ps.tuSo = ps.mauSo;
        ps.mauSo = tg;
        ps.display();
    }


    public Rational div(Rational ps2) {
        int tg = ps2.tuSo;
        ps2.tuSo = ps2.mauSo;
        ps2.mauSo = tg;
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new Rational(ts, ms);
    }

    public void reduce(Rational ps) {
        int a = ps.tuSo;
        int b = ps.mauSo;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        ps.tuSo /= b;
        ps.mauSo /= b;

        ps.display();

    }

    public Rational CompareRational(Rational ps1, Rational ps2) {
        int a= ps1.tuSo;
        int b = ps1.mauSo;
        int c = ps2.tuSo;
        int  d = ps2.mauSo;
        int e = a*d-b*c;
        return (e>0) ? ps1 : ps2;
    }

}