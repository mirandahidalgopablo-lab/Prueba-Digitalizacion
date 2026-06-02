package com.mycompany.entornogithub;

public class Coches {

    //atributos como la marca del coche su nombre su motor sus kilometros su año su cilindrada
    private String marca;
    private double km;

    public Coches() {
        String marca = "";
        double km = 0;
        int año = 0;
        int cv = 0;
        String motor = "";
        String nombre = "";
        int capacidad = 0;

    }

    public Coches(String marca, double km, int año, int cv, String motor, String nombre, int capacidad) {
        this.marca = marca;
        this.km = km;
        this.año = año;
        this.cv = cv;
        this.motor = motor;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    private int año;
    private int cv;
    private String motor;
    private String nombre;
    private int capacidad;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String diHola
}
