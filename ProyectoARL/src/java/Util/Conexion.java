package Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    //1.declaramos las variables y atributos y le damos valores  

    private String user, password, db, url, puerto, driver;
    private Connection conexion;//elemento de conexion
    //va hacer lo primero de todo el codigo
//valores de los atributos que declare
//metodo principal de la clase se llama igual qie ña clase
    public Conexion() {
        driver = "com.mysql.jdbc.Driver";
        user="root";
        password="";
        db="Proyecto_Arl";//nombre de la base de datos
        puerto="3306";
        url="jdbc:mysql://localhost:"+puerto+"/"+db;
        
        try {
//pponesmos todo lo que pensamos que puede a ver un error 
            //llamamos un elemto o un driver

           Class.forName(driver).newInstance();
           conexion= DriverManager.getConnection(url, user, password); 
            System.out.println("conexion ok");
//captura el error o la excepcion de lo que esta pasando 
        } catch (Exception e) {
            System.out.println("error de conexion"+ e.toString());
        }

    }
//metodo y luego retorna una obexion estabklecida 
    public Connection obtenerConexion() {
        return conexion;
    }
    public Connection cerrarConexion() throws SQLException {
    conexion.close();
    conexion= null;
    return conexion;
    }
    
    //esto se puuede qitar y es para comprobar 
    public static void main(String[] args) {
        new Conexion();
    }
}
