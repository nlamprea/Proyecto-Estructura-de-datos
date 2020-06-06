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
public class SinglyLinkedListNode<T> {
    public T data;
    public SinglyLinkedListNode<T> next;
    
    public SinglyLinkedListNode(T key){
        this.data = key;
        this.next = null;
    }
    
    
    
}
