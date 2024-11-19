package BAI14;

import java.util.Scanner;

public class CNTCN extends CongNhan {
    protected double basicSalary;
    protected double salaryCoefficient; // he so luong
    protected int workingDays;

    public CNTCN() {

    }

    public CNTCN(String name, String address, String dob, String type, double basicSalary, double salaryCoefficient, int workingDays) {
        super(name, address, dob, type);
        this.basicSalary = basicSalary;
        this.salaryCoefficient = salaryCoefficient;
        this.workingDays = workingDays;
    }

    @Override 
    public double tinhLuong() {
        double bonus = 0;

        if(workingDays >= 20) {
            bonus = 1.2 * basicSalary;
        }

        return basicSalary * salaryCoefficient + bonus;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap luong co ban: ");
        basicSalary = sc.nextDouble();
        sc.nextLine(); // xoa bo dong thua
        System.out.println("Nhap he so luong: ");
        salaryCoefficient = sc.nextDouble();
        sc.nextLine(); // xoa bo dong thua
        System.out.println("Nhap so ngay lam viec: ");
        workingDays = sc.nextInt();
        sc.nextLine(); // xoa bo dong thua
    }
}
