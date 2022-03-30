package BaiTapLonJava;

import java.io.*;
import java.util.*;

public class QuanLy {
    private List<Nguoi> listNguoi;
    private int type;
    private List<GiangVien> lgvKT;
    private List<SinhVien> lsvKT;

    public QuanLy(){
        this.listNguoi = new ArrayList<>();
        this.lgvKT = new ArrayList<GiangVien>();
        this.lsvKT = new ArrayList<SinhVien>();

    }

    public void input(){

        int chon;
        do{
            System.out.println("-----Menu-----");
            System.out.println("1.Giảng Viên");
            System.out.println("2.Sinh viên");
            System.out.println("0.EXIT");
            System.out.println("Nhập vào lựa chọn muốn nhập: ");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    System.out.println("Nhập vào số giảng viên muốn xét khen thưởng");
                    int n = new Scanner(System.in).nextInt();
                    for (int i = 0; i <n ; i++) {
                        GiangVien gv = new GiangVien();
                        System.out.println("-Nhập thông tin giảng viên thứ "+(i+1));
                        gv.nhap();
                        this.listNguoi.add(gv);
                        if(gv.checkKhenThuong())
                            this.lgvKT.add(gv);
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào số sinh viên muốn xét khen thưởng");
                    int m = new Scanner(System.in).nextInt();
                    for (int i = 0; i < m ; i++) {
                        SinhVien sv = new SinhVien();
                        System.out.println("-Nhập thông tin sinh viên thứ "+(i+1));
                        sv.nhap();
                        this.listNguoi.add(sv);
                        if(sv.checkKhenThuong())
                            this.lsvKT.add(sv);
                    }
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã nhập");
                    break;
                default:
                    System.out.println("Không có trong menu");
            }
        }while(chon!=0);
    }

    public void printAllList(){
        for(Nguoi nguoi : listNguoi){
            System.out.println("STT : " + (listNguoi.indexOf(nguoi)+1) + nguoi) ;
        }
    }
    public void xuatTungThongTin(){
        int chon;
        do{
            System.out.println("-----Menu-----");
            System.out.println("1.In ra thông tin giảng viên");
            System.out.println("2.In ra thông tin sinh viên");
            System.out.println("0.Exit");
            System.out.println("Nhập vào lựa chọn của bạn");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:{
                    for(Nguoi nguoi : listNguoi){
                        if(nguoi instanceof GiangVien)
                            System.out.println(nguoi);
                    }
                    break;
                }
                case 2:{
                    for(Nguoi nguoi : listNguoi){
                        if(nguoi instanceof SinhVien)
                            System.out.println(nguoi);
                    }
                    break;
                }
            }
        }while (chon !=0);

    }

//    public List<Nguoi> xuatTungThongTin(int type){
//        return this.listNguoi.stream().filter(e->{
//            if(type ==2)
//                return e instanceof SinhVien;
//            if(type == 1)
//                return e instanceof GiangVien;
//            return false;
//        }).collect(Collectors.toList());
//    }


    public void printKhenThuongSinhVien(){
//        this.lsvKT.forEach(System.out::println);
        if(lsvKT.isEmpty()){
            System.out.println("Không có sinh viên nào được xét thưởng: ");
        }else{
            for(SinhVien sv : lsvKT){
                System.out.println(sv);
            }
        }

    }

    public void printKhenThuongGiangVien(){
//        this.lgvKT.forEach(System.out::println);
        if (lgvKT.isEmpty()) {
            System.out.println("Không có sinh viên nào được xét thưởng");
        } else {
            for(GiangVien gv : lgvKT){
                System.out.println(gv);
            }
        }
    }

    public void findByName(String name) {
        System.out.println("---Menu---");
        System.out.println("1.Sinh Viên");
        System.out.println("2.Giảng Viên");
        System.out.println("0.Exit");
        int test=0;
        this.type = new Scanner(System.in).nextInt();
        switch(this.type){
            case 1 : {
                for(Nguoi nguoi : listNguoi){
                    if(nguoi instanceof SinhVien){
                        if(nguoi.getHoTen().equalsIgnoreCase(name)){
                            test=1;
                            System.out.println("Thông tin sinh viên cần tìm là : ");
                            System.out.println(nguoi);
                        }
                    }
                }
                break;
            }
            case 2 : {
                for(Nguoi nguoi : listNguoi){
                    if(nguoi instanceof GiangVien){
                        if(nguoi.getHoTen().equalsIgnoreCase(name)){
                            test=1;
                            System.out.println("Thông tin giảng viên cần tìm là : ");
                            System.out.println(nguoi);
                        }
                    }
                }
                break;
            }
            case 0:
                System.out.println("Cảm ơn bạn đã nhập ");
                break;
            default:{
                System.out.println("Không có trong menu, hãy nhập lại ");
                break;
            }
        }
        if(test==0)
            System.out.println("Tên không có trong danh sách đã nhập");

//        return this.listNguoi.stream().filter(e -> {
//            if(this.type ==1){
//                if(e instanceof SinhVien){
//                    if(e.getHoTen().equalsIgnoreCase(name)){
//                        return true;
//                    }
//                    return false;
//                }
//            }
//            if(this.type ==2) {
//                if (e instanceof GiangVien) {
//                    if (e.getHoTen().equalsIgnoreCase(name)) {
//                        return true;
//                    }
//                    return false;
//                }
//            }
//            return false;
//
//        }).findFirst().orElse(null);
    }

    public void sortSinhVienKhenThuong(){
        Collections.sort(this.lsvKT, new Comparator<SinhVien>() {
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        System.out.println("Sắp xếp thành công : ");
        printKhenThuongSinhVien();
    }

    public void sortGiangVienKhenThuong(){
        Collections.sort(this.lgvKT, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        System.out.println("Sắp xếp thành công : ");
        printKhenThuongGiangVien();
    }

    public void editSinhVien(){
        for(Nguoi e : listNguoi){
            if (e instanceof SinhVien){
                System.out.println("STT : " + (listNguoi.indexOf(e)+1)+" "+e.toString());
            }
        }
        System.out.println("Nhập thứ tự của sinh viên bạn muốn sửa: ");
        int chon = new Scanner(System.in).nextInt();
        chon--;
        int chonSua;
        do {
            System.out.println("-----Menu----");
            System.out.println("1.Sửa tên");
            System.out.println("2.Sửa địa chỉ ");
            System.out.println("3.Sửa tuổi\n" +
                    "4Sửa giới tính \n" +
                    "5.Sửa số điện thoại\n" +
                    "6.Sửa mã sinh viên \n" +
                    "7.Sửa lớp hành chính\n" +
                    "8.Sửa gpa \n" +
                    "9.Sửa điểm rèn luyện\n" +
                    "0.Exit");
            System.out.println("Bạn muốn sửa: ");
            chonSua = new Scanner(System.in).nextInt();
            switch(chonSua){
                case 1:
                    System.out.println("Nhập tên bạn muốn sửa: ");
                    String name = new Scanner(System.in).nextLine();
                    listNguoi.get(chon).setHoTen(name);
                    break;
                case 2:
                    System.out.println("Nhập địa chỉ bạn muốn sửa: ");
                    String diaChi = new Scanner(System.in).nextLine();
                    listNguoi.get(chon).setDiaChi(diaChi);
                    break;
                case 3:
                    System.out.println("Nhập tuổi bạn muốn sửa: ");
                    int tuoi = new Scanner(System.in).nextInt();
                    listNguoi.get(chon).setTuoi(tuoi);
                    break;
                case 4:
                    System.out.println("Nhập giới tính bạn muốn sửa: ");
                    int  tf = new Scanner(System.in).nextInt();
                    boolean check=false;
                    if(tf == 1 )
                        check = true;
                    else if(tf ==0)
                        check = false;
                    listNguoi.get(chon).setGioiTinh(check);
                    break;
                case 5:
                    System.out.println("Nhập số điện thoại muốn sửa: ");
                    String soDT = new Scanner(System.in).nextLine();
                    listNguoi.get(chon).setSoDT(soDT);
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên muốn sửa: ");
                    String maSV = new Scanner(System.in).nextLine();
                    ((SinhVien) this.listNguoi.get(chon)).setMaSinhVien(maSV);
                    break;
                case 7:
                    System.out.println("Nhập lớp hành chính muốn sửa: ");
                    String lopHC = new Scanner(System.in).nextLine();
                    ((SinhVien) this.listNguoi.get(chon)).setLopHC(lopHC);
                    break;
                case 8:
                    System.out.println("Nhập điểm gpa muốn sửa: ");
                    double qpa = new Scanner(System.in).nextDouble();
                    ((SinhVien) this.listNguoi.get(chon)).setGpa(qpa);
                    break;
                case 9:
                    System.out.println("Nhập điểm chuyên cần muốn sửa: ");
                    double diem = new Scanner(System.in).nextDouble();
                    ((SinhVien) this.listNguoi.get(chon)).setDiemrenluyen(diem);
                    break;
                case 0:
                    System.out.println("Cảm ơn");
                    break;
                default:
                    System.out.println("Không có trong menu");
            }

        } while (chonSua!=0);
        for(Nguoi e:listNguoi){
            if(e instanceof SinhVien){
                if(((SinhVien) e).checkKhenThuong() && !this.lsvKT.contains(((SinhVien) e))){
                    this.lsvKT.add((SinhVien) e);
                }
            }
        }
    }

    public void editGiangVien(){
        for(Nguoi e : listNguoi){
            if (e instanceof GiangVien){
                System.out.println("STT : " + (listNguoi.indexOf(e)+1)+" "+e.toString());
            }
        }
        System.out.println("Nhập thứ tự của giảng viên bạn muốn sửa: ");
        int chon = new Scanner(System.in).nextInt();
        chon--;
        int chonSua;
        do {
            System.out.println("-----Menu----");
            System.out.println("1.Sửa tên");
            System.out.println("2.Sửa địa chỉ ");
            System.out.println("3.Sửa tuổi\n" +
                    "4Sửa giới tính \n" +
                    "5.Sửa số điện thoại\n" +
                    "6.Sửa mã giảng viên \n" +
                    "7.Sửa bộ môn phụ trách\n" +
                    "8.Sửa học vị\n" +
                    "9.Sửa số lượng công trình\n" +
                    "10.Sửa số lượng lớp phụ trách\n"+
                    "0.Exit");
            System.out.println("Bạn muốn sửa: ");
            chonSua = new Scanner(System.in).nextInt();
            switch(chonSua){
                case 1:
                    System.out.println("Nhập tên bạn muốn sửa: ");
                    String name = new Scanner(System.in).nextLine();
                    listNguoi.get(chon).setHoTen(name);
                    break;
                case 2:
                    System.out.println("Nhập địa chỉ bạn muốn sửa: ");
                    String diaChi = new Scanner(System.in).nextLine();
                    listNguoi.get(chon).setDiaChi(diaChi);
                    break;
                case 3:
                    System.out.println("Nhập tuổi bạn muốn sửa: ");
                    int tuoi = new Scanner(System.in).nextInt();
                    listNguoi.get(chon).setTuoi(tuoi);
                    break;
                case 4:
                    System.out.println("Nhập giới tính bạn muốn sửa: ");
                    int  tf = new Scanner(System.in).nextInt();
                    boolean check=false;
                    if(tf == 1 )
                        check = true;
                    else if(tf ==0)
                        check = false;
                    listNguoi.get(chon).setGioiTinh(check);
                    break;
                case 5:
                    System.out.println("Nhập số điện thoại muốn sửa: ");
                    String soDT = new Scanner(System.in).nextLine();
                    listNguoi.get(chon).setSoDT(soDT);
                    break;
                case 6:
                    System.out.println("Nhập mã giảng viên muốn sửa: ");
                    String magv = new Scanner(System.in).nextLine();
                    ((GiangVien) this.listNguoi.get(chon)).setMaGiaoVien(magv);
                    break;
                case 7:
                    System.out.println("Nhập bộ môn phụ trách muốn sửa: ");
                    String mon = new Scanner(System.in).nextLine();
                    ((GiangVien) this.listNguoi.get(chon)).setBoMonPhuTrach(mon);
                    break;
                case 8:
                    System.out.println("Nhập học vị muốn sửa: ");
                    String hv = new Scanner(System.in).nextLine();
                    ((GiangVien) this.listNguoi.get(chon)).setHocVi(hv);
                    break;
                case 9:
                    System.out.println("Nhập số lượng công trình muốn sửa: ");
                    int  sl = new Scanner(System.in).nextInt();
                    ((GiangVien) this.listNguoi.get(chon)).setSoLuongCongTrinh(sl);
                    break;
                case 10:
                    System.out.println("Nhập số lượng lớp phụ trách: ");
                    int sll = new Scanner(System.in).nextInt();
                    ((GiangVien) this.listNguoi.get(chon)).setSoLuongLopPhuTrach(sll);
                case 0:
                    System.out.println("Cảm ơn");
                    break;
                default:
                    System.out.println("Không có trong menu");
            }

        } while (chonSua!=0);
        for(Nguoi e:listNguoi){
            if(e instanceof GiangVien){
                if(((GiangVien) e).checkKhenThuong()){
                    this.lgvKT.add((GiangVien) e);
                }
            }
        }
    }

    public void xoa(){
        System.out.println("Nhâp vào mã giảng viên hoặc mã sinh viên bạn muốn xóa: ");
        String Maso =new Scanner(System.in).nextLine();
//        System.out.print("Họ và tên:  ");
//        String name = new Scanner(System.in).nextLine();
//        System.out.print("SDT: ");
//        String sdt = new Scanner(System.in).nextLine();
//        for(Nguoi e : listNguoi){
//            if(e.getHoTen().equalsIgnoreCase(name) && e.getSoDT().equalsIgnoreCase(sdt))
//                this.listNguoi.remove(e);ư\
        Nguoi e = new Nguoi();
        for(int i=0; i<listNguoi.size(); i++){
            e = listNguoi.get(i);
            if(e instanceof SinhVien){
                if(((SinhVien) e).getMaSinhVien().equalsIgnoreCase(Maso))
                    this.listNguoi.remove(e);
            }
            if(e instanceof GiangVien){
                if(((GiangVien) e).getMaGiaoVien().equalsIgnoreCase(Maso)){
                    this.listNguoi.remove(e);
                }
            }
        }


//        }
        System.out.println("Xóa thành công ");
    }

    public void luuFile(String path) throws FileNotFoundException, IOException {
        File f;
        f = new File(path);
        FileOutputStream fout= new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        int choice;
        do {
            System.out.println("---Menu---\n"+"1.Lưu thông tin toàn bộ giảng viên sinh viên\n"+"2.Lưu thông tin giảng viên được khen thưởng\n" +
                    "3.Lưu thông tin sinh viên được khen thưởng\n" +
                    "0.Exit");
            System.out.println("Nhập lựa chọn của bạn để lưu file : ");
            choice = new Scanner(System.in).nextInt();
            switch(choice){
                case 1:
                    objout.writeObject(listNguoi);
                    objout.close();
                    fout.close();
                    System.out.println("Lưu thành công ");
                    break;
                case 2:
                    objout.writeObject(lgvKT);
                    objout.close();
                    fout.close();
                    System.out.println("Lưu thành công ");
                    break;
                case 3:
                    objout.writeObject(lsvKT);
                    objout.close();
                    fout.close();
                    System.out.println("Lưu thành công ");
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã nhập (file đã nhập "+path+" )");
                default:
                    System.out.println("Lưa chọn không có trong menu");
            }
        } while (choice !=0);
    }

    public void docFile(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        File f = new File(path);
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        int choice;
        do {
            System.out.println("---Menu---\n"+"1.Đọc thông tin toàn bộ giảng viên sinh viên\n"+"2.Đọc thông tin giảng viên được khen thưởng\n" +
                    "3.Đọc thông tin sinh viên được khen thưởng\n" +
                    "0.Exit");
            System.out.println("Nhập vào kiểu file "+path +" đã lưu để đọc: ");
            choice =new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    listNguoi = new ArrayList<Nguoi>();
                    listNguoi = (ArrayList)objin.readObject();
                    objin.close();
                    fin.close();
                    if(!listNguoi.isEmpty())
                        listNguoi.forEach(e-> System.out.println(e.toString()));
                    else
                        System.out.println(path + " trống");
                    System.out.println("Đọc thành công");
                    break;
                case 2:
                    lgvKT = new ArrayList<>();
                    lgvKT = (ArrayList)objin.readObject();
                    objin.close();
                    fin.close();
                    if(!lgvKT.isEmpty())
                        lgvKT.forEach(e-> System.out.println(e.toString()));
                    else
                        System.out.println(path +" trống");
                    System.out.println("Đọc thành công");

                    break;
                case 3:
                    lsvKT = new ArrayList<>();
                    lsvKT = (ArrayList)objin.readObject();
                    objin.close();
                    fin.close();
                    if(!lsvKT.isEmpty())
                        lsvKT.forEach(e-> System.out.println(e.toString()));
                    else
                        System.out.println(path +" trống");
                    System.out.println("Đọc thành công");
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã nhâp");
                default:
                    System.out.println("Không có trong menu");
            }
        } while (choice !=0);
    }
}
