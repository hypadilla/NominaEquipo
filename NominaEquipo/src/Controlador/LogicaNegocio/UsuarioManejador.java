/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.LogicaNegocio;

import Controlador.Fachada.JugadorFachada;
import Controlador.Fachada.UsuarioFachada;
import Modelo.Interfaces.IUsuario;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jhoan Estivem
 */
public class UsuarioManejador implements IUsuario{
      private UsuarioFachada interfaz;

    public UsuarioManejador() {
        this.interfaz = new UsuarioFachada();
    }

    @Override
    public Object Crear(Connection conexion, Object objeto) {
        return interfaz.Crear(conexion, objeto);
    }

    @Override
    public Object Eliminar(Connection conexion, int ClavePrimaria) {
        return interfaz.Eliminar(conexion, ClavePrimaria);
    }

    @Override
    public Object Actualizar(Connection conexion, Object objeto) {
        return interfaz.Actualizar(conexion, objeto);
    }

    @Override
    public Object Consultar(Connection conexion, Object objeto) {
        ArrayList<String> Parametro = (ArrayList<String>) objeto;
        String Usuario = Parametro.get(0);
        String Password = Parametro.get(1);
        if (Usuario.equals("")) {
            return "El usuario no puede estar vacío";
        }
        if (Password.equals("")) {
            return "La contraseña no puede estar vacía";
        }
        return interfaz.Consultar(conexion, objeto);
    }

    @Override
    public Object ConsultarTodos(Connection conexion, Object objeto) {
        return interfaz.ConsultarTodos(conexion, objeto);
    }
}
