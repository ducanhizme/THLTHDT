package BaiTapLonJava;

import java.util.*;

public class QuanLy {
    private List<Nguoi> listNguoi;
    private boolean checkGiangVien;
    private int type;

    public QuanLy(){
        this.listNguoi = new ArrayList<>();
    }

    public void input(){
        System.out.println("-----Menu-----");
        System.out.println("1.Giảng Viên");
        System.out.println("2.Sinh viên");
        System.out.println("0.EXIT");
        int chon;
        do{
            System.out.println("Nhập vào lựa chọn của bạn");
             chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    System.out.println("Nhập vào số giảng viên muốn xét khen thưởng");
                    int n = new Scanner(System.in).nextInt();
                    for (int i = 0; i <n ; i++) {
                        GiangVien gv = new GiangVien();
                        gv.nhap();
                        this.listNguoi.add(gv);
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào số sinh viên muốn xét khen thưởng");
                    int m = new Scanner(System.in).nextInt();
                    for (int i = 0; i < m ; i++) {
                        SinhVien sv = new SinhVien();
                        sv.nhap();
                        this.listNguoi.add(sv);
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
    // Đây là câu lệnh in ra hết các thông tin bằng cách sử dụng method referance của lambda
    public void printAllList(){
        this.listNguoi.forEach(System.out::println);//nếu bạn không hiểu thì viết thành hàm riêng của bạn cũng được
    }
    public void xuatTungThongTin(){
        System.out.println("-----Menu-----");
        System.out.println("1.In ra thông tin giảng viên");
        System.out.println("2.In ra thông tin sinh viên");
        System.out.println("0.EXIT");
        int chon;
        do{
            System.out.println("Nhập vào lựa chọn của bạn");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    List<GiangVien> k = listGiangVien();
                    for(GiangVien e : k){
                        System.out.println(e);
                    }

                case 2:
                   List<SinhVien> c = listSinhVien();
                    for(SinhVien e : c){
                        System.out.println(e);
                    }
                    break;
                case 0:
                    System.out.println("------------");
                    break;
                default:
                    System.out.println("Không có trong menu");
            }
        }while(chon!=0);
    }

    // đây 2 hàm in ra và return về 2 list giảng viên và sinh viên để in ra thông tin những sinh viên, giảng viên được khen thưởng
    public List<GiangVien> listGiangVien(){
        List<GiangVien> listTemp = new ArrayList<>();
        for(Nguoi e : this.listNguoi){
            if(e instanceof GiangVien){
                listTemp.add((GiangVien) e);
            }
        }
        return listTemp;
    }

    public List<SinhVien> listSinhVien(){
        List<SinhVien> listTemp = new ArrayList<>();
        for(Nguoi e : this.listNguoi){
            if(e instanceof SinhVien){
                listTemp.add((SinhVien) e);
            }
        }
        return listTemp;
    }

    public void printKhenThuongSinhVien(){
        List<SinhVien> lsv = listSinhVien();
        for(SinhVien e: lsv){
            if(e.checkKhenThuong()== true){
                System.out.println(e.checkKhenThuong());
                System.out.println(e);
            }
        }
    }

    public void printKhenThuongGiangVien(){
        List<GiangVien> lgv = listGiangVien();
        for(GiangVien e: lgv){
            if(e.checkKhenThuong()== true){
                System.out.println(e.checkKhenThuong());
                System.out.println(e);
            }
        }
    }
    // Stream api
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

    public void sortGiangVienKhenThuong(){
        List<GiangVien> lsv = listGiangVien();
        Collections.sort(lsv, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    public void sortSinhVienKhenThuong(){
        List<SinhVien> lsv = listSinhVien();
        Collections.sort(lsv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }
    //// TODO: 17/03/2022 Còn phần đọc file và class có chứa hàm main còn lại thì bạn làm nốt nhé 
    /// // TODO: 17/03/2022 những hàm nào mà bạn test được thì feedback lại tôi hoặc 2 chúng mình cùng sửa 
    //// TODO: 17/03/2022  nếu bạn không hiểu phần nào thì cứ comment lại để tôi sửa nhé



}
