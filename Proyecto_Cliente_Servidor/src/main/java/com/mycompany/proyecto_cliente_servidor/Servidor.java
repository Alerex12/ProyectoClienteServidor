
package com.mycompany.proyecto_cliente_servidor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.ArrayList;

//Clase donde se va a desarrollar el servidor el cual se encangara del transporte de todos los datos 
//desde la base de datos al cliente y viceversa
public class Servidor{
    
    private Socket socket;
    private ServerSocket serverSocket;
    private String nombreUsuarioConectado;
    private ArrayList<HiloServidor> hilosServidor= new ArrayList<HiloServidor>();
    
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
            //aqui se iniciaria el hilo servidor una vez este hecha la clase
            
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
    
    
}
