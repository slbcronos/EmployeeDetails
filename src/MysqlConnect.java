/**
 *
 * @author slb_18
 */
import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); //lee el driver de la conexión
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","");
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
        
    
}
