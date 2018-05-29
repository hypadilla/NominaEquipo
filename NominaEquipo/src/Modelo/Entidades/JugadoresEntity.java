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
public class JugadoresEntity {
    private int Id;
    private String Nombre;
    private String Identificacion;
    private String Dorsal;
    private int TallaGuayo;
    private int Edad;
    private float Salario;
    private float Bono;

    public JugadoresEntity(int Id, String Nombre, String Identificacion, String Dorsal, int TallaGuayo, int Edad, float Salario, float Bono) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.Dorsal = Dorsal;
        this.TallaGuayo = TallaGuayo;
        this.Edad = Edad;
        this.Salario = Salario;
        this.Bono = Bono;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getDorsal() {
        return Dorsal;
    }

    public void setDorsal(String Dorsal) {
        this.Dorsal = Dorsal;
    }

    public int getTallaGuayo() {
        return TallaGuayo;
    }

    public void setTallaGuayo(int TallaGuayo) {
        this.TallaGuayo = TallaGuayo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public float getBono() {
        return Bono;
    }

    public void setBono(float Bono) {
        this.Bono = Bono;
    }
    
    
}
