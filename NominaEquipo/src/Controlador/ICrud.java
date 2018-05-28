/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;

/**
 *
 * @author Hypadilla
 */
public interface ICrud {
    boolean Crear(Connection conexion,Object objeto); 
    boolean Eliminar(Connection conexion,int ClavePrimaria); 
    boolean Actualizar(Connection conexion,Object objeto); 
    Object Consultar(Connection conexion,Object objeto); 
    Object ConsultarTodos(Connection conexion,Object objeto); 
}
