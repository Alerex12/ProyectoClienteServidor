
package com.mycompany.proyecto_cliente_servidor;

import java.util.Date;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String usuario;
    private String clave;
    private String correo;
    private String tarjeta;
    private Date fechaNacimiento;

    public Cliente(String nombre, String apellido, String cedula, String usuario, String clave, String correo, String tarjeta, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
        this.tarjeta = tarjeta;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
    

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+ ", Apellido: "+this.apellido+", Cedula: "+this.cedula+
                ", Nombre de usuario: "+this.usuario+", Clave: "+this.clave+
                ", Correo electronico: "+this.correo+ ", Tarjeta: "+this.tarjeta+
                ", Fecha de nacimiento: "+this.fechaNacimiento;
    
    }
    
    
    
}
