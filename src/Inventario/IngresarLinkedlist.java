
package Inventario;
import java.io.*;

public class IngresarLinkedlist {
    public void leer(String n) {
        try{
            FileReader r = new FileReader(n);
            BufferedReader buffer = new BufferedReader(r);
            
            String t=" ";
            
            while(t!=null){
                t= buffer.readLine();
                String x;
                x=t;
                SinglyLinkedList list= new SinglyLinkedList();
                list.popFront();
                
                for(int i=0;i<1000;i++){
                    System.out.println(" ");
                }
                if(t==null)
                    break;
            }
            
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
