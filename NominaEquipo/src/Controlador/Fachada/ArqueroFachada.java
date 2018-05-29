/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Fachada;

import Modelo.Entidades.UsuarioEntity;
import Modelo.Interfaces.IArquero;
import Modelo.Repositorio.ArqueroRepositorio;
import java.sql.Connection;

/**
 *
 * @author Jhoan Estivem
 */
public class ArqueroFachada implements IArquero{
     private ArqueroRepositorio interfaz;

    public ArqueroFachada() {
        this.interfaz = new ArqueroRepositorio();
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
        return interfaz.Consultar(conexion, objeto);
    }

    @Override
    public Object ConsultarTodos(Connection conexion, Object objeto) {
        return interfaz.ConsultarTodos(conexion, objeto);
    }
}
