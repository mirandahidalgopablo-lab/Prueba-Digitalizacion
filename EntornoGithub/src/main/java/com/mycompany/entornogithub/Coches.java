package com.mycompany.entornogithub;

public class Coches {

    //atributos como la marca del coche su nombre su motor sus kilometros su año su cilindrada
    private String marca;
    private double km;
    private int año;
    private int cv;
    private String motor;
    private String nombre;
    private int capacidad;

    // constructor sin parametros
    public Coches() {
        String marca = "";
        double km = 0;
        int año = 0;
        int cv = 0;
        String motor = "";
        String nombre = "";
        int capacidad = 0;

    }

    //constructor con parametros
    public Coches(String marca, double km, int año, int cv, String motor, String nombre, int capacidad) {
        this.marca = marca;
        this.km = km;
        this.año = año;
        this.cv = cv;
        this.motor = motor;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // setters
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
    
    
    //metodos getters
    public String getMarca() {
        return marca;
    }

    public double getKm() {
        return km;
    }

    public int getAño() {
        return año;
    }

    public int getCv() {
        return cv;
    }

    public String getMotor() {
        return motor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    //metodo para decir adios
    public String diAdios(){
        return "Adios";
    }

    // metodo diHola
    public String diHola() {
        return "Hola";
    }
}
