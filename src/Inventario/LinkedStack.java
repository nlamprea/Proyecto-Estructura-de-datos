/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author USER
 */
class Node<T>{
    T data;
    Node<T> next;
    
    
    public Node (T key, Node<T> head){
        this.data = key;
        this.next = head; 
    }
}



public class LinkedStack<T> {

    private Node<T> top;
    
    public LinkedStack(){
     top = null;
    }
    
    
    
    public boolean isEmpty(){
        if (top!=null){
            return false;
        }
        return true;
    }
    
    public T peek(){
        if (isEmpty()){
            return null;
        }
        return top.data;
        
        
    }

    public void push(T element){
      Node<T> newNode = new Node<T>(element,top);
      newNode.next = top;
      top = newNode;
        
    }
    
    public T pop(){
        T popEl;
        if (isEmpty()){
            return null;
        }else{
            popEl = top.data; 
            top = top.next;
        }
        return popEl;
    }
    
    
   
}
