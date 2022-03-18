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
        //// TODO: 19/03/2022 - Format hàm toString của 3 class nên thêm khảo sử dụng StringFormat cho đẹp như kiểu thành từng cột ấy :v
        // TODO: 19/03/2022  - Viết hàm đọc ghi file
        // TODO: 19/03/2022  - Viết class có chứa hàm main nhớ là nhìn hàm rồi viết menu nhé nhớ test qua đi xem có sai hàm nào không để tôi còn sửa luôn

    }
}
