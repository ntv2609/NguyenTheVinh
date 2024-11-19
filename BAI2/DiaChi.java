package BAI2;

public class DiaChi {
    // Các thuộc tính
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;

    // Constructor không tham số
    public DiaChi() {
        
    }

    // Constructor đầy đủ tham số
    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    // Getter và Setter
    public String getThon() {
        return thon;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    // Override toString để hiển thị thông tin đối tượng
    @Override
    public String toString() {
        return "DiaChi {thôn: '" + thon + "', xã: ='" + xa + "', huyện: '" + huyen + "', tỉnh: '" + tinh + "'}";
    }
}
