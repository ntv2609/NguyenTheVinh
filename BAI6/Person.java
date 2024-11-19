package BAI6;

public abstract class Person {
    protected String name;
    protected int age;
    protected char gender;

    // Constructor mặc định
    public Person() {
    }

    // Constructor đầy đủ tham số
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter cho tuổi
    public int getAge() {
        return age;
    }

    // Setter cho tuổi với kiểm tra giá trị hợp lệ
    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Giới hạn độ tuổi hợp lý
            this.age = age;
        } else {
            System.out.println("Tuổi không hợp lệ. Vui lòng nhập trong khoảng 0 đến 120.");
        }
    }

    // Getter cho giới tính
    public char getGender() {
        return gender;
    }

    // Setter cho giới tính với kiểm tra giá trị hợp lệ
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F' || gender == 'U') { // 'U' đại diện cho giới tính không xác định
            this.gender = gender;
        } else {
            System.out.println("Giới tính không hợp lệ. Vui lòng nhập M (Nam), F (Nữ), hoặc U (Không xác định).");
        }
    }

    // Getter cho tên
    public String getName() {
        return name;
    }

    // Setter cho tên
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim(); // Loại bỏ khoảng trắng thừa
        } else {
            System.out.println("Tên không được để trống.");
        }
    }

    // Override phương thức toString để hiển thị thông tin người
    @Override
    public String toString() {
        return "Tên: " + this.name + "\n" +
               "Tuổi: " + this.age + "\n" +
               "Giới tính: " + (gender == 'M' ? "Nam" : gender == 'F' ? "Nữ" : "Không xác định") + "\n";
    }

    // Phương thức trừu tượng nhập thông tin
    public abstract void nhapThongTin();
}
