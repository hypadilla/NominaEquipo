/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Interfaces;

import java.sql.Connection;

/**
 *
 * @author Hypadilla
 */
public interface IGeneral {
    Object Crear(Connection conexion,Object objeto); 
    Object Eliminar(Connection conexion,int ClavePrimaria); 
    Object Actualizar(Connection conexion,Object objeto); 
    Object Consultar(Connection conexion,Object objeto); 
    Object ConsultarTodos(Connection conexion,Object objeto); 
}
