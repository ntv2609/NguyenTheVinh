package BAI2;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng DiaChi
        DiaChi diaChi = new DiaChi("108 Lý Tự Trọng", "phường Hà Huy Tập", "Thành phố Vinh", "Nghệ An");

        // In ra thông tin ban đầu của đối tượng
        System.out.println("Thông tin ban đầu:");
        System.out.println(diaChi);

        // Kiểm tra getter và setter
        System.out.println("\nThay đổi thông tin và kiểm tra từng thuộc tính:");
        diaChi.setThon("xóm Liên Tây");
        System.out.println("Thôn: " + diaChi.getThon());

        diaChi.setXa("Nghĩa Sơn");
        System.out.println("Xã: " + diaChi.getXa());

        diaChi.setHuyen("Nghĩa Đàn");
        System.out.println("Huyện: " + diaChi.getHuyen());

        diaChi.setTinh("Nghệ An");
        System.out.println("Tỉnh: " + diaChi.getTinh());

        // In ra thông tin đối tượng sau khi thay đổi
        System.out.println("\nThông tin sau khi thay đổi:");
        System.out.println(diaChi);
    }
}

