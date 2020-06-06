/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;


import java.util.Scanner;


/**
 *
 * @author USER
 */


public class Inventario{
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SinglyLinkedList<String> list = new SinglyLinkedList<>();
        
        
        
        
        
        
        
        
        
        
        
        
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        
        //System.out.println("Ingresar producto:");
        
        //String numero = reader.nextLine();
        
        list.pushFront("r");
        list.pushFront("y");
        list.pushFront("p");
        list.pushBack("q");
        list.pushFront("a");
        
        String s = list.backElement();
        System.out.println(s);
        
        list.printList();
        
        
        
        
        
        
        
    }
    
    

}
