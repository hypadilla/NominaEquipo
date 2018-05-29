/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Repositorio;

import Modelo.Entidades.DelanteroEntity;
import Modelo.Entidades.VolanteEntity;
import Modelo.Interfaces.IDelantero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

/**
 *
 * @author Jhoan Estivem
 */
public class DelanteroRepositorio implements IDelantero{

    @Override
    public Object Crear(Connection conexion, Object objeto) {
        try {
            DelanteroEntity Parametro = (DelanteroEntity) objeto;
            PreparedStatement consulta;

            consulta = conexion.prepareStatement("INSERT INTO TblDelantero VALUES(?, ?)");
            consulta.setInt(1, Parametro.getIdJugador());
            consulta.setInt(2, Parametro.getCantGoles());
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
