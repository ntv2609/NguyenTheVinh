package BAI5;

public class Truong {
    // Các thuộc tính
    private String ten, diaChi, hieuTruong;

    // Constructor không tham số
    public Truong() {
        this.ten = "No Name";
        this.diaChi = "No Address";
        this.hieuTruong = "No Principal";
    }

    // Constructor đầy đủ
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }

    // Getter và Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHieuTruong() {
        return hieuTruong;
    }

    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }

    // Phương thức toString() để in thông tin trường
    @Override
    public String toString() {
        return String.format("Trường: %s\nĐịa chỉ: %s\nHiệu trưởng: %s", ten, diaChi, hieuTruong);
    }
}
