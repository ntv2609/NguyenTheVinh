package BAI14;

import java.util.Scanner;

public abstract class CongNhan {
    protected String name;
    protected String address;
    protected String dob;
    protected String type;

    public CongNhan() {

    }

    public CongNhan(String name, String address, String dob, String type) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.dob = dob;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        dob = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap loai cong nhan: ");
        type = sc.nextLine();
    }

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.println("Ho ten cong nhan: " + name);
        System.out.println("Dia chi: " + address);
        System.out.println("Ngay sinh: " + dob);
        System.out.println("Loai cong nhan" + type);
        System.out.println("Luong thang: " + tinhLuong());
    }
}
