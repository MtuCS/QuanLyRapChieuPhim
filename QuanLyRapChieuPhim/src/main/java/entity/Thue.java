package entity;

public abstract class Thue {
	private String maThue;
	private String loaiThue;
	private double tyLeThue;
	public Thue(String maThue, String loaiThue, double tyLeThue) {
		super();
		this.maThue = maThue;
		this.loaiThue = loaiThue;
		this.tyLeThue = tyLeThue;
	}
	
	public Thue(String maThue) {
		super();
		this.maThue = maThue;
	}

	public Thue() {
		super();
	}
	public String getMaThue() {
		return maThue;
	}
	public void setMaThue(String maThue) {
		this.maThue = maThue;
	}
	public String getLoaiThue() {
		return loaiThue;
	}
	public void setLoaiThue(String loaiThue) {
		this.loaiThue = loaiThue;
	}
	public double getTyLeThue() {
		return tyLeThue;
	}
	public void setTyLeThue(double tyLeThue) {
		this.tyLeThue = tyLeThue;
	}
	@Override
	public String toString() {
		return "Thue [maThue=" + maThue + ", loaiThue=" + loaiThue + ", tyLeThue=" + tyLeThue + "]";
	}
	

}
