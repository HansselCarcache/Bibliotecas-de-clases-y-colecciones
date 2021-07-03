/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Objects;


/**
 *
 * @author hanss
 */
public class Estudiante {
    private String nombre;
    private String cedula;
    private Carrera nombreCarrera;
    private String sexo;

  
    /**
     *
     */
    private ArrayList<Asignatura> cuarto = new ArrayList<>();

    /**
     *
     */
    private ArrayList<Asignatura> quinto = new ArrayList<>();

    public Estudiante() {
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + "\nCedula=" + cedula + "\nDatos de Carrera=" + nombreCarrera + "\nSexo=" + sexo + "\nNotas de Cuarto=" + cuarto + "\nNotas de Quinto=" + quinto;
    }

    public Estudiante(String nombre, String cedula, Carrera nombreCarrera, String sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nombreCarrera = nombreCarrera;
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.cedula);
        hash = 97 * hash + Objects.hashCode(this.nombreCarrera);
        hash = 97 * hash + Objects.hashCode(this.sexo);
        hash = 97 * hash + Objects.hashCode(this.cuarto);
        hash = 97 * hash + Objects.hashCode(this.quinto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.nombreCarrera, other.nombreCarrera)) {
            return false;
        }
        if (!Objects.equals(this.cuarto, other.cuarto)) {
            return false;
        }
        if (!Objects.equals(this.quinto, other.quinto)) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Carrera getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(Carrera nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Asignatura> getCuarto() {
        return cuarto;
    }

    public void setCuarto(ArrayList<Asignatura> cuarto) {
        this.cuarto = cuarto;
    }

    public ArrayList<Asignatura> getQuinto() {
        return quinto;
    }

    public void setQuinto(ArrayList<Asignatura> quinto) {
        this.quinto = quinto;
    }

    
    
  
    
   
   

   

    
    
}
