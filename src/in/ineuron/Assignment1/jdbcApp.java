package in.ineuron.Assignment1;

import java.sql.SQLException;
import java.util.Scanner;

public class jdbcApp {

  public static void main(String[] args) throws SQLException {
    while(true) {
    Scanner s = new Scanner(System.in);
    System.out.println("select operation:\n1.select\n2.insert\n3.update\n4.delete");
    String operation = s.nextLine();
    int sId;
    String sName;
    String sAddr;
  
    if(operation.equalsIgnoreCase("insert")) {
      System.out.println("Enter Id, Name and Address of student:");
      sId = s.nextInt();
      sName = s.next();
      sAddr = s.next();
      
      InsertApp.insertData(sId, sName, sAddr);
    }
    
    else if(operation.equalsIgnoreCase("select")) {
      SelectApp.getData();
    }
    
    else if(operation.equalsIgnoreCase("update")) {
      System.out.println("Enter Id of student:");
      sId = s.nextInt();
      System.out.println("Enter column to update:");
      String colName = s.next();
      
      if(colName.equalsIgnoreCase("sName")) {
        System.out.println("Enter new value:");
        sName = s.next();
        UpdateApp.updateData(sId,colName, sName);
      }
      else if(colName.equalsIgnoreCase("sAddr")) {
        System.out.println("Enter new value:");
        sAddr = s.next();
        UpdateApp.updateData(sId,colName, sAddr);
      }
     
    }
    
    else if(operation.equalsIgnoreCase("delete")) {
      System.out.println("Enter Id of student to delete data:");
      sId = s.nextInt();
      
      DeleteApp.deleteData(sId);
    }
    else {
      System.out.println("Sorry!! You have not entered Option from the given list..");
    }
  }
 
  }
}

