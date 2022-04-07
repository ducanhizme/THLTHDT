package Bai7;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuanLy {
    private List<HoaDon> dshd;
    private File f;

    public QuanLy() {
        this.dshd = new ArrayList<>();
        this.f = new File("outhoadon.txt");
    }

    public void input() throws ParseException, IOException, ClassNotFoundException {

        int choice ;
        do{
            System.out.println("Menu\n"+"1.Hóa đơn theo giờ\n"+"2.Hóa đơn theo ngày \n"+"0.EXIT");
            System.out.println("Nhập hóa đơn theo: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    if(f.exists()){
                        docFile();
                    }
                    HoaDonGIo hd = new HoaDonGIo();
                    hd.nhap();
                    this.dshd.add(hd);
                    ghiFile();
                    break;
                case 2:
                    HoaDonNgay hdn = new HoaDonNgay();
                    hdn.nhap();
                    this.dshd.add(hdn);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Không có lựa chọn hóa đơn này: ");
            }
        }while(choice !=0);
    }

    public void in(){
        this.dshd.forEach(System.out::println);
    }

    public void tongHoaDon(){
        int sum =0;
        int sum1 =0;
        for(HoaDon e : dshd){
            if(e instanceof HoaDonGIo)
                sum++;
            if(e instanceof HoaDonNgay)
                sum1++;
        }
        System.out.println("Số lượng hóa đơn theo giờ: "+ sum);
        System.out.println("Số lượng hóa đơn theo ngày: "+ sum1);
    }

    public void tongTrungBinh () throws ParseException, IOException, ClassNotFoundException {
        docFile();
        double sum =0;
        double sum1 =0;
        int dem =0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date temp = sdf.parse("1-09-2013");
        Date temp1 =sdf.parse("31-09-2013");
        for(HoaDon e : dshd) {
            if(temp.compareTo(e.getNgayHD()) < 0 && temp1.compareTo(e.getNgayHD()) > 0) {
                if(e instanceof HoaDonGIo) {
                    sum+= ((HoaDonGIo)e).thanhTien();
                    dem++;
                }else if(e instanceof HoaDonNgay) {
                    sum1 += ((HoaDonNgay)e).thanhTien();
                    dem++;
                }
            }

        }
        System.out.println(" Trung bình trong tháng 9/2013: "+ ((sum+sum1)/dem));

    }

    public  void ghiFile() throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.dshd);
        oos.close();
        fos.close();
    }

    public  void docFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        dshd = new ArrayList<>();
        dshd = (ArrayList) ois.readObject();
        ois.close();
        fis.close();
    }

}
