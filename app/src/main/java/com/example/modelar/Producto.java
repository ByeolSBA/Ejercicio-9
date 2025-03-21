package com.example.modelar;

// Clase que representa un producto en el sistema
public class Producto {
    private String nombre;
    private double precio;
    private Categoria categoria; // Relación con la clase Categoria

    // Constructor de la clase Producto
    public Producto(String nombre, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //Metodo para mostrar informacion del producto
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + ", Categoría: " + categoria.getNombre());
    }
}
