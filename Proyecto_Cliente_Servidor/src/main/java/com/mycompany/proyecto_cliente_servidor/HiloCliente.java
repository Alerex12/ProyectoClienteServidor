
package com.mycompany.proyecto_cliente_servidor;
import java.io.*;

//clase para manejar las funciones de los hilos del cliente los cuales recibiran los datos traidos del servidor
public class HiloCliente extends Thread{
    private ObjectInputStream input;
    private boolean activo= true;
    
    
        public HiloCliente(ObjectInputStream input){
        this.input= input;
    }
    
    @Override
    public void run() {
        
    }
    
    
    
}
