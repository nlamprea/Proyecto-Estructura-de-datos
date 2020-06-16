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
public class AvlTreeNode<T> {
    T key;
    int height;
    AvlTreeNode left,right;

    public AvlTreeNode(T key) {
        this.key = key;
        this.height = 0;
        this.left = null;
        this.right = null;
    }
    
    
    
    
    
}
