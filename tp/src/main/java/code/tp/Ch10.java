package code.tp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Ch10   {
	
	void connect() {
		try(
		Connection c= DriverManager.getConnection("");
		Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE) ;
		ResultSet rs = 	s.executeQuery("")){
			
		
		rs.absolute(3);
		while(rs.previous()) {
			int i = rs.getInt(1) ;
			String st = rs.getString(1) ;
			LocalDateTime ldt = rs.getTimestamp(2).toLocalDateTime() ;}
		}catch(SQLException e) {
			e.getMessage() ;
		}
		
		
		
	}

}
