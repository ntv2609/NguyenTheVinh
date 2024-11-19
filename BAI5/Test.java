package BAI5;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Truong và SinhVien
        Truong a = new Truong("Hanoi Univerrsity of Industry", "Nhon, Park The Liems", "Kieu Xuan Thuc");
        SinhVien b = new SinhVien("Nguyen The Vinh", 19, 'M', "KTPM03", "Ky Thuat Phan Mem", a);
        
        // In thông tin ban đầu
        System.out.println("Thông tin sinh viên ban đầu:");
        System.out.println(b);
        
        // Thay đổi tên trường qua đối tượng a
        System.out.println("\nThay đổi tên trường thành đh thương mại");
        a.setTen("Thuongmai University");
        
        // In thông tin sau khi thay đổi
        System.out.println("\nThông tin trường sau khi thay đổi:");
        System.out.println(b.getTruong());
    }
}
