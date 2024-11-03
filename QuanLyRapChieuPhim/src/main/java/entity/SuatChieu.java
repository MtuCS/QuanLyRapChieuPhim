package entity;

import java.sql.Time;

public class SuatChieu {
	private String maSuatChieu;
	private Phim phim;
	private PhongChieu phongChieu;
	private Time thoiGianKhoiChieu;
	private Time thoiGianKetThuc;
	private String trangThai;
	public SuatChieu(String maSuatChieu, Phim phim, PhongChieu phongChieu, Time thoiGianKhoiChieu, Time thoiGianKetThuc,
			String trangThai) {
		super();
		this.maSuatChieu = maSuatChieu;
		this.phim = phim;
		this.phongChieu = phongChieu;
		this.thoiGianKhoiChieu = thoiGianKhoiChieu;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.trangThai = trangThai;
	}
	
	public SuatChieu(String maSuatChieu) {
		super();
		this.maSuatChieu = maSuatChieu;
	}

	public SuatChieu() {
		super();
	}
	public String getMaSuatChieu() {
		return maSuatChieu;
	}
	public void setMaSuatChieu(String maSuatChieu) {
		this.maSuatChieu = maSuatChieu;
	}
	public Phim getPhim() {
		return phim;
	}
	public void setPhim(Phim phim) {
		this.phim = phim;
	}
	public PhongChieu getPhongChieu() {
		return phongChieu;
	}
	public void setPhongChieu(PhongChieu phongChieu) {
		this.phongChieu = phongChieu;
	}
	public Time getThoiGianKhoiChieu() {
		return thoiGianKhoiChieu;
	}
	public void setThoiGianKhoiChieu(Time thoiGianKhoiChieu) {
		this.thoiGianKhoiChieu = thoiGianKhoiChieu;
	}
	public Time getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}
	public void setThoiGianKetThuc(Time thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	@Override
	public String toString() {
		return "SuatChieu [maSuatChieu=" + maSuatChieu + ", phim=" + phim + ", phongChieu=" + phongChieu
				+ ", thoiGianKhoiChieu=" + thoiGianKhoiChieu + ", thoiGianKetThuc=" + thoiGianKetThuc + ", trangThai="
				+ trangThai + "]";
	}
	
}
