package BAI6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner khai báo 1 lần

        // Nhập số nhân viên
        System.out.print("Nhập số nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự xuống dòng

        PartTimeEmployee[] employees = new PartTimeEmployee[n];

        // Nhập thông tin từng nhân viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            employees[i] = new PartTimeEmployee();
            employees[i].nhapThongTin();
        }

        // In thông tin từng nhân viên
        System.out.println("\nDanh sách nhân viên:");
        for (PartTimeEmployee employee : employees) {
            System.out.println(employee.toString());
        }

        // Sắp xếp danh sách nhân viên theo lương giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (employees[i].getExtraSalary() < employees[j].getExtraSalary()) {
                    PartTimeEmployee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        // In danh sách sau khi sắp xếp
        System.out.println("\nDanh sách nhân viên sau khi sắp xếp (theo lương giảm dần):");
        for (PartTimeEmployee employee : employees) {
            System.out.println(employee.toString());
        }

        sc.close(); // Đóng scanner sau khi sử dụng
    }
}
