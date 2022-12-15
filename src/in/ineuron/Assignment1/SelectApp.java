package in.ineuron.Assignment1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

  public static void getData() throws SQLException {
    Connection con = jdbcUtil.getJdbcConnection();
    Statement st = con.createStatement();
    ResultSet rs = null;
  
    String query ="select sId,sName,sAddr from students";
    if(st!=null) {
      rs =  st.executeQuery(query);
      
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
      System.out.println("\n===============================\n");

    jdbcUtil.closeConnection(rs, st, con);
  }
}
}