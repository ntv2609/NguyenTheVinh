package BAI14;

import java.util.Scanner;

public class CNKSP extends CongNhan {
    protected int nop; //nop = number of products

    public CNKSP() {

    }

    public CNKSP(String name, String address, String dob, String type, int nop) {
        super(name, address, dob, type);
        this.nop = nop;
    }

    @Override
    public double tinhLuong() {
        double unitPrice = 50000; 
        double bonus = 0;
        
        if(nop >= 1100 && nop < 1150) {
            bonus = 1000000;
        } else if(nop >= 1150) {
            bonus = 1500000;
        }
        
        return nop * unitPrice + bonus;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);;
        System.out.println("Nhap so san pham: ");
        nop = sc.nextInt();
        sc.nextLine(); // doc bo dong thua
    }
}
