package BaiKiemTraCuoiKi;

import BaiTapLonJava.GiangVien;

import java.io.*;
import java.util.*;

public class QuanLy {
    private List<CanBo> dsCb;
    private File f;

    public QuanLy(){
        this.dsCb = new ArrayList<>();
        this.f = new File("DSCB.txt");
    }

    public void inPut(){
        if(f.exists())
            docFile();
        int chon;
        do{
            System.out.println("Nhập vào cán bộ: ");
            System.out.println("1.Nhân viên");
            System.out.println("2.Giảng Viên");
            System.out.println("0.EXIT");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            chon = new Scanner(System.in).nextInt();
            switch (chon){
                case 1:
                    NhanVien nv =  new NhanVien();
                    nv.nhap();
                    this.dsCb.add(nv);
                    break;
                case 2:
                    GiangVienCoHuu gv = new GiangVienCoHuu();
                    gv.nhap();
                    this.dsCb.add(gv);
                    break;
                default:
                    System.out.println("Không có chức năng: ");
            }
        }while (chon !=0);
        ghiFile();
    }



    public void hien(){
        if(f.exists()){
            docFile();
        }
        this.dsCb.forEach(System.out::println);
    }

    public void hienGiangVienCoHuu(){
        if(f.exists()){
            docFile();
        }
        for(CanBo e : dsCb){
            if(e instanceof GiangVienCoHuu){
                System.out.println(e);
            }
        }
    }

    public void hienNhanVien(){


        for(CanBo e : dsCb){
            if(e instanceof NhanVien){
                System.out.println(e);
            }
        }
    }

    public void luongMaxCanBo(){
        if(f.exists()){
            docFile();
        }
        CanBo cb = Collections.max(this.dsCb);
        System.out.println("Tên cán bộ có lương cao nhất: "+ cb.getHoTen());
        CanBo cb2 = this.dsCb.stream().max((o1,o2) -> Double.compare(o1.tinhLuong(),o2.tinhLuong())).get();
        System.out.println(cb2.getHoTen());
    }

    public void sapXep(){
        if(f.exists()){
            docFile();
        }
        // Sap xep theo ten (lam rieng )
        Comparator<CanBo> c1 = new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return 0;
            }
        };
        Comparator<CanBo> compare = Collections.reverseOrder(c1);
        Collections.sort(dsCb,compare);



        // Sap xep theo luong (lam gop)
        Collections.sort(this.dsCb, Collections.reverseOrder(new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return Double.compare(o1.tinhLuong(),o2.tinhLuong());
            }
        })) ;
        hien();
    }

    public void docFile(){
        dsCb = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream(f)){
            ObjectInputStream ois = new ObjectInputStream(fis);
            dsCb = (ArrayList) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public  void ghiFile() {
        try(FileOutputStream fos = new FileOutputStream(f)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsCb);
            fos.close();
            oos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
