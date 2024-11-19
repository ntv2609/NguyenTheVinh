package BAI14;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CNKSP khoanSP = new CNKSP("ten", "dchi", "ngay sinh", "loai cong nhan", 0);
        CNTCN tinhCN = new CNTCN("ten", "dchi", "ngay sinh", "loai cong nhan", 0, 0, 0);

        try {
            System.out.println("Nhap thong tin CNKSP: ");
            khoanSP.nhapThongTin(sc);
            
            System.out.println("Nhap thong tin CNTCN: ");
            tinhCN.nhapThongTin(sc);

            System.out.println("Thong tin CNKSP: ");
            khoanSP.inThongTin();

            System.out.println("Thong tin CNTCN: ");
            tinhCN.inThongTin();

        } catch(Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
