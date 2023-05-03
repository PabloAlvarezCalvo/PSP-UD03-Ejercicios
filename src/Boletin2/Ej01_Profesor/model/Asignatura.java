package Boletin2.Ej01_Profesor.model;

import java.io.Serializable;

public class Asignatura implements Serializable {
    private int id;
    private String nombreAsignatura;

    public Asignatura(int id, String nombreAsignatura) {
        this.id = id;
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
}
