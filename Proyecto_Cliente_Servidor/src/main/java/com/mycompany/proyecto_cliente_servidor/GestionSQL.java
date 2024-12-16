
package com.mycompany.proyecto_cliente_servidor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Clase encagarda de manejar todo lo relacionado con la base de datos
//se utilizara sqlite como se habia acordado desde el inicio
public class GestionSQL {
    private static String url= "jdbc:sqlite:eventos.db";
    
    public static void crearTablaConciertos(){
        String sql = "CREATE TABLE IF NOT EXISTS conciertos("
                + "id INTERGER NO NULL PRIMARY KEY,"
                + "nombreArtista TEXT NO NULL,"
                + "nombreEvento TEXT NO NULL,"
                + "cantidadTickets INTEGER,"
                + "fecha ???,"
                + "lugar TEXT NO NULL,"
                + "organizador TEXT NO NULL"+ ");";
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("La tabla de conciertos fue creada con exito!!!");

        } catch (SQLException e) {
            System.out.println("Eror al crear la tabla conciertos" + e.getMessage());

        }
    
    }
    
    public static void crearTablaTeatro(){
        
        String sql = "CREATE TABLE IF NOT EXISTS obrasTeatro("
                + "id INTERGER NO NULL PRIMARY KEY,"
                + "nombreObra TEXT NO NULL,"
                + "nombreCompania TEXT,"
                + "nombreEvento TEXT NO NULL,"
                + "cantidadTickets INTEGER,"
                + "fecha ???,"
                + "lugar TEXT NO NULL,"
                + "organizador TEXT NO NULL" +");";
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("La tabla de obras de teatro fue creada con exito!!!");

        } catch (SQLException e) {
            System.out.println("Eror al crear la tabla obras de teatro" + e.getMessage());

        }
     
    }
    
    public static void crearTablaDeportivo(){
        String sql = "CREATE TABLE IF NOT EXISTS eventosDeportivos("
                + "id INTERGER NO NULL PRIMARY KEY,"
                + "equipo1 TEXT NO NULL,"
                + "equipo2 TEXT NO NULL,"
                + "tipoDeTorneo TEXT NO NULL,"
                + "nombreEvento TEXT NO NULL,"
                + "cantidadTickets INTEGER,"
                + "fecha ???,"
                + "lugar TEXT NO NULL,"
                + "organizador TEXT NO NULL" + ");";
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("La tabla de eventos deportivos fue creada con exito!!!");

        } catch (SQLException e) {
            System.out.println("Eror al crear la tabla eventos deportivos" + e.getMessage());

        }
    
    }
    
    public static void crearTablaCliente() {
                String sql = "CREATE TABLE IF NOT EXISTS clientes("
                + "cedula TEXT NO NULL PRIMARY KEY,"
                + "nombre TEXT NO NULL,"
                + "apellidos TEXT NO NULL,"
                + "usuario TEXT NO NULL,"
                + "clave TEXT NO NULL,"
                + "correo TEXT NO NULL,"
                + "tarjeta TEXT NO NULL,"
                + "fecha ???" + ");";
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("La tabla clientes fue creada con exito!!!");

        } catch (SQLException e) {
            System.out.println("Eror al crear la tabla clientes" + e.getMessage());

        }
    }
    
    
    

    public static void agregarConciertos(Concierto c) {
        
        String insertsql = "INSERT INTO conciertos(id, nombreArtista, nombreEvento, cantidadTickets, fecha, lugar, organizador) VALUES (?,?,?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(insertsql)) {

            pstmt.setInt(1, c.getId());
            pstmt.setString(2, c.getNombreArtista());
            pstmt.setString(3, c.getNombre());
            pstmt.setInt(4, c.getCantidadTickets());
            pstmt.setDate(5,(java.sql.Date) c.getFecha());
            pstmt.setString(6, c.getLugar());
            pstmt.setString(7, c.getOrganizador());
            pstmt.executeUpdate();
            System.out.println("Los datos del concierto se guardaron en la tabla correctamente");

        } catch (SQLException e) {
            System.out.println("Error al guardar los datos del concierto: " + e.getMessage());

        }

    }
    
    public static void agregarTeatro(Obra_Teatro o) {
        String insertsql = "INSERT INTO obrasTeatro(id, nombreObra,nombreCompania, nombreEvento, cantidadTickets, fecha, lugar, organizador) VALUES (?,?,?,?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(insertsql)) {

            pstmt.setInt(1, o.getId());
            pstmt.setString(2, o.getNomObra());
            pstmt.setString(3, o.getCompania());
            pstmt.setString(4, o.getNombre());
            pstmt.setInt(5, o.getCantidadTickets());
            pstmt.setDate(6, (java.sql.Date) o.getFecha());
            pstmt.setString(7, o.getLugar());
            pstmt.setString(8, o.getOrganizador());

            pstmt.executeUpdate();
            System.out.println("Los datos de la obra de teatro se guardaron en la tabla correctamente");

        } catch (SQLException e) {
            System.out.println("Error al guardar los datos de la obra de teatro: " + e.getMessage());

        }

    }

    public static void agregarDeportivo(Evento_Deportivo e) {
        String insertsql = "INSERT INTO eventosDeportivos(id, equipo1, equipo2, tipoDeTorneo , nombreEvento, cantidadTickets, fecha, lugar, organizado) VALUES (?,?,?,?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(insertsql)) {

            pstmt.setInt(1, e.getId());
            pstmt.setString(2, e.getEquipo1());
            pstmt.setString(3, e.getEquipo2());
            pstmt.setString(4, e.getTipoDeTorneo());
            pstmt.setString(5, e.getNombre());
            pstmt.setInt(6, e.getCantidadTickets());
            pstmt.setDate(7, (java.sql.Date) e.getFecha());
            pstmt.setString(8, e.getLugar());
            pstmt.setString(9, e.getOrganizador());
            

            pstmt.executeUpdate();
            System.out.println("Los datos del evento deportivo se guardaron en la tabla correctamente");

        } catch (SQLException r) {
            System.out.println("Error al guardar los datos del evento deportivo: " + r.getMessage());

        }

    }

    public static void agregarCliente(Cliente c) {
        String insertsql = "INSERT INTO clientes(cedula, nombre, apellidos, usuario, clave, correo, tarjeta) VALUES (?,?,?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(insertsql)) {

            pstmt.setString(1, c.getCedula());
            pstmt.setString(2, c.getNombre());
            pstmt.setString(3, c.getApellido());
            pstmt.setString(4, c.getUsuario());
            pstmt.setString(5, c.getClave());
            pstmt.setString(6, c.getCorreo());
            pstmt.setString(7, c.getTarjeta());
            
            
            pstmt.executeUpdate();
            System.out.println("Los datos del cliente se guardaron en la tabla correctamente");

        } catch (SQLException r) {
            System.out.println("Error al guardar los datos del cliente " + r.getMessage());

        }

    }
    
    
    
    public static List<Concierto> mostrarConciertos(){
        String selectsql = "SELECT * FROM conciertos";
        List<Concierto> listaConciertos = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url); 
                PreparedStatement pstmt = conn.prepareStatement(selectsql); 
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                
                int id = rs.getInt("id");
                String nombreArtista = rs.getString("nombreArtista");
                String nombre=rs.getString("nombreEvento");
                int cantidadTickets= rs.getInt("cantidadTickets");
                Date fecha= rs.getDate("fecha");//********
                String lugar= rs.getString("lugar");
                String organizador= rs.getString("organizador");
                

                Concierto concierto = new Concierto(id,nombreArtista,nombre,cantidadTickets,
                        fecha, lugar, organizador);

                listaConciertos.add(concierto);
            }
        } catch (SQLException e) {
            System.out.println("Eror al seleccionar de la base de datos: " + e.getMessage());

        }

        return listaConciertos; 
    }

    public static List<Obra_Teatro> mostrarTeatro() {
        String selectsql = "SELECT * FROM obrasTeatro";
        List<Obra_Teatro> listaObras = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url); 
                PreparedStatement pstmt = conn.prepareStatement(selectsql); 
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                
                int id = rs.getInt("id");
                String nomObra = rs.getString("nombreObra");
                String compania= rs.getString("nombreCompania");
                String nombre=rs.getString("nombreEvento");
                int cantidadTickets= rs.getInt("cantidadTickets");
                Date fecha= rs.getDate("fecha");//******
                String lugar= rs.getString("lugar");
                String organizador= rs.getString("organizador");
                

                Obra_Teatro obra = new Obra_Teatro(id,nomObra,compania,nombre,cantidadTickets,
                        fecha, lugar, organizador);

                listaObras.add(obra);
            }
        } catch (SQLException e) {
            System.out.println("Eror al seleccionar de la base de datos: " + e.getMessage());

        }

        return listaObras; 

    }

    public static List<Evento_Deportivo> mostrarDeportivo() {
        String selectsql = "SELECT * FROM eventosDeportivos";
        List<Evento_Deportivo> listaDeportivos = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(selectsql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {

                int id = rs.getInt("id");
                String equipo1 = rs.getString("equipo1");
                String equipo2 = rs.getString("equipo2");
                String tipoDeTorneo = rs.getString("tipoDeTorneo");
                String nombre = rs.getString("nombreEvento");
                int cantidadTickets = rs.getInt("cantidadTickets");
                Date fecha = rs.getDate("fecha");//******
                String lugar = rs.getString("lugar");
                String organizador = rs.getString("organizador");
              

                Evento_Deportivo deportivo = new Evento_Deportivo(id, equipo1,equipo2,tipoDeTorneo, nombre,
                        cantidadTickets, fecha, lugar, organizador);

                listaDeportivos.add(deportivo);
            }
        } catch (SQLException e) {
            System.out.println("Eror al seleccionar de la base de datos: " + e.getMessage());

        }

        return listaDeportivos;

    }

    public static List<Cliente> mostrarCliente() {
        String selectsql = "SELECT * FROM clientes";
        List<Cliente> listaClientes = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(selectsql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {

                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String usuario = rs.getString("usuario");
                String clave = rs.getString("clave");
                String correo = rs.getString("correo");
                String tarjeta = rs.getString("tarjeta");
                Cliente cliente= new Cliente(cedula,nombre,apellidos, usuario, clave, correo,tarjeta);

                listaClientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Eror al seleccionar de la base de datos: " + e.getMessage());

        }
        return listaClientes;

    }
    
    
    public static void actualizarConciertos(Concierto c) {
        
         String sql = "UPDATE conciertos SET id=?, nombreArtista=?, nombreEvento=?, cantidadTickets=?, fecha=?, lugar=?, organizador=? WHERE id=?";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, c.getId());
            pstmt.setString(2, c.getNombreArtista());
            pstmt.setString(3, c.getNombre());
            pstmt.setInt(4, c.getCantidadTickets());
            pstmt.setObject(5, c.getFecha());
            pstmt.setString(6, c.getLugar());
            pstmt.setString(7, c.getOrganizador());
       

            pstmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error al actualizar la base de datos: " + e.getMessage());
        
        }

    }

    public static void actualizarTeatro(Obra_Teatro o) {
        String sql = "UPDATE obrasTeatro SET id=?, nombreObra=?,nombreCompania=?, nombreEvento=?, cantidadTickets=?, fecha=?, lugar=?, organizador=? WHERE id=?";
        try (Connection conn = DriverManager.getConnection(url); 
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, o.getId());
            pstmt.setString(2, o.getNomObra());
            pstmt.setString(3, o.getCompania());
            pstmt.setString(4, o.getNombre());
            pstmt.setInt(5, o.getCantidadTickets());
            pstmt.setObject(6, o.getFecha());
            pstmt.setString(7, o.getLugar());
            pstmt.setString(8, o.getOrganizador());
            

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la base de datos: " + e.getMessage());

        }

    }

    public static void actualizarDeportivo(Evento_Deportivo e) {
        String sql = "UPDATE eventosDeportivos SET id=?, equipo1=?,equipo2=?,tipoDeTorneo=?, nombreEvento=?, cantidadTickets=?, fecha=?, lugar=?, organizador=? WHERE id=?";
        try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, e.getId());
            pstmt.setString(2, e.getEquipo1());
            pstmt.setString(3, e.getEquipo2());
            pstmt.setString(4, e.getTipoDeTorneo());
            pstmt.setString(5, e.getNombre());
            pstmt.setInt(6, e.getCantidadTickets());
            pstmt.setDate(7, (java.sql.Date) e.getFecha());
            pstmt.setString(8, e.getLugar());
            pstmt.setString(9, e.getOrganizador());
           

            pstmt.executeUpdate();
        } catch (SQLException r) {
            System.out.println("Error al actualizar la base de datos: " + r.getMessage());

        }

    }

    public static void actualizarCliente(Cliente c) {
        
        String sql = "UPDATE clientes SET cedula=?, nombre=?, apellidos=?, usuario=?, clave=?, correo=?, tarjeta=? WHERE cedula=?";
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, c.getCedula());
            pstmt.setString(2, c.getNombre());
            pstmt.setString(3, c.getApellido());
            pstmt.setString(4, c.getUsuario());
            pstmt.setString(5, c.getClave());
            pstmt.setString(6, c.getCorreo());
            pstmt.setString(7, c.getTarjeta());
            

            pstmt.executeUpdate();
        } catch (SQLException r) {
            System.out.println("Error al actualizar la base de datos: " + r.getMessage());

        }

    }
    
    public static void eliminarConcierto(String nombre) {
        String sql = "DELETE FROM conciertos WHERE nombre=?";

        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
            System.out.println("Concierto eliminado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar tabla concierto" + e.getMessage());

        }

    }
    
    public static void eliminarObra(String nombre) {
        String sql = "DELETE FROM obrasTeatro WHERE nombre=?";

        try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
            System.out.println("Obra eliminada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar tabla obras" + e.getMessage());

        }

    }
    
    public static void eliminarDeportivo(String nombre) {
        String sql = "DELETE FROM eventosDeportivos WHERE nombre=?";

        try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
            System.out.println("Evento deportivo eliminado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar tabla evento deportivo " + e.getMessage());

        }

    }
    
    public static void eliminarCliente(String cedula) {
        String sql = "DELETE FROM clientes WHERE cedula=?";

        try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            pstmt.executeUpdate();
            System.out.println("Cliente eliminado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar tabla clientes" + e.getMessage());

        }

    }
       
}
