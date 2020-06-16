/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class LeerArhivo {
 File f;
 FileReader lectorArchivo;

 public String leer(String nombre) throws IOException{

try{
    
    f = new File(nombre);
    lectorArchivo = new FileReader(f);
    BufferedReader br = new BufferedReader(lectorArchivo);

    String l="";


    String aux="";

    while(true){
        aux=br.readLine();

    if(aux!=null){
      l=l+aux+"n";  
    }else{
        break;
    }

    }
    br.close();

    lectorArchivo.close();

    return l;

    }catch(IOException e){
        System.out.println("Error:"+e.getMessage());
    }
    return null;
    
    }
 
}
