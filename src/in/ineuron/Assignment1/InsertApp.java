package in.ineuron.Assignment1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertApp {

  public static void insertData(int sId, String sName, String sAddr) throws SQLException {
    
  Connection con =   jdbcUtil.getJdbcConnection();
  Statement st = con.createStatement();
  
  String query = String.format("insert into students(`sid`,`sName`,`sAddr`)values(%d,'%s','%s')", sId, sName, sAddr);
  
  int noOfRows = st.executeUpdate(query);
  System.out.println("Data inserted successfully!!\nNo of rows affected is :: " + noOfRows);
  System.out.println("\n===============================\n");
  jdbcUtil.closeConnection(null, st, con);
  
  }

}
