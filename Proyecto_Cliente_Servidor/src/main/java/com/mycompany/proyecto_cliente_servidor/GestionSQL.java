
package com.mycompany.proyecto_cliente_servidor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class GestionSQL {
    private static String url= "jdbc:sqlite:cursos.db";
    
    public static void crearTablaConciertos(){
    
    }
    
    public static void crearTablaTeatro(){
    
    }
    
    public static void crearTablaDeportivo(){
    
    
    }
    public static void crearTablaCliente() {

    }
    
    
    

    public static void agregarConciertos(Concierto c) {

    }
    
    public static void agregarTeatro(Obra_Teatro o) {

    }

    public static void agregarDeportivo(Evento_Deportivo e) {

    }

    public static void agregarCliente(Cliente c) {

    }
    
    public static List<Concierto> mostrarConciertos() {

    }

    public static List<Obra_Teatro> mostrarTeatro() {

    }

    public static List<Evento_Deportivo> mostrarDeportivo() {

    }

    public static List<Cliente> mostrarCliente() {

    }
    
    

}
