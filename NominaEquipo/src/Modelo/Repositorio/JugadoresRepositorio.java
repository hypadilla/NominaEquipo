/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Repositorio;

import Modelo.Entidades.JugadoresEntity;
import Modelo.Entidades.UsuarioEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;
import Modelo.Interfaces.IGeneral;

/**
 *
 * @author Jhoan Estivem
 */
public class JugadoresRepositorio implements IGeneral{

    @Override
    public Object Crear(Connection conexion, Object objeto) {
        try {
            JugadoresEntity Parametro = (JugadoresEntity) objeto;
            PreparedStatement consulta;

            consulta = conexion.prepareStatement("INSERT INTO TblJugadores VALUES(?, ?, ?,?,?,?,?)");
            consulta.setString(1, Parametro.getNombre());
            consulta.setString(2, Parametro.getIdentificacion());
            consulta.setString(3, Parametro.getDorsal());
            consulta.setInt(4, Parametro.getTallaGuayo());
            consulta.setInt(5, Parametro.getEdad());
            consulta.setFloat(6, Parametro.getSalario());
            consulta.setFloat(7, Parametro.getBono());

            consulta.executeUpdate();

            return true;
        } catch (SQLException ex) {
            printStackTrace("Tenemos la siguiente excepciòn: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public Object Eliminar(Connection conexion, int ClavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Actualizar(Connection conexion, Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Consultar(Connection conexion, Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object ConsultarTodos(Connection conexion, Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
