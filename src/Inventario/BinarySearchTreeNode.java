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
public class BinarySearchTreeNode<T> {
    T key;
    BinarySearchTreeNode<T> leftC;
    BinarySearchTreeNode<T> rightC;
   

    public BinarySearchTreeNode(T key) {
        this.key = key;
        this.leftC = null;
        this.rightC = null;
        
    }
}
