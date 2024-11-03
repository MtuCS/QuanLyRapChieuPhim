package entity;

public class ChiTietKhuyenMai {
	private Ve ve;
	private ChuongTrinhKhuyenMai chuongTrinhKM;
	private double phanTramKM;
	private String moTa;

	
	public ChiTietKhuyenMai(Ve ve, ChuongTrinhKhuyenMai chuongTrinhKM, double phanTramKM, String moTa) {
		super();
		this.ve = ve;
		this.chuongTrinhKM = chuongTrinhKM;
		this.phanTramKM = phanTramKM;
		this.moTa = moTa;
	}
	public ChiTietKhuyenMai() {
		super();
	}
	public ChuongTrinhKhuyenMai getChuongTrinhKM() {
		return chuongTrinhKM;
	}
	public void setChuongTrinhKM(ChuongTrinhKhuyenMai chuongTrinhKM) {
		this.chuongTrinhKM = chuongTrinhKM;
	}
	public double getPhanTramKM() {
		return phanTramKM;
	}
	public void setPhanTramKM(double phanTramKM) {
		this.phanTramKM = phanTramKM;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public Ve getVe() {
		return ve;
	}
	public void setVe(Ve ve) {
		this.ve = ve;
	}
	@Override
	public String toString() {
		return "ChiTietKhuyenMai [ve=" + ve + ", chuongTrinhKM=" + chuongTrinhKM + ", phanTramKM=" + phanTramKM
				+ ", moTa=" + moTa + "]";
	}
	
	
	
}
