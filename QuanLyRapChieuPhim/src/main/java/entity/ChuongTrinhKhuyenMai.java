package entity;

import java.time.LocalDateTime;

public class ChuongTrinhKhuyenMai {
	private String maCTKM;
	private String tenCTKM;
	private LocalDateTime ngayBatDau;
	private LocalDateTime ngayKetThuc;
	public ChuongTrinhKhuyenMai(String maCTKM, String tenCTKM, LocalDateTime ngayBatDau, LocalDateTime ngayKetThuc) {
		super();
		this.maCTKM = maCTKM;
		this.tenCTKM = tenCTKM;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
	}
	
	public ChuongTrinhKhuyenMai(String maCTKM) {
		super();
		this.maCTKM = maCTKM;
	}

	public ChuongTrinhKhuyenMai() {
		super();
	}
	
	public String getMaCTKM() {
		return maCTKM;
	}
	public void setMaCTKM(String maCTKM) {
		this.maCTKM = maCTKM;
	}
	public String getTenCTKM() {
		return tenCTKM;
	}
	public void setTenCTKM(String tenCTKM) {
		this.tenCTKM = tenCTKM;
	}
	public LocalDateTime getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(LocalDateTime ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public LocalDateTime getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(LocalDateTime ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	@Override
	public String toString() {
		return "ChuongTrinhKhuyenMai [maCTKM=" + maCTKM + ", tenCTKM=" + tenCTKM + ", ngayBatDau=" + ngayBatDau
				+ ", ngayKetThuc=" + ngayKetThuc + "]";
	}
	
	
}
