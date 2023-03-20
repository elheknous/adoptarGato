package com.mycompany.practivadefinitiva.logica;

public class Dueno {
    private int idDueno;
    private String nombre;
    private String celDueno;

    public Dueno() {
        
    }

    public Dueno(int idDueno, String nombre, String celDueno) {
        this.idDueno = idDueno;
        this.nombre = nombre;
        this.celDueno = celDueno;
    }

    public int getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(int idDueno) {
        this.idDueno = idDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDueno() {
        return celDueno;
    }

    public void setCelDueno(String celDueno) {
        this.celDueno = celDueno;
    }
    
    
    
}
