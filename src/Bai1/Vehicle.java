package Bai1;

public class Vehicle {
    private int giaTri;
    private int dungtich;
    public Vehicle(int giaTri, int dungtich) {
        super();
        this.giaTri = giaTri;
        this.dungtich = dungtich;
    }
    public int getGiaTri() {
        return giaTri;
    }
    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }
    public int getDungtich() {
        return dungtich;
    }
    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }
    @Override
    public String toString() {
        return "Vehicle [giaTri=" + giaTri + ", dungtich=" + dungtich + "]";
    }
    public double  tinhThue() {
        double thue=0;
        if(this.dungtich < 100) {
            thue = this.giaTri*1/100;
        }else if(this.dungtich >= 100 && this.dungtich <=200) {
            thue = this.giaTri * 3/100;
        }else if(this.dungtich > 200){
            thue = this.giaTri * 5/100;
        }
        return thue;

    }
}