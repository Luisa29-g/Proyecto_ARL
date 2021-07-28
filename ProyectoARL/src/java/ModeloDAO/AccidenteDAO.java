/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.AccidenteVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class AccidenteDAO extends Conexion implements Crud {
      private Connection Conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
     private boolean operacion= false;
    private String sql;
    
     private String idAccididente="", tipoAccidente="", fechaHora="", dia="", jornada="",
            laborHabitual="", tiempoPA="", cantHoras="", cantMinutos="", empresa="", causaMuerte="",
            descripcion="";
     
     public AccidenteDAO(AccidenteVO aciVO){
     super();
         try {
     Conexion = this.obtenerConexion();
     idAccididente= aciVO.getIdAcdidente();
     tipoAccidente= aciVO.getTipoAccidente();
     fechaHora= aciVO.getFechaHora();
     dia= aciVO.getDia();
     jornada= aciVO.getJornada();
     laborHabitual= aciVO.getLaborHabitual();
     tiempoPA= aciVO.getTiempoPA();
     cantHoras= aciVO.getCantHoras();
     cantMinutos= aciVO.getCantMinutos();
     empresa= aciVO.getEmpresa();
     causaMuerte= aciVO.getCausaMuerte();
     descripcion= aciVO.getDescripcion();
     
         } catch (Exception e) {
             Logger.getLogger(AccidenteDAO.class.getName()).log(Level.SEVERE, null, e);
         }
    
}
    @Override
    public boolean agregarRegistro() {
           try {
            sql= "insert into accidente (tipoAccidente, fechaHora, dia, jornada,"
                    + " laborHabitual, tiempoPA, cantHoras, cantMinutos, empresa,causaMuerte, descripcion )"
                    + " values(?,?) values(?,?,?,?,?,?,?,?,?,?)";
             puente= Conexion.prepareStatement(sql);
             puente.setString(1, tipoAccidente);
             puente.setString(2, fechaHora);
             puente.setString(3, dia);
             puente.setString(4, jornada);
             puente.setString(5,laborHabitual);
             puente.setString(6, tiempoPA);
             puente.setString(7, cantHoras);
             puente.setString(8, cantMinutos);
             puente.setString(9, empresa);
             puente.setString(10, causaMuerte);
             puente.setString(11, descripcion);
             puente.executeUpdate();
             operacion=true;
             
        } catch (SQLException e) {
            Logger.getLogger(AccidenteDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
            }
    }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
       try {
            sql="user update set accidente tipoAccidente=?, fechaHora=?,"
                    + " dia=?, jornada=?, laborHabitual=?, tiempoPA=?,"
                    + " cantHoras=?, cantMinutos=?, empresa=?, causaMuerte=?,"
                    + "where idAccididente=?";
            puente= Conexion.prepareStatement(sql);
             puente.setString(1, tipoAccidente);
             puente.setString(2, fechaHora);
             puente.setString(3, dia);
             puente.setString(4, jornada);
             puente.setString(5,laborHabitual);
             puente.setString(6, tiempoPA);
             puente.setString(7, cantHoras);
             puente.setString(8, cantMinutos);
             puente.setString(9, empresa);
             puente.setString(10, causaMuerte);
             puente.setString(11, descripcion);
             puente.setString(12, idAccididente);
             puente.executeUpdate();
             operacion=true;
        } catch (SQLException e) {
             Logger.getLogger(AccidenteDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
            }
        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}

