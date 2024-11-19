package BAI4;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chuanDoan;
    private BenhVien benhVien;

    // Constructor không tham số
    public BenhNhan() {
        super();
    }

    // Constructor đủ tham số 
    public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chuanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }

    // Setter
    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    // Getter
    public String getTienSu() {
        return tienSu;
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    // Nhập thông tin
    public void nhapThongTin(Scanner sc) {
        // Lấy thông tin từ lớp cha (Nguoi)
        super.nhapThongTin(sc);

        // Nhập thông tin riêng của BenhNhan
        System.out.print("Nhập tiền sử: ");
        this.tienSu = sc.nextLine();

        System.out.print("Nhập chẩn đoán: ");
        this.chuanDoan = sc.nextLine();

        // Nhập thông tin bệnh viện
        this.benhVien = new BenhVien();
        this.benhVien.nhapThongTin(sc);
    }

    // Phương thức toString
    @Override
    public String toString() {
        return super.toString() + 
               "\nTiền sử: " + tienSu + 
               "\nChẩn đoán: " + chuanDoan + 
               "\nThông tin bệnh viện:\n" + benhVien.toString();
    }
}
