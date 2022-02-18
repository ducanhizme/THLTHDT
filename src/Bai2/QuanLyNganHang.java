package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNganHang {
    private List<Account> ds ;
    public QuanLyNganHang(){
        this.ds = new ArrayList<>();
    }
    public void addAccount(Account e){
        this.ds.add(e);
    }

    public void printAccount(){
        this.ds.forEach(e->{
            System.out.println(e.toString());
        });
    }

    public void addMoney(String tentaikhoan){
        System.out.println("Nhâp số tiền muốn nạp: ");
        double tiennap  = new Scanner(System.in).nextDouble();
        int i =0;
        for(Account info : ds){
            if(ds.get(i).getTentk().equalsIgnoreCase(tentaikhoan)){
                        ds.get(i).naptien(tiennap);
            }
            i++;
        }
    }

    public void minusMoney(String tentaikhoan){
        System.out.println("Nhập số tiền bạn muốn rút: ");
        double tienrut = new Scanner(System.in).nextDouble();
        int i =0;
        for(Account info : ds){
            if(ds.get(i).getTentk().equalsIgnoreCase(tentaikhoan)){
                ds.get(i).rutTien(tienrut);
            }
            i++;
        }
    }

    public void transferMoney(){
        System.out.println("Nhâp tài khoản muốn chuyển tiền: ");
        Long taikhoanchuyentien = new Scanner(System.in).nextLong();
        int vitrichuyentien = ds.indexOf(taikhoanchuyentien);
        System.out.println("Nhập vào tài khoản muốn nhận tiền: ");
        Long taikhoannhantien = new Scanner(System.in).nextLong();
        int vitrinhantien = ds.indexOf(taikhoannhantien);
        System.out.println("Nhập vào số tiền bạn muốn chuyển: ");
        double tienchuyen = new Scanner(System.in).nextDouble();
        if(ds.get(vitrichuyentien).getTien()==tienchuyen){
            ds.get(vitrichuyentien).rutTien(tienchuyen);
            ds.get(vitrinhantien).naptien(tienchuyen);
        }
    }
}
