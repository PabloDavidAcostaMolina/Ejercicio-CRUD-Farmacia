/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author The fear of blood tends to create fear for the flesh
 */
public class Almacen {
    
    private String codigo, ubicacion;
    private Lote lote;
    
    public Almacen(){
        
    }

    public Almacen(String codigo, String ubicacion, Lote lote) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.lote = lote;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
    
    
    
    
    
    
}
