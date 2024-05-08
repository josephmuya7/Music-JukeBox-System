
package pkgfinal;

//import DriverManager to load jdbc driver
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connection {
    static final String C_URL = "jdbc:mysql://localhost:3306/db";
    static final String USER = "root";
    static final String PASS = "";
    public static java.sql.Connection B()
    {
        java.sql.Connection playlist = null;
        try
        {
            //register jdbc driver ,not required for newer versions of jdk
           // Class.forName("com.mysql.jdbc.Driver");
            playlist = DriverManager.getConnection(C_URL,USER,PASS);
            return playlist;
        }catch(Exception ex)
        {
            
            System.out.println("There were errors when connecting to database!");
            
            return null;
        }
    }
}
