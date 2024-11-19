package BAI3;

public class Test {
    public static void main(String[] args) {
        // Tạo các đối tượng DiaChi
        DiaChi add = new DiaChi("lien tay", "nghia son", "nghia dan", "nghe an");
        DiaChi add1 = new DiaChi("108 ly tu trong", "phuong ha huy tap", "tp vinh", "nghe an");

        // Tạo đối tượng NhanVien
        NhanVien nhanVien = new NhanVien("Nguyen The Vinh", "26/09/2005", 'M', add);

        // Hiển thị thông tin ban đầu của nhân viên
        System.out.println("Thông tin nhân viên ban đầu:");
        System.out.println(nhanVien);

        // Kiểm tra và cập nhật thông tin bằng getter và setter
        System.out.println("\nCập nhật thông tin:");
        nhanVien.setName("Ho Anh Quan");
        System.out.println("Tên: " + nhanVien.getName());

        nhanVien.setDob("19/03/2005");
        System.out.println("Ngày sinh: " + nhanVien.getDob());

        nhanVien.setGender('F');
        System.out.println("Giới tính: " + nhanVien.getGender());

        nhanVien.setAddress(add1);
        System.out.println("Địa chỉ mới: " + nhanVien.getAddress());

        // Hiển thị thông tin nhân viên sau cập nhật
        System.out.println("\nThông tin nhân viên sau cập nhật:");
        System.out.println(nhanVien);
    }
}
