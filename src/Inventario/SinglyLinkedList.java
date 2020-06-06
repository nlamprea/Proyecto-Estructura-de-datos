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
public class SinglyLinkedList<T>{
    
    SinglyLinkedListNode<T> head;
    SinglyLinkedListNode<T> tail;
    
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    public void pushFront(T var){
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<T>(var);
        
        if(this.head==null){
            this.head = node;  
            this.tail = this.head;
        }else{
            node.next = this.head;
            this.head = node;
        }
       
        
    }
    
    public void pushBack(T val){
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<T>(val);
        
        if(this.head==null){
            this.head = this.tail = node;
           
        }else{
            
            this.tail.next = node;
            this.tail = node;
        }
        
        
    }
    
    public boolean isEmpty(){
        
        return head==null;
    }
    
    public void popFront(){
        if (this.head==null){
            System.out.println("Error!!Empty List");
            this.tail = null;
        }else{
            this.head = this.head.next;
        }   
    }
    
    public void popBack(){
        if (this.head==null){
            System.out.println("Error!!Empty List");
            
        }
        
        if (this.head==this.tail){
            this.head=this.tail=null;
        }else{
            SinglyLinkedListNode<T> p = head;
            while(p.next.next!=null){
                p = p.next;
            }p.next = null;
            this.tail = p;
        }
    }
    
    public void AddAfter(SinglyLinkedListNode<T> node, T key){
        SinglyLinkedListNode<T> nodein = new SinglyLinkedListNode<T>(key);
        
        nodein.next = node.next;
        node.next = nodein;
        
        if (tail==node){
            head = nodein;
        }
    }
    
    public void FindKey(T value){
        SinglyLinkedListNode<T> rv=null;
        SinglyLinkedListNode<T> p = this.head;
        
        while(p.next!=null){
            
            
            if (value==p.data){
                rv = p;
                
                break;
            }
            p = p.next;
        }
        if(value!=p.data){
                    
                    System.out.println("No se encuentra!!");
        }else{
            System.out.println(rv.data);
        }  
               
            
    }
    
    public T frontElement(){
        if (!isEmpty()){
            return head.data;
        }
        
        return head.data;
    }
    
    public T backElement(){
        SinglyLinkedListNode aux = head;
        SinglyLinkedListNode pr = null;
        if (isEmpty()){
            return null;
        }else{
            
            while(aux!=null){
                pr = aux;
                aux = aux.next;
            }
        }
        return (T) pr.data;
    }
    public void printList(){
        int i=0;
        if (head==null){
            return;
        }else{
            SinglyLinkedListNode<T> p = head;
            while(p!=null){
                
                System.out.println(i+"#--> "+p.data);
                p = p.next;
                i+=1;
            }
        }
    }
   
    
    
}
