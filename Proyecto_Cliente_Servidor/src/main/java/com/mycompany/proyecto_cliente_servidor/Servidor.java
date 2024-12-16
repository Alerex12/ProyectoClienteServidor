
package com.mycompany.proyecto_cliente_servidor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//Clase donde se va a desarrollar el servidor el cual se encangara del transporte de todos los datos 
//desde la base de datos al cliente y viceversa
public class Servidor{
    
    private Socket socket;
    private ServerSocket serverSocket;
    private String nombreUsuarioConectado;
    
       public void iniciarServidor(){
        
        try {
            this.serverSocket = new ServerSocket(5000);
            int cont= 1;
            while(true){
            System.out.println("Esperando conexion...");
            this.socket = serverSocket.accept();
            System.out.println("Conexion "+cont+ " desde: "+this.socket.getInetAddress().getHostName()+
                    "IP: "+this.socket.getInetAddress().getHostAddress());
            cont++;
            ObjectInputStream input = new ObjectInputStream(this.socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(this.socket.getOutputStream());
            this.nombreUsuarioConectado=(String)input.readObject();
            System.out.println(this.nombreUsuarioConectado+" se ha conectado");
            new Thread(new ClientHandler(this.socket)).start();
            }
        } catch (IOException e) {
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.iniciarServidor();
    }   
    
    class ClientHandler implements Runnable {
        
        private Socket socket;


        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            
            try (ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())){
                
                String solicitud;
                
                while ((solicitud = in.readLine()) != null) {
                    String[] partes = solicitud.split(",");
                    String comando = partes[0];
                    String tipoSolicitud = partes[1];
                    

                    switch (tipoSolicitud) {
                        case "Concierto":
                            switch (comando) {
                                case "Agregar":
                                    int id= Integer.parseInt(partes[2]);
                                    String nomArtista= partes[3];
                                    String nomConcierto= partes[4];
                                    int cantTickets= Integer.parseInt(partes[5]);
                                    String fechatxt= partes[6];
                                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                                    Date fecha= formato.parse(fechatxt);
                                    String lugar= partes[7];
                                    String organizador= partes[8];
                                    Concierto concierto= new Concierto(id,nomArtista,nomConcierto,
                                    cantTickets, fecha, lugar, organizador);
                                    GestionSQL.agregarConciertos(concierto);       
                                    
                                    out.writeObject("Se ha agregado el concierto a la base de datos");
                                    break;
                                case "Mostrar":
                                    List<Concierto> listConcierto= GestionSQL.mostrarConciertos();
                                    out.writeObject(listConcierto);
                                    break;
                                case "Editar":
                                    fechatxt= partes[6];
                                    formato = new SimpleDateFormat("yyyy-MM-dd");
                                    
                                    Concierto conciertoEdit = new Concierto(Integer.parseInt(partes[2]),partes[3],
                                    partes[4],Integer.parseInt(partes[5]),formato.parse(fechatxt),
                                            partes[7], partes[8]);
                                    GestionSQL.actualizarConciertos(conciertoEdit);
                                    
                                    out.writeObject("Se actulizó el concierto en la base de datos");
                                    break;
                                case "Eliminar":
                                    String nombreConcierto=partes[4];
                                    GestionSQL.eliminarConcierto(nombreConcierto);
                                    out.writeObject("Se ha eliminado el concierto");
                                    break;
                            }
                            break;
                        case "Obra":
                            switch (comando) {
                                case "Agregar":
                                    int id= Integer.parseInt(partes[2]);
                                    String nomObra= partes[3];
                                    String compania= partes[4];
                                    String nombre= partes[5];
                                    int cantTickets= Integer.parseInt(partes[6]);
                                    String fechatxt= partes[7];
                                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                                    Date fecha= formato.parse(fechatxt);
                                    String lugar= partes[8];
                                    String organizador= partes[9];
                                    Obra_Teatro obra= new Obra_Teatro(id,nomObra,compania,nombre,
                                    cantTickets, fecha, lugar, organizador);
                                    GestionSQL.agregarTeatro(obra);
                                    
                                    out.writeObject("Se ha agregado la obra de teatro a la base de datos");
                                    break;
                                case "Mostrar":
                                    List<Obra_Teatro> listObras= GestionSQL.mostrarTeatro();
                                    out.writeObject(listObras);
                                    break;
                                case "Editar":
                                    fechatxt= partes[7];
                                    formato = new SimpleDateFormat("yyyy-MM-dd");
                                    Obra_Teatro obraEdit= new Obra_Teatro(Integer.parseInt(partes[2]),partes[3],partes[4],
                                    partes[5],Integer.parseInt(partes[6]),formato.parse(fechatxt),partes[8],partes[9]);
                                    
                                    GestionSQL.actualizarTeatro(obraEdit);
                                    out.writeObject("Se ha editado la obra de teatro");
                                    break;
                                case "Eliminar":
                                    String nombreObra= partes[3];
                                    GestionSQL.eliminarObra(nombreObra);
                                    out.writeObject("Se elimino la obra de la base de datos");
                    
                                    break;
                            }
                            break;
                        case "Evento deportivo":
                            switch (comando) {
                                case "Agregar":
                                    int id= Integer.parseInt(partes[2]);
                                    String equipo1= partes[3];
                                    String equipo2= partes[4];
                                    String tipoTorneo= partes[5];
                                    String nombre= partes[6];
                                    int cantTickets= Integer.parseInt(partes[7]);
                                    String fechatxt= partes[8];
                                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                                    Date fecha= formato.parse(fechatxt);
                                    String lugar= partes[9];
                                    String organizador= partes[10];
                                    Evento_Deportivo depor= new Evento_Deportivo(id,equipo1,equipo2,tipoTorneo,
                                            nombre,cantTickets, fecha, lugar, organizador);
                                    GestionSQL.agregarDeportivo(depor);
                                    out.writeObject("Se ha agregado el evento deportivo a la base de datos");
                                    break;
                                case "Mostrar":
                                    List<Evento_Deportivo> listdepor= GestionSQL.mostrarDeportivo();
                                    out.writeObject(listdepor);
                                    break;
                                case "Editar":
                                    fechatxt= partes[8];
                                    formato = new SimpleDateFormat("yyyy-MM-dd");
                                    Evento_Deportivo deporEdit= new Evento_Deportivo(Integer.parseInt(partes[2]),
                                    partes[3],partes[4], partes[5],partes[6],Integer.parseInt(partes[7]),formato.parse(fechatxt),
                                    partes[9],partes[10]);
                                    GestionSQL.actualizarDeportivo(deporEdit);
                                    out.writeObject("Se ha editado el evento deportivo");
                                    break;
                                case "Eliminar":
                                    String nombreEvento= partes[6];
                                    GestionSQL.eliminarDeportivo(nombreEvento);
                                    out.writeObject("Se ha eliminado el concierto");
                                    break;
                            }
                            break;
                        case "Cliente":
                            switch (comando) {
                                case "Agregar":
                                    String cedula= partes[2];
                                    String nombre= partes[3];
                                    String apellido= partes[4];
                                    String usuario= partes[5];
                                    String clave= partes[6];
                                    String correo= partes[7];
                                    String tarjeta= partes[8];
                                    Cliente cliente= new Cliente(cedula,nombre,apellido, usuario, 
                                            clave, correo,tarjeta);
                                    GestionSQL.agregarCliente(cliente);
                                    
                                    out.writeObject("Se ha agregado el cliente a la base de datos");
                                    break;
                                case "Mostrar":
                                    List<Cliente> listclientes= GestionSQL.mostrarCliente();
                                    out.writeObject(listclientes);
                                    break;
                                case "Editar":
                                    Cliente clienteEdit= new Cliente(partes[2],partes[3],partes[4],
                                            partes[5],partes[6],partes[7],partes[8]);
                                    GestionSQL.actualizarCliente(clienteEdit);
                                    out.writeObject("Se ha editado el cliente");
                                    break;
                                case "Eliminar":
                                    String cedulaCliente= partes[2];
                                    GestionSQL.eliminarCliente(cedulaCliente);
                                    out.writeObject("Se ha eliminado cliente");
                                    break;
                            }
                            break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error de salido o entrada de informacion: "+e.getMessage());

            } catch (ParseException e) {
                System.err.println("Formato de fecha inválido: " + e.getMessage());
            }

        }

    }

}
