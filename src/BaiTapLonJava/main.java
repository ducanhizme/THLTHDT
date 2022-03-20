package BaiTapLonJava;


import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void menu() {
        System.out.println("----Menu----\n" +
                "1.Nhập thông tin giảng viên sinh viên\n" +
                "2.In ra thông tin\n" +
                "3.Tìm thông tin theo tên\n" +
                "4.Sắp xếp thông tin Giảng viên được khen thưởng\n" +
                "5.Sắp xếp thông tin Sinh viên được khen thưởng\n" +
                "6.Chỉnh sửa sinh viên\n" +
                "7.Chỉnh sửa giảng viên\n" +
                "8.Xóa thông tin\n" +
                "9.Ghi file\n" +
                "10.Đọc file");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        QuanLy ql = new QuanLy();
        String path = "";
        while (true) {
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    ql.input();
                    break;
                case 2:
                    System.out.println("In ra:\n" +
                            "1.In ra danh sách giảng viên sinh viên\n" +
                            "2.In ra từng giảng viên hoặc sinh viên\n" +
                            "3.In ra sinh viên được khen thưởng\n" +
                            "4.In ra giảng viên được khen thưởng\n" +
                            "0.EXIT");
                    int luaChon;
                    do {
                        System.out.println("Nhập lựa chọn của bạn");
                        luaChon = new Scanner(System.in).nextInt();
                        switch (luaChon) {
                            case 1:
                                ql.printAllList();
                                break;
                            case 2:
                                ql.xuatTungThongTin();
                                break;
                            case 3:
                                ql.printKhenThuongSinhVien();
                                break;
                            case 4:
                                ql.printKhenThuongGiangVien();
                                break;
                            case 0:
                                System.out.println("Cảm ơn bạn đã nhâp ");
                            default:
                                System.out.println("Không có trong menu");
                        }
                    } while (luaChon != 0);
                    break;

                case 3:
                    System.out.println("Nhập tên bạn muốn tìm kiếm: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println(ql.findByName(name));
                    break;
                case 4:
                    ql.sortGiangVienKhenThuong();
                    break;
                case 5:
                    ql.sortSinhVienKhenThuong();
                    break;
                case 6:
                    ql.editSinhVien();
                    break;
                case 7:
                    ql.editGiangVien();
                    break;
                case 8:
                    ql.xoa();
                    break;
                case 9:
                    System.out.println("Nhập tên file bạn muốn lưu: ");
                    path = new Scanner(System.in).nextLine();
                    ql.luuFile(path);
                    break;
                case 10:
                    System.out.println("Đọc file" + path);
                    ql.docFile(path);
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã nhập");
                default:
                    System.out.println("Lựa chọn không có trong menu");

            }


        }
    }
}
