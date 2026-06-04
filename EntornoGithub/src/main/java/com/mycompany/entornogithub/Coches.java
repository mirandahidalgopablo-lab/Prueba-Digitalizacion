package com.mycompany.entornogithub;

/**
 *
 * @author usuario
 */
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

    /**
     *
     */
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

    /**
     *
     * @param marca
     * @param km
     * @param año
     * @param cv
     * @param motor
     * @param nombre
     * @param capacidad
     */
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

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @param km
     */
    public void setKm(double km) {
        this.km = km;
    }

    /**
     *
     * @param año
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     *
     * @param cv
     */
    public void setCv(int cv) {
        this.cv = cv;
    }

    /**
     *
     * @param motor
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    //metodos getters

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @return
     */
    public double getKm() {
        return km;
    }

    /**
     *
     * @return
     */
    public int getAño() {
        return año;
    }

    /**
     *
     * @return
     */
    public int getCv() {
        return cv;
    }

    /**
     *
     * @return
     */
    public String getMotor() {
        return motor;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public int getCapacidad() {
        return capacidad;
    }
    
    //metodo para decir adios

    /**
     *
     * @return
     */
    public String diAdios(){
        return "Adios";
    }

    // metodo diHola

    /**
     *
     * @return
     */
    public String diHola() {
        return "Hola";
    }
    
    public String nuevoFuncionalidad() {
        return "nuevo";
    }
}