package Bai6;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy implements VAT {
    private List<Hang> dsh ;
    private File f;

    public QuanLy() {
        this.dsh = new ArrayList<>();
        this.f = new File("outfile.txt");
    }

    public void input() throws ParseException, IOException, ClassNotFoundException {
        int choice;
        do{
            System.out.println("Menu\n"+"1.Nhập hàng thực phẩm \n"+"2.Nhâp hàng sành sứ\n"+"3.Nhâp hàng điện máy\n"+"0.EXIT");
            System.out.println("Nhập vào lựa chọn muốn nhập : ");
            choice = new Scanner(System.in).nextInt();
            switch(choice){
                case 1:
                    if(f.exists()){
                        docFile();
                    }
                    HangThucPham htp = new HangThucPham();
                    htp.nhap();
                    this.dsh.add(htp);
                    ghiFile();
                    break;
                case 2:
                    if(f.exists()){
                        docFile();
                    }
                    HangSanhSu hss = new HangSanhSu();
                    hss.nhap();
                    this.dsh.add(hss);
                    ghiFile();
                    break;
                case 3:
                    if(f.exists()){
                        docFile();
                    }
                    HangDienMay hdm = new HangDienMay();
                    hdm.nhap();
                    this.dsh.add(hdm);
                    ghiFile();
                case 0:
                    return;
                default:
                    System.out.println("Không có lựa chọn này ");
            }

        }while(choice !=0);

    }

    public void in() throws IOException, ClassNotFoundException {
        docFile();
        this.dsh.forEach(e-> System.out.println(e.toString()));
    }

    public void inPhiVat(){
        for(Hang e : dsh){
            if(e instanceof HangThucPham){
                System.out.println(e.toString()+"Phí VAT: "+HANGTHUCPHAM);
            }
            if(e instanceof HangDienMay){
                System.out.println(e.toString()+"Phí VAT: "+HANGDIENMAY);
            }
            if(e instanceof HangSanhSu){
                System.out.println(e.toString()+"Phí VAT: "+HANGDIENMAY);
            }
        }
    }

    public  void ghiFile() throws IOException {
        FileOutputStream fout = new FileOutputStream(f,true);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(dsh);
        oos.close();
        fout.close();
    }

    public void docFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        this.dsh = new ArrayList<>();
        this.dsh = (ArrayList) ois.readObject();
        ois.close();
        fis.close();
    }
}
