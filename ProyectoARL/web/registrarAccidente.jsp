<%-- 
    Document   : agregarAccidente
    Created on : 24-jul-2021, 11:41:49
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Accidente</title>
    </head>
    <body>
         <h1>Registrar Accidente</h1>
          <form method="post" action="Accidente">
      <table>
        <tr>
          Tipo de accidente:<br />
          <input type="text" name="textTipAccdiente" /><br />
          Fecha y hora del accidente:<br />
          <input type="date" name="dateFechaHora" /><br />
          Dia de la semana</br>
          <select name="dateDia">
            <option selected value="0">Elige un dia</option>
            <option value="1">Lunes</option>
            <option value="2">Martes</option>
            <option value="3">Miercoles</option>
            <option value="4">Jueves</option>
            <option value="5">Viernes</option>
            <option value="6">Sabado</option>
          </select>
          <br />
          Jornada:<br />
          <input type="search" name="textJornada" /><br />
          LaborHabitual:<br />
          <input type="text" name="textLaborHabitual" /><br />
          Tiempo previo al accidente:<br />
          <input type="time" name="textTiempoPA" /><br />
          Horas previos al accidente:<br />
          <input type="number" name="textHoras" /><br />
          minutos previos al accidente:<br />
          <input type="number" name="textMinutos" /><br />
          Empresa:<br />
          <input type="text" name="textEmpresa" /><br />
          Causa muerte:<br />
          <input type="text" name="textCausaMuerte" /><br />
          Descripcion:<br />
          <textarea rows="3" cols="20" name="textDescripcion"> </textarea>
        </tr>
      </table>
      <button>Registrarse</button>
      <input type="hidden" value="1" name="opcion" />
    </form>
        <div>
            <% if (request.getAttribute("mensajeError") !=null) {%>
            <div Style="color: red; ">${mensajeError} </div>
            <%} else{ %>
            <div style="color: darkgreen">${mensajEXito} </div>
            <% }%>
            
        </div>
    </body>
</html>
