package Bai2;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long stk;
    private String tentk;
    private double tien;
     final double  laisuat = 0.035;

    public Account(){
    }

    public Account(long stk, String tentk) {
        this.stk = stk;
        this.tentk = tentk;
        this.tien = 50;
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    @Override
    public String toString() {
        Locale vietnam = new Locale("vi","VN");
        NumberFormat nf = NumberFormat.getInstance(vietnam);
        String tienf = nf.format(this.tien);

        return "Account{" +
                "stk=" + stk +
                ", tentk='" + tentk + '\'' +
                ", tien=" + tienf +
                '}';
    }

    public double naptien(double tiennap){
        return this.tien + tiennap;
    }
    public double rutTien(double tienRut) {
        int phiRutTien =2000;
        this.tien= this.tien - (tienRut+phiRutTien);
        return this.tien;
    }
    public double daoHan() {
        this.tien = this.tien +this.tien* laisuat;
        return this.tien;
    }
}
