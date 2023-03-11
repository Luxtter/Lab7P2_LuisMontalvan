/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Archivo {
    private String nombre,link, extension;
    private double tamano;

    public Archivo() {
    }

    public Archivo(String nombre, String link, String extension, double tamano) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return nombre + extension;
    }
    
    
}
