/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The fear of blood tends to create fear for the flesh
 */
public class Lote {
    
    private List<Producto> productos;
    
    public Lote(){
        productos = new ArrayList<Producto>();
    }

     
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public List<Producto> getProductos(){
        return productos;
    }
    
}
