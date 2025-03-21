package com.example.modelar;

import java.util.ArrayList;
import java.util.List;

// Clase que representa un inventario de productos
public class Inventario {
    private List<Producto> productos; // Lista de productos en el inventario

    // Constructor que inicializa la lista
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Metodo para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Metodo para mostrar todos los productos en el inventario
    public void mostrarInventario() {
        System.out.println("Inventario de productos:");
        for (Producto p : productos) {
            p.mostrarInformacion();
        }
    }
}
