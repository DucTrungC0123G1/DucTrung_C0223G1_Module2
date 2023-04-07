package ss5_access_modifier_static.thuc_hanh;

import java.util.Date;

public class ThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date nsx;
    private Date hsd;

    public ThucPham(String maHang, String tenHang, double donGia, Date nsx, Date hsd) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nsx = nsx;
        this.hsd = hsd;
    }

    public ThucPham() {
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNsx() {
        return nsx;
    }

    public void setNsx(Date nsx) {
        this.nsx = nsx;
    }

    public Date getHsd() {
        return hsd;
    }

    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }

    @Override
    public String toString() {
        return "ThucPham{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", price=" + donGia +
                ", nsx=" + nsx +
                ", hsd=" + hsd +
                '}';
    }
}
