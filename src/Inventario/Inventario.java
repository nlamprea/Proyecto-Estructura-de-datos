/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;


import Pantalla_Interactivo.ProductosIn;
import Pantalla_Interactivo.Software;
import Pantalla_Interactivo.Vista;
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
    public static void main(String[] args) /*throws IOException */{
      SinglyLinkedList<String> list = new SinglyLinkedList<>();
      AvlTree bs = new AvlTree();
      BinarySearchTree s = new BinarySearchTree();
        
      LeerArhivo a = new LeerArhivo();
      //String l = a.leer("C:\\Users\\USER\\Documents\\New NetBeans Proyects\\Proyecto-Estructura-de-datos\\Test\\100DATOS.txt");
      
       
       
       HashMap<Integer, Integer> h = new HashMap<>( 11 );
       
       Software w = new Software();
       
       w.setVisible(true);

      
      
        
        
        
    }
    
    

}


