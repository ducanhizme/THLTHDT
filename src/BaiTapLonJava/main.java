package BaiTapLonJava;


import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void menu() {
        System.out.println("--------------------------Menu---------------------\n" +
                          "|1.Nhập thông tin giảng viên sinh viên             |\n" +
                          "|2.In ra thông tin                                 |\n" +
                          "|3.Tìm thông tin theo tên                          |\n" +
                          "|4.Sắp xếp theo tên Giảng viên được khen thưởng    |\n" +
                          "|5.Sắp xếp theo tên Sinh viên được khen thưởng     |\n" +
                          "|6.Chỉnh sửa sinh viên                             |\n" +
                          "|7.Chỉnh sửa giảng viên                            |\n" +
                          "|8.Xóa thông tin                                   |\n" +
                          "|9.Ghi file                                        |\n" +
                          "|10.Đọc file                                       |\n" +
                          "|0.EXIT                                            |");
        System.out.println("---------------------------------------------------");
    }
    public static void drawLine(){
        System.out.println("----------------------------------------------------");
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        QuanLy ql = new QuanLy();
        String path = "";
        int choice;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    ql.input();
                    drawLine();
                    break;
                case 2:

                    int luaChon;
                    do {
                        System.out.println("In ra:\n" +
                                "1.In ra danh sách giảng viên sinh viên\n" +
                                "2.In ra từng giảng viên hoặc sinh viên\n" +
                                "3.In ra sinh viên được khen thưởng\n" +
                                "4.In ra giảng viên được khen thưởng\n" +
                                "0.EXIT");
                        System.out.println("Nhập lựa chọn in ra ");
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
                                break;
                            default:
                                System.out.println("Không có trong menu");
                        }
                    } while (luaChon != 0);
                    drawLine();
                    break;

                case 3:
                    System.out.println("Nhập tên bạn muốn tìm kiếm: ");
                    String name = new Scanner(System.in).nextLine();
                    ql.findByName(name);
                    drawLine();
                    break;
                case 4:
                    ql.sortGiangVienKhenThuong();
                    drawLine();
                    break;
                case 5:
                    ql.sortSinhVienKhenThuong();
                    drawLine();
                    break;
                case 6:
                    ql.editSinhVien();
                    drawLine();
                    break;
                case 7:
                    ql.editGiangVien();
                    drawLine();
                    break;
                case 8:
                    ql.xoa();
                    drawLine();
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
                    break;
                default:
                    System.out.println("Lựa chọn không có trong menu");
                    break;

            }
        } while (choice != 0);


    }
}
