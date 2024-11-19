package BAI6;

import java.util.Scanner;

public class Employee extends Person {
    protected String employeeName;
    protected String employeeId;
    protected String hireDate;
    protected int salary;

    public Employee() {
        super();
    }

    public Employee(String name, int age, char gender, String employeeName, String employeeId, String hireDate, int salary) {
        super(name, age, gender);
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(int salary) {
        if (salary >= 0) { // Bảo đảm lương không âm
            this.salary = salary;
        } else {
            System.out.println("Lương không hợp lệ. Vui lòng nhập giá trị dương.");
        }
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập tên:");
            this.name = sc.nextLine();
            
            System.out.println("Nhập tuổi:");
            this.age = Integer.parseInt(sc.nextLine()); // Bắt lỗi nếu nhập không phải số
            
            System.out.println("Nhập giới tính (M=Male, F=Female):");
            String input = sc.nextLine().toUpperCase();
            this.gender = input.length() > 0 ? input.charAt(0) : 'U'; // 'U' cho unknown nếu không nhập
            
            System.out.println("Nhập tên nhân viên:");
            this.employeeName = sc.nextLine();
            
            System.out.println("Nhập mã nhân viên:");
            this.employeeId = sc.nextLine();
            
            System.out.println("Nhập ngày thuê (dd/MM/yyyy):");
            this.hireDate = sc.nextLine();
            
            System.out.println("Nhập lương:");
            this.salary = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
        } 
    }

    @Override
    public String toString() {
        return super.toString() +
               "Tên Nhân Viên: " + this.employeeName + "\n" +
               "Mã Nhân Viên: " + this.employeeId + "\n" +
               "Ngày Thuê: " + this.hireDate + "\n" +
               "Lương: " + this.salary + " VND\n";
    }
}
