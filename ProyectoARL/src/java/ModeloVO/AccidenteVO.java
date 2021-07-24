/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Usuario
 */
public class AccidenteVO {
    private String idAccididente, tipoAccidente, fechaHora, dia, jornada,
            laborHabitual, tiempoPA, cantHoras, cantMinutos, empresa, causaMuerte,
            descripcion;

    


    public AccidenteVO(String idAcdidente, String tipoAccidente, String fechaHora, String dia, String jornada, String laborHabitual, String tiempoPA, String cantHoras, String cantMinutos, String empresa, String causaMuerte, String descripcion) {
        this.idAccididente= idAccididente;
        this.tipoAccidente = tipoAccidente;
        this.fechaHora = fechaHora;
        this.dia = dia;
        this.jornada = jornada;
        this.laborHabitual = laborHabitual;
        this.tiempoPA = tiempoPA;
        this.cantHoras = cantHoras;
        this.cantMinutos = cantMinutos;
        this.empresa = empresa;
        this.causaMuerte = causaMuerte;
        this.descripcion = descripcion;
    }
    
    public AccidenteVO() {
    }
    
    public String getIdAcdidente() {
        return idAccididente;
    }

    public void setIdAcdidente(String idAcdidente) {
        this.idAccididente = idAccididente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getLaborHabitual() {
        return laborHabitual;
    }

    public void setLaborHabitual(String laborHabitual) {
        this.laborHabitual = laborHabitual;
    }

    public String getTiempoPA() {
        return tiempoPA;
    }

    public void setTiempoPA(String tiempoPA) {
        this.tiempoPA = tiempoPA;
    }

    public String getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(String cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getCantMinutos() {
        return cantMinutos;
    }

    public void setCantMinutos(String cantMinutos) {
        this.cantMinutos = cantMinutos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(String causaMuerte) {
        this.causaMuerte = causaMuerte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}
 