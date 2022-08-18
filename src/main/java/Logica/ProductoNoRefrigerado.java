/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author The fear of blood tends to create fear for the flesh
 */
public class ProductoNoRefrigerado  extends Producto{
    
    public ProductoNoRefrigerado(String nombre, String id, double temperatura, double valorBase) {
        super(nombre, id, temperatura, valorBase);
    }
    
    public double calcularCostoDeAlmacenamiento(){
        return getValorBase()*1.1;
    }
    
}
