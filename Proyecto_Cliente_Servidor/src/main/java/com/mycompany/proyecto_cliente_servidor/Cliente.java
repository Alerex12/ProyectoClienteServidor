
package com.mycompany.proyecto_cliente_servidor;


import com.mycompany.proyecto_cliente_servidor_GUI.Fcliente;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String usuario;
    private String clave;
    private String correo;
    private String tarjeta;
    //metodos necesarios para conectarse al server
    private Socket socket;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    
    public Cliente(String cedula, String nombre, String apellido,String usuario, String clave, String correo, String tarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
        this.tarjeta = tarjeta;
       
    }
    
    public Cliente() {
    }
    
    //metodo que servira para conectarse al servidor
    //igual lo podemos cambiar para hacerlo automatico
    public boolean conectar(String ip,String nombre){
        try{
            this.socket = new Socket(InetAddress.getByName(ip),5000);
            this.output = new ObjectOutputStream(this.socket.getOutputStream());
            this.input = new ObjectInputStream( this.socket.getInputStream()); 
            this.output.writeObject(nombre);
            this.output.flush();
            Thread mensajeServidor = new Thread(new ControladorMensajes(socket));
            mensajeServidor.start();
              
        }catch(IOException e){
            return false;
        }
        return true;
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
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+ ", Apellido: "+this.apellido+", Cedula: "+this.cedula+
                ", Nombre de usuario: "+this.usuario+", Clave: "+this.clave+
                ", Correo electronico: "+this.correo+ ", Tarjeta: "+this.tarjeta;
    
    }
    
    
    class ControladorMensajes implements Runnable{
        
        private Socket socket;
        private ObjectInputStream input;
        private Fcliente cliente;

        public ControladorMensajes(Socket socket) {
            this.socket = socket;
        }
        @Override
        public void run() {
            
             while(true){
            String mensaje;
            try{
                mensaje=(String)this.input.readObject();
                
            }catch(IOException e){
                System.out.println(e.getMessage());
            
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            
            }

        }

    }
            
        
        }
    
    
    }
