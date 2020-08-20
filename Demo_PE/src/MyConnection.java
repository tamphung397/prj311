import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public static Connection makeConnection(){
        Connection cn=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=PE";
            cn=DriverManager.getConnection(url,"sa","123");
        }catch(Exception e){
            e.printStackTrace();
        }
		return cn;
    }   
}
