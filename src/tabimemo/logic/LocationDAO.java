package tabimemo.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tabimemo.object.Location;

public class LocationDAO {

	//接続先情報
	static final String JDBC_URL = "jdbc:mysql://localhost:3306/tabimemo_db?serverTimezone=UTC&useSSL=false";
	static final String DB_USER = "suser";
	static final String DB_PASS = "spass";

	//DB操作用のオブジェクトの準備
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rset = null;
	static String sql = null;


	//DB接続メソッド
	public void connectToDB() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(JDBC_URL,DB_USER, DB_PASS);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}



	//該当地域の都道府県の情報全取得メソッド
	public List<Location> getPrefecturesInf(String area){

		List<Location> locationList = new ArrayList<>();
		try {
			sql = "SELECT * FROM LOCATION WHERE AREA IN(\'" + area + "\')";
//			sql = "INSERT INTO LOCATION(URL) VALUES('TEST2')";
			System.out.println(sql);
			pstmt = conn.prepareStatement(new String(sql));
			pstmt.execute();
			rset = pstmt.executeQuery();


			while(rset.next()) {
				String area_table = rset.getString("AREA");
				String prefecture = rset.getString("PREFECTURE");

				String locationName = rset.getString("LOCATIONNAME");
				String URL = rset.getNString("URL");
				String comments = rset.getNString("COMMENTS");
				System.out.println("取得テスト:" + comments);

				Location location = new Location(area_table,prefecture,locationName,URL,comments);
//				System.out.println(location.getPrefecture());
				locationList.add(location);

			}


		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return locationList;

	}
}

