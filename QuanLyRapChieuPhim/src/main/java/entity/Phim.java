package entity;

import java.sql.Date;

public class Phim {
	private String maPhim;
	private String tenPhim;
	private Date ngayKhoiChieu;
	private String daoDien;
	private DanhMucPhim danhMuc;
	private String dienVien;
	private Date ngayPhatHanh;
	private String ngonNgu;
	private String mota;
	private String hinhAnh;
	private String dinhDang;
	private String tinhTrang;
	private int doTuoiGioiHan;
	private NuocSanXuat quocGia;
	private int thoiLuong;
	private NhaSanXuat nhaSX;
	
	
	public Phim(String maPhim, String tenPhim, Date ngayKhoiChieu, String daoDien, DanhMucPhim danhMuc, String dienVien,
			Date ngayPhatHanh, String ngonNgu, String mota, String hinhAnh, String dinhDang, String tinhTrang,
			int doTuoiGioiHan, NuocSanXuat quocGia, int thoiLuong, NhaSanXuat nhaSX) {
		super();
		this.maPhim = maPhim;
		this.tenPhim = tenPhim;
		this.ngayKhoiChieu = ngayKhoiChieu;
		this.daoDien = daoDien;
		this.danhMuc = danhMuc;
		this.dienVien = dienVien;
		this.ngayPhatHanh = ngayPhatHanh;
		this.ngonNgu = ngonNgu;
		this.mota = mota;
		this.hinhAnh = hinhAnh;
		this.dinhDang = dinhDang;
		this.tinhTrang = tinhTrang;
		this.doTuoiGioiHan = doTuoiGioiHan;
		this.quocGia = quocGia;
		this.thoiLuong = thoiLuong;
		this.nhaSX = nhaSX;
	}

	public Phim(String maPhim) {
		super();
		this.maPhim = maPhim;
	}

	public Phim() {
		super();
	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public Date getNgayKhoiChieu() {
		return ngayKhoiChieu;
	}
	public void setNgayKhoiChieu(Date ngayKhoiChieu) {
		this.ngayKhoiChieu = ngayKhoiChieu;
	}
	public String getDaoDien() {
		return daoDien;
	}
	public void setDaoDien(String daoDien) {
		this.daoDien = daoDien;
	}
	public String getDienVien() {
		return dienVien;
	}
	public void setDienVien(String dienVien) {
		this.dienVien = dienVien;
	}
	public DanhMucPhim getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(DanhMucPhim danhMuc) {
		this.danhMuc = danhMuc;
	}
	public Date getNgayPhatHanh() {
		return ngayPhatHanh;
	}
	public void setNgayPhatHanh(Date ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	public String getNgonNgu() {
		return ngonNgu;
	}
	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getDinhDang() {
		return dinhDang;
	}
	public void setDinhDang(String dinhDang) {
		this.dinhDang = dinhDang;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public int getDoTuoiGioiHan() {
		return doTuoiGioiHan;
	}
	public void setDoTuoiGioiHan(int doTuoiGioiHan) {
		this.doTuoiGioiHan = doTuoiGioiHan;
	}
	public NuocSanXuat getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(NuocSanXuat quocGia) {
		this.quocGia = quocGia;
	}
	public int getThoiLuong() {
		return thoiLuong;
	}
	public void setThoiLuong(int thoiLuong) {
		this.thoiLuong = thoiLuong;
	}
	public NhaSanXuat getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(NhaSanXuat nhaSX) {
		this.nhaSX = nhaSX;
	}

	@Override
	public String toString() {
		return "Phim [maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", ngayKhoiChieu=" + ngayKhoiChieu + ", daoDien="
				+ daoDien + ", danhMuc=" + danhMuc + ", dienVien=" + dienVien + ", ngayPhatHanh=" + ngayPhatHanh
				+ ", ngonNgu=" + ngonNgu + ", mota=" + mota + ", hinhAnh=" + hinhAnh + ", dinhDang=" + dinhDang
				+ ", tinhTrang=" + tinhTrang + ", doTuoiGioiHan=" + doTuoiGioiHan + ", quocGia=" + quocGia
				+ ", thoiLuong=" + thoiLuong + ", nhaSX=" + nhaSX + "]";
	}
	
}
