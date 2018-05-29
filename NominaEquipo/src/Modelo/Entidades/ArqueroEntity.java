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
public class ArqueroEntity {
    private int Id;
    private int IdJugador;
    private int Atajadas;
    private int CantGoles;

    public ArqueroEntity(int Id, int IdJugador, int Atajadas, int CantGoles) {
        this.Id = Id;
        this.IdJugador = IdJugador;
        this.Atajadas = Atajadas;
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

    public int getAtajadas() {
        return Atajadas;
    }

    public void setAtajadas(int Atajadas) {
        this.Atajadas = Atajadas;
    }

    public int getCantGoles() {
        return CantGoles;
    }

    public void setCantGoles(int CantGoles) {
        this.CantGoles = CantGoles;
    }

    
}
