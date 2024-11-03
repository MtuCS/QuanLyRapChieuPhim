package dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChuongTrinhKhuyenMai;

public class ChuongTrinhKhuyenMai_DAO {
	private ArrayList<ChuongTrinhKhuyenMai> dsChuongTrinhKhuyenMai;

	public ChuongTrinhKhuyenMai_DAO() {
		dsChuongTrinhKhuyenMai = new ArrayList<ChuongTrinhKhuyenMai>();
	}
	public ArrayList<ChuongTrinhKhuyenMai> getAlltbChuongTrinhKhuyenMai() {
		try {
			ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM ChuongTrinhKhuyenMai";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			while (rs.next()) {
				String maCTKM =rs.getString(1);
				String tenCTKM = rs.getString(2);
				LocalDateTime thoiGianBatDau =LocalDateTime.parse(rs.getString(3),formatter);
				LocalDateTime thoiGianKetThuc =LocalDateTime.parse(rs.getString(4),formatter);
				ChuongTrinhKhuyenMai ct = new ChuongTrinhKhuyenMai(maCTKM,tenCTKM,thoiGianBatDau,thoiGianKetThuc);
				dsChuongTrinhKhuyenMai.add(ct);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsChuongTrinhKhuyenMai;
	}
}
