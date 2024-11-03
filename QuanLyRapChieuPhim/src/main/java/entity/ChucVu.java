package entity;

public class ChucVu {
	private String maChucVu;
	private String tenChucVu;
	public ChucVu(String maChucVu, String teChucVu) {
		super();
		this.maChucVu = maChucVu;
		this.tenChucVu = teChucVu;
	}
	
	public ChucVu(String maChucVu) {
		super();
		this.maChucVu = maChucVu;
	}

	public ChucVu() {
		super();
	}
	public String getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}
	public String getTeChucVu() {
		return tenChucVu;
	}
	public void setTeChucVu(String teChucVu) {
		this.tenChucVu = teChucVu;
	}
	@Override
	public String toString() {
		return "ChucVu [maChucVu=" + maChucVu + ", teChucVu=" + tenChucVu + "]";
	}
	
}
