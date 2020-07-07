/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author USER
 */
public class Products<T>{
    String nombre;
    String tipo;

    int codigo;
    int precio;

   

    public Products(String nombre, String tipo, int codigo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigo = codigo;
        this.precio = precio;



    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    

    
    

    

    
    
    

}
