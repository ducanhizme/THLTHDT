package BaiTapLonJava;



public class main {
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        ql.input();
        System.out.println("----");
        ql.printAllList();
        System.out.println("----");
        ql.printKhenThuongGiangVien();
        System.out.println("-----");
        ql.printKhenThuongSinhVien();
        Nguoi  temp = ql.findByName("v");
        System.out.println(temp);

    }
}
