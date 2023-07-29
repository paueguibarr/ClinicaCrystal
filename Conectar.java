package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author paueguibar
 */
public class Conectar {
    private static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root_user";
    private static final String password = "";
    private static final String url = "jdbc:mysql://192.168.68.114/clinicacrystalcopy";

    public Conectar() {
        con = null;
        try {
           Class.forName(driver);
           con = DriverManager.getConnection(url,user,password);
           if(con != null) {
               System.out.println("Success");
           }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error" + e);
        }
    }
    
    //este metodo nos retorna la conexion
    
    public Connection getConnection() {
        return con;
    } 
    //con este metodo nos desconectamos de la base de datos
    
    public void desconectar() {
        con = null;
        if(con == null) {
            System.out.println("Conexion terminada");
        }
    }
    
    
    
}
