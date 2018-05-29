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
public class DefensaEntity {
    float calificacionDefensa;
    int Id;
    int IdJugador;
    int cantBloqueos;

    public DefensaEntity(float calificacionDefensa, int Id, int IdJugador, int cantBloqueos) {
        this.calificacionDefensa = calificacionDefensa;
        this.Id = Id;
        this.IdJugador = IdJugador;
        this.cantBloqueos = cantBloqueos;
    }

    public float getCalificacionDefensa() {
        return calificacionDefensa;
    }

    public void setCalificacionDefensa(float calificacionDefensa) {
        this.calificacionDefensa = calificacionDefensa;
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

    public int getCantBloqueos() {
        return cantBloqueos;
    }

    public void setCantBloqueos(int cantBloqueos) {
        this.cantBloqueos = cantBloqueos;
    }
    
    
}
