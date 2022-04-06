package Bai7;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        QuanLy ql = new QuanLy();
        int choice;
        do{
            System.out.println("Menu \n"+"1.Thêm \n"+"2.In\n"+"3.Tổng số lượng cho từng loại thuê phòng\n"+"4.Trung bình cộng thành tiền hóa đơn trong 09/2013\n"+"0.EXIT");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    ql.input();
                    break;
                case 2:
                    ql.in();
                    break;
                case 3:
                    ql.tongHoaDon();
                    break;
                case 4:
                    ql.tongTrungBinh();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Không có lựa chọn này : ");
            }
        }while(choice !=0);


    }
}
