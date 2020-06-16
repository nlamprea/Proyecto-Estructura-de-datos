/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;


import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author USER
 */


public class Inventario{
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      SinglyLinkedList<String> list = new SinglyLinkedList<>();
        
      LeerArhivo a = new LeerArhivo();
      String l = a.leer("C:\\Users\\USER\\Documents\\New NetBeans Proyects\\Proyecto-Estructura-de-datos\\Test\\100000DATOS.txt");
        
        
        list.pushBack(l);
        list.printList();
        list.popFront();
        
    }
    
    

}


