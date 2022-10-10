package mesas;

import java.io.Serializable;

public class Canino implements Serializable {
    private String nombre;
    private Integer edad;

    public Canino(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Canino{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
