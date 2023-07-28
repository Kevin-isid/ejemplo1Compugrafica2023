
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Utilidades {
    public static boolean guardarArchivo(LinkedList<Cliente> listaC){
        boolean t=false;
        try{
            String nombreArchivo = "cliente.txt";
            FileWriter fileWrite= new FileWriter(nombreArchivo);
            
            BufferedWriter write = new BufferedWriter(fileWrite);
            
            for (Cliente cliente: listaC){
                write.write(cliente.toString()+"\n");
            }
            write.close();
            fileWrite.close();
            t=true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return t;
    }
}
