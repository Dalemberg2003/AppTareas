package conexion;
import java.sql.*;

/**
 *
 * @author GREBMELAD
 */
public class Conexion {
    public static Connection conectar(){        
        try {            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_tareas","root","");
            return cn;            
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos " +e);
        }
        return (null);
    }
}
