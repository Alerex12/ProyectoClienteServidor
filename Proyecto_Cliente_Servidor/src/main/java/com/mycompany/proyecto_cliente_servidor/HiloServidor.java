
package com.mycompany.proyecto_cliente_servidor;
import java.io.*;

//En esta clase para gestionar los hilos del servidor y las funciones 
//que los clientes solicitaran
public class HiloServidor extends Thread{
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private Servidor servidor;
    boolean activo= true;
    
    
    public HiloServidor(String nombre, ObjectInputStream in, ObjectOutputStream out, Servidor servidor) {
        super(nombre);
        this.in = in;
        this.out = out;
        this.servidor = servidor;

    }
   
    @Override
    public void run() {
        
    }
    
}
