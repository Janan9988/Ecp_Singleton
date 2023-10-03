package Web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {  
public static boolean validate(String USERNAME,String PASSWORD){  
boolean status=false;  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");  
      
PreparedStatement ps=con.prepareStatement("select * from web where USERNAME=? and PASSWORD=?");  
ps.setString(1,USERNAME);  
ps.setString(2,PASSWORD);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  