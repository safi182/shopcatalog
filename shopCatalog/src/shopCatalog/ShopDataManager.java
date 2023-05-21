package shopCatalog;
import java.sql.*;

import com.mysql.cj.protocol.ResultsetRow;
public class ShopDataManager  {
	
	Connection con=null;
	Statement stmt=null;
	final String url="jdbc:mysql://localhost/kalocsa_products";
	final String username="root";
	final String password="eq2t47gk";
	
	
	Shop shop;
	public ShopDataManager(String bg,String ident) {
		
		
		// TODO Auto-generated constructor stub
	}
	public void connectsKalocsaProducts() throws SQLException {
		
		con=DriverManager.getConnection(url,username,password);
		
		
		
	}	
	
	public void addshopData() throws SQLException{
		this.connectsKalocsaProducts();
		String addquery="INSERT INTO products_table(id,Bg_number,identitifire)values(?,?,?)";
		stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(addquery);
		
		
			
		}
	
	

}


