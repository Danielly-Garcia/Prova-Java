package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarFactory {

    private static final String URL = "JDBC:mysql://localhost/cinemajava";
    private static final String USER = "root";
    private static final String PASSWORD = "ced03112021";
    
    public static Connection getConection(){
        try{
    Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
        return c;
        }
        catch(SQLException e) {
            return null;
    }
        }
    }

