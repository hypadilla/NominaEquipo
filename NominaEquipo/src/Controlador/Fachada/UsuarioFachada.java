/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Fachada;

import Modelo.Entidades.UsuarioEntity;
import Modelo.Interfaces.IUsuario;
import Modelo.Repositorio.UsuarioRepositorio;
import java.sql.Connection;

/**
 *
 * @author Jhoan Estivem
 */
public class UsuarioFachada implements IUsuario {

    private UsuarioRepositorio interfaz;

    public UsuarioFachada() {
        this.interfaz = new UsuarioRepositorio();
    }

    @Override
    public Object Crear(Connection conexion, Object objeto) {
        UsuarioEntity Usuario = (UsuarioEntity) objeto;
        if (Usuario.getUsuario().length() > 10) {
            return "El nombre de usuario contiene mas de 10 caracteres";
        }
        if (Usuario.getPassword().length() > 10) {
            return "La contraseña supera los 10 caracteres permitidos";
        }
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
        return interfaz.Consultar(conexion, objeto);
    }

    @Override
    public Object ConsultarTodos(Connection conexion, Object objeto) {
        return interfaz.ConsultarTodos(conexion, objeto);
    }

}
