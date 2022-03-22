package BaiTapLonJava;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class QuanLy {
    private List<Nguoi> listNguoi;
    private int type;
    private List<GiangVien> lgvKT;
    private List<SinhVien> lsvKT;

    public QuanLy(){
        this.listNguoi = new ArrayList<>();
        this.lgvKT = new ArrayList<GiangVien>();

    }

    public void input(){
        System.out.println("-----Menu-----");
        System.out.println("1.Giảng Viên");
        System.out.println("2.Sinh viên");
        System.out.println("0.EXIT");
        int chon;
        do{
            System.out.println("Nhập vào lựa chọn muốn nhập: ");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    System.out.println("Nhập vào số giảng viên muốn xét khen thưởng");
                    int n = new Scanner(System.in).nextInt();
                    for (int i = 0; i <n ; i++) {
                        GiangVien gv = new GiangVien();
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
        this.listNguoi.forEach(System.out::println);
    }
    public void xuatTungThongTin(){
        System.out.println("-----Menu-----");
        System.out.println("1.In ra thông tin giảng viên");
        System.out.println("2.In ra thông tin sinh viên");
        System.out.println("Nhập vào lựa chọn của bạn");
        int chon = new Scanner(System.in).nextInt();
        System.out.println(xuatTungThongTin(chon));
    }

    public List<Nguoi> xuatTungThongTin(int type){
        return this.listNguoi.stream().filter(e->{
            if(type ==2)
                return e instanceof SinhVien;
            if(type == 1)
                return e instanceof GiangVien;
            return false;
        }).collect(Collectors.toList());
    }

    public void printKhenThuongSinhVien(){this.lsvKT.forEach(System.out::println);}

    public void printKhenThuongGiangVien(){this.lgvKT.forEach(System.out::println);}

    public Nguoi findByName(String name) {
        System.out.println("---Menu---");
        System.out.println("1.Sinh Viên");
        System.out.println("2.Giảng Viên");
        this.type = new Scanner(System.in).nextInt();
        return this.listNguoi.stream().filter(e -> {
            if(this.type ==1){
                if(e instanceof SinhVien){
                    if(e.getHoTen().equalsIgnoreCase(name)){
                        return true;
                    }
                    return false;
                }
            }
            if(this.type ==2) {
                if (e instanceof GiangVien) {
                    if (e.getHoTen().equalsIgnoreCase(name)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;

        }).findFirst().orElse(null);
    }

    public void sortSinhVienKhenThuong(){
        Collections.sort(this.lsvKT, new Comparator<SinhVien>() {
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    public void sortGiangVienKhenThuong(){
        Collections.sort(this.lgvKT, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    public void editSinhVien(){
        for(Nguoi e : listNguoi){
            if (e instanceof SinhVien){
                System.out.println("STT" + listNguoi.indexOf(e)+" "+e.toString());
            }
        }
        System.out.println("Nhập thứ tự của sinh viên bạn muốn sửa: ");
        int chon = new Scanner(System.in).nextInt();
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
        int chonSua;
        do {
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
    }

    public void editGiangVien(){
        System.out.println("Nhập thứ tự của giảng viên bạn muốn sửa: ");
        int chon = new Scanner(System.in).nextInt();
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
        int chonSua;
        do {
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
    }

    public void xoa(){
        System.out.println("Nhâp vào tên người bạn muốn xóa và SDT");
        System.out.print("Họ và tên:  ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("SDT: ");
        String sdt = new Scanner(System.in).nextLine();
        for(Nguoi e : listNguoi){
            if(e.getHoTen().equalsIgnoreCase(name) && e.getSoDT().equalsIgnoreCase(sdt))
                this.listNguoi.remove(e);
        }
    }

    public void luuFile(String path) throws FileNotFoundException, IOException {

        File f;
        f = new File(path);
        FileOutputStream fout= new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        System.out.println("---Menu---\n"+"1.Lưu thông tin toàn bộ giảng viên sinh viên\n "+"2.Lưu thông tin giảng viên được khen thưởng" +
                "3.Lưu thông tin sinh viên được khen thưởng" +
                "0.Exit");
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = new Scanner(System.in).nextInt();
            switch(choice){
                case 1:
                    objout.writeObject(listNguoi);
                    objout.close();
                    fout.close();
                    break;
                case 2:
                    objout.writeObject(lgvKT);
                    objout.close();
                    fout.close();
                    break;
                case 3:
                    objout.writeObject(lsvKT);
                    objout.close();
                    fout.close();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã nhập (file đã nhập"+path+" )");
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
            System.out.println("---Menu---\n"+"1.Đọc thông tin toàn bộ giảng viên sinh viên\n "+"2.Đọc thông tin giảng viên được khen thưởng" +
                    "3.Đọc thông tin sinh viên được khen thưởng" +
                    "0.Exit");
            System.out.println("Nhập vào kiểu"+path +"đã lưu: ");
            choice =new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    listNguoi = new ArrayList<Nguoi>();
                    listNguoi = (ArrayList)objin.readObject();
                    objin.close();
                    fin.close();
                    break;
                case 2:
                    lgvKT = new ArrayList<>();
                    lgvKT = (ArrayList)objin.readObject();
                    objin.close();
                    fin.close();
                    break;
                case 3:
                    lsvKT = new ArrayList<>();
                    lsvKT = (ArrayList)objin.readObject();
                    objin.close();
                    fin.close();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã nhâp");
                default:
                    System.out.println("Không có trong menu");
            }
        } while (choice !=0);
    }
}
