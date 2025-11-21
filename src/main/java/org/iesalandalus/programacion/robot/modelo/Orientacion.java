package org.iesalandalus.programacion.robot.modelo;

public enum Orientacion {
    NORTE ("Norte"),
    NOROESTE ("Noroeste"),
    ESTE ("Este"),
    SURESTE ("Sureste"),
    SUR ("Sur"),
    SUROESTE ("Suroeste"),
    NORESTE ("Noreste"),
    OESTE ("Oeste");


    private String nombre;
    private Orientacion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;

    }
}
