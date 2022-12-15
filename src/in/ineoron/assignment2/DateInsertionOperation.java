package in.ineoron.assignment2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import in.ineuron.Assignment1.jdbcUtil;

public class DateInsertionOperation {
  
  public static void main(String[] args) throws SQLException, ParseException {

    while(true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("select operation:\n1.select\n2.insert");
      String operation = scanner.nextLine();
      
      if(operation.equalsIgnoreCase("insert")) {
        
        System.out.print("Enter the id:: ");
        int id = scanner.nextInt();
        System.out.print("Enter the name:: ");
        String name = scanner.next();
        System.out.print("Enter the Address:: ");
        String addr = scanner.next();
        System.out.print("Enter the gender:: ");
        String gen = scanner.next();
        
        System.out.print("Enter the Date of Birth::(dd-MM-YYYY) ");
        String dob = scanner.next();
        System.out.print("Enter the Date of Joining::(MM-dd-yyyy)");
        String doj = scanner.next();
        System.out.print("Enter the Date of Resign::(yyyy-MM-dd)");
        String dor = scanner.next();
          
        InsertDateApp.insertData(id,name,addr,gen,dob,doj,dor);
      }
      if(operation.equalsIgnoreCase("select")) {
        
        SelectApp.getData();
        }
//    (`fId`,`fName`,`fAddr`,`fGender`,`DOB`,`DOJ`,`DOM`) 
   
    
      }
    }
}
  

