package com.mycompany.practivadefinitiva.logica;

public class Mascota {
    private int numCliente;
    private String raza;
    private String colot;
    private String observaciones;
    private Dueno unDueno;
    private String preguntaGatos;

    public Mascota() {
    }

    public Mascota(int numCliente, String raza, String colot, String observaciones, Dueno unDueno, String preguntaGatos) {
        this.numCliente = numCliente;
        this.raza = raza;
        this.colot = colot;
        this.observaciones = observaciones;
        this.unDueno = unDueno;
        this.preguntaGatos = preguntaGatos;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColot() {
        return colot;
    }

    public void setColot(String colot) {
        this.colot = colot;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Dueno getUnDueno() {
        return unDueno;
    }

    public void setUnDueno(Dueno unDueno) {
        this.unDueno = unDueno;
    }

    public String getPreguntaGatos() {
        return preguntaGatos;
    }

    public void setPreguntaGatos(String preguntaGatos) {
        this.preguntaGatos = preguntaGatos;
    }
   
    
}

