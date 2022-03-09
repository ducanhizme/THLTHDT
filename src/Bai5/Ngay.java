package Bai5;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "Ngay{" +
                "ngay=" + ngay +
                ", thang=" + thang +
                ", nam=" + nam +
                '}';
    }
}
