/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.UsuarioEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

/**
 *
 * @author Hypadilla
 */
public class UsuarioControlador implements ICrud {

    @Override
    public boolean Crear(Connection conexion, Object objeto) {
        try {
            UsuarioEntity Parametro = (UsuarioEntity) objeto;
            PreparedStatement consulta;

            consulta = conexion.prepareStatement("INSERT INTO TblUsuario(Usuario, Password) VALUES(?, ?)");
            consulta.setString(1, Parametro.getUsuario());
            consulta.setString(2, Parametro.getPassword());

            consulta.executeUpdate();

            return true;
        } catch (SQLException ex) {
            printStackTrace("Tenemos la siguiente excepciòn: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean Eliminar(Connection conexion, int ClavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Connection conexion, Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Consultar(Connection conexion, Object objeto) {
        ArrayList<String> Parametro = (ArrayList<String>) objeto;
        String Usuario = Parametro.get(0);
        String Password = Parametro.get(1);
        UsuarioEntity retorno = null;
        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT id, usuario, password FROM TblUsuario WHERE Usuario = '?' and Password = '?'");
            consulta.setString(1, Usuario);
            consulta.setString(2, Password);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                retorno = new UsuarioEntity(resultado.getInt("id"), Usuario, Password);
            }
        } catch (SQLException ex) {
            printStackTrace("Tenemos la siguiente excepciòn: " + ex.getMessage());
            return null;
        }
        return retorno;

    }

    @Override
    public Object ConsultarTodos(Connection conexion, Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
