package BAI3;

public class NhanVien {
    // Các thuộc tính
    private String name;
    private String dob;
    private char gender;
    private DiaChi address; // Quan hệ kết tập 

    // Constructor không tham số
    public NhanVien() {
        
    }

    // Constructor đủ tham số
    public NhanVien(String name, String dob, char gender, DiaChi address) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public DiaChi getAddress() {
        return address;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return "NhanVien {" +
               "name='" + name + '\'' +
               ", dob='" + dob + '\'' +
               ", gender=" + gender +
               ", address=" + address +
               '}';
    }
}
