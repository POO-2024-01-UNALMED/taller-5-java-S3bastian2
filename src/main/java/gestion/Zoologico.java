package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
    }

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.zonas = new ArrayList<>();
    }

    public Zoologico() {
        this.zonas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public String setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Zona> getZonas() {
        return this.zonas;
    }

    public List<Zona> setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public void agregarZonas(Zona zona) {
        this.zona.add(zona);
    }

    public int cantidadTotalAnimales() {
        int total = 0;
        for (Zona zona : this.zonas) {
            total += zona.cantidadAnimales();
        }
        return total;
    }
}
