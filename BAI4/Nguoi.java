package BAI4;

import java.util.Scanner;

public class Nguoi {
    // Các thuộc tính
    protected String ten;
    protected int tuoi;
    protected char gioiTinh;

    // Constructor 
    public Nguoi() {
        this.ten = "Unknown";
        this.tuoi = 0;
        this.gioiTinh = 'M';
    }

    // Constructor đầy đủ
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    // Setter getter
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
        System.out.print("Nhập tên: ");
        this.ten = sc.nextLine();

        // Kiểm tra nhập tuổi hợp lệ
        boolean validTuoi = false;
        while (!validTuoi) {
            try {
                System.out.print("Nhập tuổi: ");
                this.tuoi = Integer.parseInt(sc.nextLine());
                if (this.tuoi < 0) {
                    System.out.println("Tuổi không thể là số âm. Vui lòng nhập lại.");
                } else {
                    validTuoi = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ cho tuổi.");
            }
        }

        // Nhập giới tính
        System.out.print("Nhập giới tính (M/F): ");
        String input = sc.nextLine();
        if (input.length() > 0) {
            this.gioiTinh = input.charAt(0);
        }
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Tên: " + this.ten + "\n" +
               "Tuổi: " + this.tuoi + "\n" +
               "Giới tính: " + this.gioiTinh + "\n";
    }
}
