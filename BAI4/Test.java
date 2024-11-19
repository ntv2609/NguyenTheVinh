package BAI4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập số lượng bệnh nhân và kiểm tra tính hợp lệ
        int n = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Nhập vào số bệnh nhân: ");
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("Số lượng bệnh nhân phải lớn hơn 0. Vui lòng nhập lại.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ.");
            }
        }

        // Tạo mảng bệnh nhân
        BenhNhan[] a = new BenhNhan[n];

        for (int i = 0; i < n; i++) {
            // Tạo đối tượng BenhNhan
            a[i] = new BenhNhan();

            // Nhập thông tin cho bệnh nhân
            System.out.println("\nNhập thông tin cho bệnh nhân thứ " + (i + 1) + ":");
            a[i].nhapThongTin(sc);

            // Hiển thị thông tin bệnh nhân
            System.out.println("\nThông tin bệnh nhân thứ " + (i + 1) + ":");
            System.out.println(a[i]);
        }

        // Đóng Scanner sau khi sử dụng
        sc.close();

        // Kiểm tra setter và getter
        a[0].setTen("Ho Anh Quan");
        System.out.println("\nTên bệnh nhân sau khi cập nhật: " + a[0].getTen());
    }
}
