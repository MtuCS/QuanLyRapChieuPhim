package entity;

public class PhongChieu {
	private String maPhongChieu;
	private String tenPhongChieu;
	private int sucChua;
	private String trangThai;
	public PhongChieu(String maPhongChieu, String tenPhongChieu, int sucChua, String trangThai) {
		super();
		this.maPhongChieu = maPhongChieu;
		this.tenPhongChieu = tenPhongChieu;
		this.sucChua = sucChua;
		this.trangThai = trangThai;
	}
	
	public PhongChieu(String maPhongChieu) {
		super();
		this.maPhongChieu = maPhongChieu;
	}

	public PhongChieu() {
		super();
	}
	public String getMaPhongChieu() {
		return maPhongChieu;
	}
	public void setMaPhongChieu(String maPhongChieu) {
		this.maPhongChieu = maPhongChieu;
	}
	public String getTenPhongChieu() {
		return tenPhongChieu;
	}
	public void setTenPhongChieu(String tenPhongChieu) {
		this.tenPhongChieu = tenPhongChieu;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	@Override
	public String toString() {
		return "PhongChieu [maPhongChieu=" + maPhongChieu + ", tenPhongChieu=" + tenPhongChieu + ", sucChua=" + sucChua
				+ ", trangThai=" + trangThai + "]";
	}
	
	
}
