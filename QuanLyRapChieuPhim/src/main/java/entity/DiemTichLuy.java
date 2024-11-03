package entity;

public class DiemTichLuy {
	private String maDTL;
	private double diemHienTai;
	public DiemTichLuy(String maDTL, double soDiemHienTai) {
		super();
		this.maDTL = maDTL;
		this.diemHienTai = soDiemHienTai;
	}
	
	public DiemTichLuy(String maDTL) {
		super();
		this.maDTL = maDTL;
	}

	public DiemTichLuy() {
		super();
	}
	public String getMaDTL() {
		return maDTL;
	}
	public void setMaDTL(String maDTL) {
		this.maDTL = maDTL;
	}
	public double getSoDiemHienTai() {
		return diemHienTai;
	}
	public void setSoDiemHienTai(double soDiemHienTai) {
		this.diemHienTai = soDiemHienTai;
	}
	@Override
	public String toString() {
		return "DiemTichLuy [maDTL=" + maDTL + ", soDiemHienTai=" + diemHienTai + "]";
	}
	
}
