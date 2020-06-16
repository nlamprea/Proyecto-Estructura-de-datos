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


public class BinarySearchTree<T extends Comparable>{
    
    BinarySearchTreeNode<T> root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public BinarySearchTreeNode getRoot(){
        return this.root;
    }
    public void makeEmpty(){
     root=null;   
    }
    
    public boolean isEmpty(){
        return root==null;
    }
    
    public BinarySearchTreeNode find(T data,BinarySearchTreeNode<T> node){
        if(node.key.compareTo(data)==0){
            return node;
        }else if(data.compareTo(node.key)<0){
            if(node.leftC==null){
                return find(data,node.leftC);
            }
            
        }
        return node; 
    }
    
    
    
    private BinarySearchTreeNode insertEl(T data, BinarySearchTreeNode<T> node){
        if(node==null){
            return new BinarySearchTreeNode(data);
        }
        int comp =data.compareTo(node.key);
        if (comp<0){
            node.leftC = insertEl(data, node.leftC);
        }else if(comp>0){
            node.rightC= insertEl(data, node.rightC);
        }else;
        return node;
    }
    
    public void insert(T ele){
        root = insertEl(ele, root);
    }
    
    
    private int height(BinarySearchTreeNode<T> node){
        if(node==null){
            return -1;
        }else{
            return 1+Math.max(height(node.leftC), height(node.rightC));
        }
    }
    public int size(){
       return 0; 
    }  
    
    
    
    private BinarySearchTreeNode next(BinarySearchTreeNode<T> node){
        if(node.rightC!=null){
            return this.leftDescendant(node.rightC);
        }
        return this.rightAncestor(node); 
    }
    
    private BinarySearchTreeNode leftDescendant(BinarySearchTreeNode<T> node){
        if(node.leftC!=null){
            return this.leftDescendant(node.leftC);
        }
        return node;
    }
    
    private BinarySearchTreeNode rightAncestor(BinarySearchTreeNode<T> node){
        if(node.key.compareTo(node.key)<0){
            return node;
        }
        return this.rightAncestor(node);
    }
    
    public void preOrder(BinarySearchTreeNode<T> node){
        if(node!=null){
            System.out.println(node.key+" ");
            this.preOrder(node.leftC);
            this.preOrder(node.rightC);
        }
    }
    
    
    
    public void inOrder(BinarySearchTreeNode<T> node){
        if(node!=null){   
            this.inOrder(node.leftC);
            System.out.println(node.key+" ");
            this.inOrder(node.rightC);
        }
    }
    
    public void postOrder(BinarySearchTreeNode<T> node){
        if(node!=null){   
            this.postOrder(node.leftC);
            this.postOrder(node.rightC);
            System.out.println(node.key+" ");
            
        }
    }

}
