package BAI6;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    private int hoursPerWeek;
    private int extraSalary; // Đổi tên từ luongPT cho rõ nghĩa

    // Constructor mặc định
    public PartTimeEmployee() {
        super();
    }

    // Constructor đầy đủ tham số
    public PartTimeEmployee(String name, int age, char gender, String eName, String maNV, String dateHire, int salary, int hoursPerWeek, int extraSalary) {
        super(name, age, gender, eName, maNV, dateHire, salary);
        this.hoursPerWeek = hoursPerWeek;
        this.extraSalary = extraSalary;
    }

    // Getter và Setter
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getExtraSalary() {
        return extraSalary;
    }

    public void setExtraSalary(int extraSalary) {
        this.extraSalary = extraSalary;
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return super.toString() + 
               "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + 
               ", extraSalary=" + extraSalary + "]";
    }

    // Override phương thức nhập thông tin
    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in); // Scanner khai báo 1 lần

        super.nhapThongTin(); // Gọi phương thức cha để nhập thông tin chung
        System.out.print("Nhập thời gian làm thêm (giờ/tuần): ");
        this.hoursPerWeek = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự xuống dòng

        System.out.print("Nhập lương làm thêm: ");
        this.extraSalary = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự xuống dòng
    }
}
