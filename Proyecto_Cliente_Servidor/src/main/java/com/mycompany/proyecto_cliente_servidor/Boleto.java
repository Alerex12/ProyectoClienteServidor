
package com.mycompany.proyecto_cliente_servidor;

public class Boleto {
    private double precio;
    private String seccion;
    private Estado estado;

    public Boleto(double precio, String seccion, Estado estado) {
        this.precio = precio;
        this.seccion = seccion;
        this.estado = estado;
    }

    public Boleto() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Precio del boleto: "+this.precio+", Seccion: "+
                this.seccion+", estado: "+this.estado+"\n";
    }
    
    
    
    
}
