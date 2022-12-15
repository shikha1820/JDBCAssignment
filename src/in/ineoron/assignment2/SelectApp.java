package in.ineoron.assignment2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import in.ineuron.Assignment1.jdbcUtil;

public class SelectApp {
  public static void getData() throws SQLException {
    Connection con = null;
    PreparedStatement ps  = null;
    
    con = jdbcUtil.getJdbcConnection();
    String query = "select fId,fName,fAddr,fGender,DOB,DOJ,DOR from faculty";
   
    if(con!=null) {
      ps = con.prepareStatement(query);
      
      if(ps!=null) {
        ResultSet rs = ps.executeQuery();
        
        if(rs!=null) {
          System.out.println("ID\tNAME\tADDR\tGEN\t\tDOB\t\tDOJ\t\tDOR");
          System.out.println("==================================================================================");
        
          while(rs.next()) {
            int id =  rs.getInt("fId");
            String name = rs.getString("fName") ;
            String addr = rs.getString("fName") ;
            String gen = rs.getString("fName") ;
            Date dob = rs.getDate("DOB");
            Date doj = rs.getDate("DOJ");
            Date dor = rs.getDate("DOR");
          
            System.out.println(id + "\t" + name + "\t" + addr+ "\t" + gen+ "\t" + dob+ "\t" + doj+ "\t" + dor);
         }
        }
     }
    }
    }
}
