package in.ineoron.assignment2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import in.ineuron.Assignment1.jdbcUtil;

public class InsertDateApp {

  public static void insertData(int id, String name, String addr, String gen, String dob, String doj, String dor) throws SQLException, ParseException
  {
    Connection con = null;
    PreparedStatement ps  = null;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    java.util.Date uDate = sdf.parse(dob);
    long time = uDate.getTime();
    java.sql.Date sqlDate = new java.sql.Date(time);
   
    SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
    java.util.Date uDate1 = sdf1.parse(doj);
    java.sql.Date sqlDate1 = new java.sql.Date(uDate1.getTime());
    
    SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date uDate2 = sdf2.parse(dor);
    java.sql.Date sqlDate2 = new java.sql.Date( uDate2.getTime());
    
    String query = "insert into faculty values(?,?,?,?,?,?,?)";
    
    con = jdbcUtil.getJdbcConnection(); 
    
    if(con!=null) {
      ps = con.prepareStatement(query);
      
        if (ps != null) {
          ps.setInt(1, id);
          ps.setString(2, name);
          ps.setString(3, addr);
          ps.setString(4, gen);
          ps.setDate(5, sqlDate);
          ps.setDate(6, sqlDate1);
          ps.setDate(7, sqlDate2);

          int rowAffected = ps.executeUpdate();

          System.out.println("No of rows affected is:: " + rowAffected);
        }
    }
    }

}