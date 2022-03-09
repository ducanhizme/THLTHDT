package Bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyGiaoDich {
    private List<GiaoDich> gd;

    public QuanLyGiaoDich(){ this.gd = new ArrayList<>(); }

    public void insert(GiaoDich e){
        this.gd.add(e);
    }

    public void printList(){
        this.gd.forEach(System.out::println);
    }

    public Integer tinhTongGiaoDichVang(){
//        for(GiaoDich e  : gd){
//            String temp = String.valueOf(this.gd.getClass());
//            int sum =0;
//            if(temp.contains("GiaoDichVang")){
//                sum += this.gd.
//            }
//        }
        Integer sumGiaoDichVang =this.gd.stream().filter(e->e.getClass().equals("Class GiaoDichVang")).map(x->x.getSoLuong()).reduce(0,Integer::sum);
        return sumGiaoDichVang;
    }

    public Integer tinhTongGiaoDichTienTe(){
//        for(GiaoDich e  : gd){
//            String temp = String.valueOf(this.gd.getClass());
//            int sum =0;
//            if(temp.contains("GiaoDichVang")){
//                sum += this.gd.
//            }
//        }
        Integer sumGiaoDichTienTe =this.gd.stream().filter(e->e.getClass().equals("Class GiaoDichTienTe")).map(x->x.getSoLuong()).reduce(0,Integer::sum);
        return sumGiaoDichTienTe;
    }

    public int soLuongGiaoDichTienTe(){
        int count =0;
        int i =0;
        for(GiaoDich e  : gd){
            String temp = String.valueOf(this.gd.get(i).getClass());
            if(temp.contains("GiaoDichVang")){
               count++;
            }
            i++;
        }
        return count;
    }

    public List<GiaoDichTienTe> copyArrayList(){
        List<GiaoDichTienTe> gdtt = new ArrayList<>();
        int i =0;
        for(GiaoDich e  : gd){
            String temp = String.valueOf(e.getClass());
            if(temp.contains("GiaoDichVang")){
                Collections.copy(gd,gdtt);
            }
        }
        return gdtt;
    }

    public double tongThanhTienGiaoDichTienTe(){
        int i =0;
        double sum =0;
        List<GiaoDichTienTe> lgd = copyArrayList();
        for(GiaoDichTienTe e : lgd){
            sum += lgd.get(i).thanhTien();
        }
        i++;
        return sum;
    }
    public double trungBinhCongThanhTienCuaGiaoDichTienTe(){
       return tongThanhTienGiaoDichTienTe()/soLuongGiaoDichTienTe();
    }

    public void xuatDonGia1ty(){
        this.gd.stream().filter(e->e.getDonGia()>1000000000).forEach(System.out::println);
    }

}
