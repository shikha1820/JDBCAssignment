package in.ineoron.Assignment3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.Assignment1.jdbcUtil;

public class SelectApp {

  public static void getData() throws SQLException {
   
    String query = "select sId,sName,sAddr from students";
    Connection con = jdbcUtil.getJdbcConnection();
    
    if(con!=null) {
      PreparedStatement ps = con.prepareStatement(query);
      if(ps!=null) {
        ResultSet rs = ps.executeQuery();
        
        if(rs!=null) {
          
          System.out.println("SID\tSNAME\tSADDR");
          System.out.println("==============================");
          while(rs.next()) {
          int sid =rs.getInt("sid");
          String name = rs.getString("sName");
          String addr = rs.getString("sAddr");
          System.out.println(sid + "\t" + name + "\t" + addr);
          }
        
       }
      }
    }
    
    
  }

}
