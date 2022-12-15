package in.ineoron.Assignment3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.Assignment1.jdbcUtil;

public class DeleteApp {

  public static void deleteData(int sId) throws SQLException {
   String query = "delete from students where sid = ?";
   
   Connection con = jdbcUtil.getJdbcConnection();
   
   if(con!=null) {
     PreparedStatement ps = con.prepareStatement(query);
     if(ps!=null) {
       ps.setInt(1, sId);
       int noOfRows =  ps.executeUpdate();
       
       System.out.println("No. of Rows Affected::" + noOfRows);
     }
    
  }

}
}
