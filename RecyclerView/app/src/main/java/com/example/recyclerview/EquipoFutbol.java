package com.example.recyclerview;

public class EquipoFutbol {

    private String nombreEquipo;
    private String estadio;
    private String entrenador;

    public EquipoFutbol(String nombreEquipo, String estadio,String entrenador) {
        this.nombreEquipo = nombreEquipo;
        this.estadio = estadio;
        this.entrenador = entrenador;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEntrenador(){
        return entrenador;
    }

    public void setEntrenador(String entrenador){
        this.entrenador = entrenador;
    }


}
