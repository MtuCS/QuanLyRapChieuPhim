package entity;

import java.sql.Date;

public class Ve {
	private String maVe;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private Date ngayLap;
	private String phuongThucThanhToan;
	private Thue thue;
	public Ve(String maVe, KhachHang khachHang, NhanVien nhanVien, Date ngayLap, String phuongThucThanhToan,
			Thue thue) {
		super();
		this.maVe = maVe;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.ngayLap = ngayLap;
		this.phuongThucThanhToan = phuongThucThanhToan;
		this.thue = thue;
	}
	public Ve(String maVe) {
		super();
		this.maVe = maVe;
	}
	public Ve() {
		super();
	}
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	public String getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}
	public void setPhuongThucThanhToan(String phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	public Thue getThue() {
		return thue;
	}
	public void setThue(Thue thue) {
		this.thue = thue;
	}
	@Override
	public String toString() {
		return "Ve [maVe=" + maVe + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", ngayLap=" + ngayLap
				+ ", phuongThucThanhToan=" + phuongThucThanhToan + ", thue=" + thue + "]";
	}
	
	
}
