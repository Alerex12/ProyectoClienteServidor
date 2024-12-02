
package com.mycompany.proyecto_cliente_servidor;

import java.util.Date;

public class Evento_Deportivo extends Evento implements Manipulacion_Evento{
    
    private String equipo1;
    private String equipo2;
    private String tipoDeTorneo;

    public Evento_Deportivo(int id,String equipo1, String equipo2, String tipoDeTorneo, String nombre,
            int cantidadTickets, Date fecha, String lugar, String organizador, Boleto boleto) {
        super(nombre, id, cantidadTickets, fecha, lugar, organizador, boleto);
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.tipoDeTorneo = tipoDeTorneo;
    }

    public Evento_Deportivo() {
        
    }
    
    //Los metodos estan vacios ya que todavia no se decide si se haran aqui o en la clase servidor
    @Override
    public void mostrarEvento() {
        
    }

    @Override
    public void venderEntrada() {
       
    }

    @Override
    public void gestionarDisponibilidad() {
        
    }

    @Override
    public void CrearEvento() {
       
    }
    
    
    

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getTipoDeTorneo() {
        return tipoDeTorneo;
    }

    public void setTipoDeTorneo(String tipoDeTorneo) {
        this.tipoDeTorneo = tipoDeTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadTickets() {
        return cantidadTickets;
    }

    public void setCantidadTickets(int cantidadTickets) {
        this.cantidadTickets = cantidadTickets;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }  
    
    
    @Override
    public String toString() {
         return ", Nombre del evento: "+this.nombre+", ID del evento: "+this.id+
                 ", nombre del local"+ this.equipo1+", equipo visitante: "+this.equipo2+
                ", torneo disputado: "+this.tipoDeTorneo+
                 ", cantidad de tickets: "+this.cantidadTickets+
                ", fecha: "+this.fecha+", String lugar: "+this.lugar+
                 ", Organizador del evento: "+this.organizador+ ", Boleto: "+ boleto+"\n";
        
    }
    
}
