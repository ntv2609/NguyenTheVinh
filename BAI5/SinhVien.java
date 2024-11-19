package BAI5;

public class SinhVien extends Nguoi {
    // Thuộc tính
    private String lop, nganh;
    private Truong truong;

    // Constructor không tham số
    public SinhVien() {
        super();
    }

    // Constructor đầy đủ
    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    // Getter và Setter
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        if (truong != null) {
            this.truong = truong;
        } else {
            System.out.println("Trường không thể là null.");
        }
    }

    // Override toString()
    @Override
    public String toString() {
        // Nếu đối tượng Truong đã có toString, nó sẽ tự in thông tin trường
        return super.toString() + "\nSinhVien [lop =" + lop + ", nganh =" + nganh + ", truong =" + truong + "]";
    }
}
