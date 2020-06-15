package Inventario;
import java.io.*;

public class IngresarDatos {
    public void leer(String n) {
        try{
            FileReader r = new FileReader(n);
            BufferedReader buffer = new BufferedReader(r);
            
            String t=" ";
            
            while(t!=null){
                t= buffer.readLine();
                String x;
                x=t;
                String []arreglo= x.split("\n");
                
                for(int i=0;i<arreglo.length;i++){
                    System.out.println(" "+arreglo[i]);
                }
                if(t==null)
                    break;
            }
            
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
