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
public class VolanteEntity {
    private int CantPases;
    private int Id;
    private int IdJugador;

    public VolanteEntity(int CantPases, int Id, int IdJugador) {
        this.CantPases = CantPases;
        this.Id = Id;
        this.IdJugador = IdJugador;
    }

    public int getCantPases() {
        return CantPases;
    }

    public void setCantPases(int CantPases) {
        this.CantPases = CantPases;
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
