package BAI5;

import java.util.Scanner;

public class Nguoi {
    // Các thuộc tính
    protected String ten;
    protected int tuoi;
    protected char gioiTinh;

    // Constructor không đối
    public Nguoi() {}

    // Constructor đầy đủ
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    // Setter Getter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return this.ten;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public char getGioiTinh() {
        return this.gioiTinh;
    }

    // Nhập thông tin
    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhập tên: ");
        this.ten = sc.nextLine();

        // Kiểm tra nhập tuổi
        boolean validTuoi = false;
        while (!validTuoi) {
            try {
                System.out.println("Nhập tuổi: ");
                this.tuoi = sc.nextInt();
                if (this.tuoi < 0) {
                    System.out.println("Tuổi không thể là số âm. Vui lòng nhập lại.");
                } else {
                    validTuoi = true;
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
                sc.nextLine(); // Đọc bỏ dòng lỗi
            }
        }

        sc.nextLine(); // Đọc bỏ dấu enter

        // Kiểm tra nhập giới tính
        boolean validGioiTinh = false;
        while (!validGioiTinh) {
            System.out.println("Nhập giới tính (M/F): ");
            String input = sc.nextLine().toUpperCase();
            if (input.equals("M") || input.equals("F")) {
                this.gioiTinh = input.charAt(0);
                validGioiTinh = true;
            } else {
                System.out.println("Giới tính không hợp lệ. Vui lòng nhập M hoặc F.");
            }
        }
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Tên: " + this.ten + "\n" + "Tuổi: " + this.tuoi + "\n" + "Giới tính: " + this.gioiTinh + "\n";
    }
}
