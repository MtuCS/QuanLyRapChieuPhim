package entity;

import java.sql.Date;

public class NhanVien {
	private String maNV;
	private String tenNV;
	private String email;
	private String sdt;
	private Date ngaySinh;
	private boolean gioiTinh;
	private String cccd;
	private ChucVu vaitro;
	public NhanVien(String maNV, String tenNV, String email, String sdt, Date ngaySinh, boolean gioiTinh, String cccd,
			ChucVu vaitro) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.email = email;
		this.sdt = sdt;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.cccd = cccd;
		this.vaitro = vaitro;
	}
	
	public NhanVien(String maNV) {
		super();
		this.maNV = maNV;
	}

	public NhanVien() {
		super();
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public ChucVu getVaitro() {
		return vaitro;
	}
	public void setVaitro(ChucVu vaitro) {
		this.vaitro = vaitro;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", email=" + email + ", sdt=" + sdt + ", ngaySinh="
				+ ngaySinh + ", gioiTinh=" + gioiTinh + ", cccd=" + cccd + ", vaitro=" + vaitro + "]";
	}
	
	
}
