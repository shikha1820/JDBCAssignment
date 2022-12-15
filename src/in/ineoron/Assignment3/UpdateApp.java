package in.ineoron.Assignment3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.Assignment1.jdbcUtil;

public class UpdateApp {

  public static void updateData(int sId, String colName, String newValue) throws SQLException {
    String query = "update students set sName = ? where sid = ?";
    String query1 = "update students set sAddr = ? where sid = ?";

    Connection con = jdbcUtil.getJdbcConnection();
    PreparedStatement ps = null;
    if(con!=null) {

      int noOfRows = 0;
      if(colName.equalsIgnoreCase("sName")) {
        ps = con.prepareStatement(query);
      }
      else if(colName.equalsIgnoreCase("sAddr")) {
        ps = con.prepareStatement(query1);
      }
      
      if(ps!=null) {
          ps.setString(1, newValue);
          ps.setInt(2, sId);
          noOfRows = ps.executeUpdate();
      }
      
      
      System.out.println("Data updated successfully!!\nNo of rows affected is :: " + noOfRows);
      System.out.println("\n===============================\n");
    }
      }
  }

