/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Entidades;

/**
 *
 * @author Jhoan Estivem
 */
public class DelanteroEntity {
    private int CantGoles;
    private int Id;
    private int IdJugador;

    public DelanteroEntity(int CantGoles, int Id, int IdJugador) {
        this.CantGoles = CantGoles;
        this.Id = Id;
        this.IdJugador = IdJugador;
    }

    public int getCantGoles() {
        return CantGoles;
    }

    public void setCantGoles(int CantGoles) {
        this.CantGoles = CantGoles;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdJugador() {
        return IdJugador;
    }

    public void setIdJugador(int IdJugador) {
        this.IdJugador = IdJugador;
    }
    
    
}
