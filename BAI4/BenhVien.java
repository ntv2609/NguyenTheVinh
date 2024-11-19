package BAI4;

import java.util.Scanner;

public class BenhVien {
    // Thuộc tính
    private String tenBV, diaChi, giamDoc;

    // Constructor 
    public BenhVien() {
        this.tenBV = "Unknown";
        this.diaChi = "Unknown";
        this.giamDoc = "Unknown";
    }

    // Constructor đầy đủ
    public BenhVien(String tenBV, String diaChi, String giamDoc) {
        this.tenBV = tenBV;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    // Setter getter
    public void setTenBV(String tenBV) {
        this.tenBV = tenBV;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public String getTenBV() {
        return this.tenBV;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public String getGiamDoc() {
        return this.giamDoc;
    }

    // Nhập thông tin
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập tên bệnh viện: ");
        this.tenBV = sc.nextLine();

        System.out.print("Nhập địa chỉ bệnh viện: ");
        this.diaChi = sc.nextLine();

        System.out.print("Nhập giám đốc bệnh viện: ");
        this.giamDoc = sc.nextLine();
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Tên bệnh viện: " + this.tenBV + "\n" +
               "Địa chỉ: " + this.diaChi + "\n" +
               "Giám đốc: " + this.giamDoc + "\n";
    }
}
