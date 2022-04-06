package Bai6;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        QuanLy ql = new QuanLy();
        int choice;
        do{
            System.out.println("Menu\n"+"1.Thêm hàng\n"+"2.In hàng\n"+"3.In VAT\n"+"0.EXIT");
            System.out.println("Nhập chức năng: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    ql.input();
                    break;
                case 2:
                    ql.in();
                    break;
                case 3:
                    ql.inPhiVat();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Không có chức năng này");
            }
        }while(choice !=0);


    }
}
