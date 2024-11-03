package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChiTietKhuyenMai;
import entity.ChuongTrinhKhuyenMai;
import entity.Ve;

public class ChiTietKhuyenMai_DAO {
	private ArrayList<ChiTietKhuyenMai> dsChiTietKhuyenMai;
	private ChiTietKhuyenMai km;

	public ChiTietKhuyenMai_DAO() {
		dsChiTietKhuyenMai = new ArrayList<ChiTietKhuyenMai>();
		km = new ChiTietKhuyenMai();
	}
	public ArrayList<ChiTietKhuyenMai> getAlltbChitietKhuyenMai() {
		try {
			ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM ChiTietKhuyenMai";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()) {
            	Ve ve = new Ve(rs.getString(1));
            	ChuongTrinhKhuyenMai ctkm = new ChuongTrinhKhuyenMai(
        			rs.getString(2)
            	);
            	double phanTramKM = rs.getDouble(6);
            	String moTaString = rs.getString(7);
            	ChiTietKhuyenMai ct = new ChiTietKhuyenMai(ve,ctkm,phanTramKM,moTaString);
            	dsChiTietKhuyenMai.add(ct);
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsChiTietKhuyenMai;
	}
	public boolean create(ChiTietKhuyenMai ctkm) {
		if(dsChiTietKhuyenMai.contains(ctkm) ) {
			return false;
		} else {
			ConnectDB.getConnection();
			Connection con = ConnectDB.getConnection();
			PreparedStatement stmt = null;
			int n=0;
			try {
				stmt = con.prepareStatement("insert into" + "ChiTietKhuyenMai values(?,?,?,?)");
				stmt.setString(1, km.getChuongTrinhKM().getMaCTKM());
				stmt.setString(2, km.getChuongTrinhKM().getTenCTKM());
				stmt.setDouble(3, km.getPhanTramKM());
				stmt.setString(4, km.getMoTa());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n>0;
		}
	}
}
