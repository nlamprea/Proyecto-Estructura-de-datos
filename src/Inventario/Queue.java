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
public class Queue {

    private final int N=4;
    private int front,rear,count,qarray[];
    
    public Queue(){
        front = rear = count = 0;
        qarray = new int[N];
  
    }
    
    public int dequeue(){
        int item = -1;
        if (empty()){  
            System.out.println("Cola esta vacia");
        }else{
            item = qarray[front];
            front = (front+1)%N;
            count--; 
        }
        return item;
    }
    
    public void enqueue(int item){
        if (full()){  
            System.out.println("La Cola esta lleno");
        }else{
            qarray[rear]= item;
            rear = (rear+1)%N;
            count++;
        }
        
    }
    
    public boolean empty(){
        return count<=0;
    }
    
    public boolean full(){
        return count>=N;
    }
}