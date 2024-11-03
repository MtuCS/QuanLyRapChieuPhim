package entity;

public class ChiTietVe {
	private Ve ve;
	private String viTriGhe;
	private double giaVe;
	private SuatChieu suatChieu;
	private String loaiVe;
	public ChiTietVe(Ve ve, String viTriGhe, double giaVe, SuatChieu suatChieu, String loaiVe) {
		super();
		this.ve = ve;
		this.viTriGhe = viTriGhe;
		this.giaVe = giaVe;
		this.suatChieu = suatChieu;
		this.loaiVe = loaiVe;
	}
	public ChiTietVe() {
		super();
	}
	public Ve getVe() {
		return ve;
	}
	public void setVe(Ve ve) {
		this.ve = ve;
	}
	public String getViTriGhe() {
		return viTriGhe;
	}
	public void setViTriGhe(String viTriGhe) {
		this.viTriGhe = viTriGhe;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public SuatChieu getSuatChieu() {
		return suatChieu;
	}
	public void setSuatChieu(SuatChieu suatChieu) {
		this.suatChieu = suatChieu;
	}
	public String getLoaiVe() {
		return loaiVe;
	}
	public void setLoaiVe(String loaiVe) {
		this.loaiVe = loaiVe;
	}
	@Override
	public String toString() {
		return "ChiTietVe [ve=" + ve + ", viTriGhe=" + viTriGhe + ", giaVe=" + giaVe + ", suatChieu=" + suatChieu
				+ ", loaiVe=" + loaiVe + "]";
	}
	
	
	
}
