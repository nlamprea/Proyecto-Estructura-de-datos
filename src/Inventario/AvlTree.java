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





public class AvlTree<T extends Comparable>{
    AvlTreeNode<T> root;
    
    
    public AvlTree() {
        
        this.root = null;
    }
    
    public AvlTreeNode getRoot(){
        return this.root;
    } 
    
    public boolean containtKey(T x){
        return contains(x, root);
    }
    
    private boolean contains(T x, AvlTreeNode<T> node){
        if(node==null){
            return false;
        }
        int compa= x.compareTo(node.key);
        if(compa<0){
            return contains(x,node.left);
        }else if(compa>0){
            return contains(x, node.right);
        }else
            return true;
    }
    
    public AvlTreeNode search(T d, AvlTreeNode<T> r){
        if(root == r){
            return null;
        }
        if(r.key.compareTo(d)==0){
            return r;
        }
        if(r.key.compareTo(d)==-1){
            return r.right!=null?this.search(d, r.right):r;
        }else  
            return r.left!=null?search(d, r.left):r;
    }
    
    public T find(T x){
        return (T) search(x,root);
    }
    /*
    public AvlTreeNode insertAvl(AvlTreeNode<T> newNode, AvlTreeNode<T> node){
        AvlTreeNode<T> newP = node;
        if(newNode.key.compareTo(node.key)<0){
            if(node.left==null){
                node.left = newNode;
                
            }else{
                node.left = insertAvl(newNode,node.left);
                if(getFE(node.left)-getFE(node.right)==2){
                   if(newNode.key.compareTo(node.left.key)<0){
                       
                        newP = leftR(node);
                       
                    }else{
                        newP = doublyRightR(node);
                        
                    }
                }
            }
        }else if(newNode.key.compareTo(node.key)>0){
            if(node.right==null){
                node.right = newNode;
                
            }else{
                node.right = insertAvl(newNode, node.right);
                
                if(getFE(node.right)-getFE(node.left)==2){
                    if(newNode.key.compareTo(node.right.key)>0){
                        newP = rightR(node);
                    }else{
                        newP = doublyLeftR(node);
                    }
                }
            }
        }else{
            System.out.println("Nodo Duplicado");
        }
        if((node.left==null) && (node.right!=null)){
            node.height = node.right.height + 1;
        }else if ((node.right==null) && (node.left!=null)){
            node.height = node.left.height + 1;
        }else{
            node.height = Math.max(getFE(root.left), getFE(root.right))+1;
        }
        return newP;
    }
    public void insert(T ele){
        AvlTreeNode<T> newNode = new AvlTreeNode(ele);
        if(root==null){
            root=newNode;
            
        }else{
            root=insertAvl(newNode,root);
            
        }
    }*/
    
    
    private int getFE(AvlTreeNode<T> x){
        if(x == null){
            return -1;
        }else{
            return x.height;
        }
    }

    
    
    
    
    public AvlTreeNode rightR(AvlTreeNode<T> c){
        AvlTreeNode aux = c.right;
        c.right = aux.left;
        aux.left = c;
        c.height = Math.max(getFE(c.left), getFE(c.right))+1;
        aux.height = Math.max(getFE(aux.left), getFE(aux.right))+1;
        return aux;
    }
    
    public AvlTreeNode leftR(AvlTreeNode<T> c){
        AvlTreeNode aux = c.left;
        c.left = aux.right;
        aux.right = c;
        c.height = Math.max(getFE(c.left), getFE(c.right))+1;
        aux.height = Math.max(getFE(aux.left), getFE(aux.right))+1;
        return aux;
    }
    
    public AvlTreeNode doublyLeftR(AvlTreeNode<T> c){
        AvlTreeNode<T> tmp;
        c.left = rightR(c.left);
        tmp = leftR(c);
        return tmp;
    }
    
    public AvlTreeNode doublyRightR(AvlTreeNode<T> c){
        AvlTreeNode<T> tmp;
        c.right = leftR(c.right);
        tmp = rightR(c);
        return tmp;
    }
    
    public void preOrder(AvlTreeNode<T> node){
        if(node!=null){
            System.out.println(node.key+" ");
            this.preOrder(node.left);
            this.preOrder(node.right);
        }
    }
    
    
    
    public void inOrder(AvlTreeNode<T> node){
        if(node!=null){   
            this.inOrder(node.left);
            System.out.println(node.key+" ");
            this.inOrder(node.right);
        }
    }
    
    public void postOrder(AvlTreeNode<T> node){
        if(node!=null){   
            this.postOrder(node.left);
            this.postOrder(node.right);
            System.out.println(node.key+" ");
            
        }
    }
    
    public boolean isEmpty(){
        return root==null;
    }

    
    
    public void remove( T x )
    {
        root = remove( x, root );
    }

       
  
    private AvlTreeNode<T> remove( T x, AvlTreeNode<T> t )
    {
        if( t == null )
            return t;   
            
        int compareResult = x.compareTo( t.key );
            
        if( compareResult < 0 )
            t.left = remove( x, t.left );
        else if( compareResult > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) 
        {
            t.key = (T) findMin( t.right );
            t.right = remove( t.key, t.right );
        }
        else
            t = ( t.left != null ) ? t.left : t.right;
        return balance( t );
    }
    
   public AvlTreeNode balance (AvlTreeNode<T> t){
       if( t == null )
            return t;
        
        if( getFE( t.left ) - getFE( t.right ) > 1 )
            if( getFE (t.left.left ) >= getFE( t.left.right ) )
                t = leftR( t );
            else
                t = doublyLeftR( t );
        else
        if( getFE( t.right ) - getFE( t.left ) > 1 )
            if( getFE( t.right.right ) >= getFE( t.right.left ) )
                t = rightR( t );
            else
                t = doublyRightR( t );

        t.height = Math.max( getFE( t.left ), getFE( t.right ) ) + 1;
        return t;
    }
   
   
   
   
   
   public AvlTreeNode findMin( AvlTreeNode<T> t )
    {
        if( t == null )
            return t;

        while( t.left != null )
            t = t.left;
        return t;
    }
   
   public T findMin( )
    {
        if( isEmpty( ) )
            System.out.println("Vacio");
        return (T) findMin( root ).key;
    }
    
    
 
    private AvlTreeNode findMax( AvlTreeNode<T> t )
    {
        if( t == null )
            return t;

        while( t.right != null )
            t = t.right;
        return t;
    }
    
    public T findMax( )
    {
        if( isEmpty( ) )
             System.out.println("Vacio");
        return (T) findMax( root ).key;
    }
    
    private AvlTreeNode insertAvl( T x, AvlTreeNode<T> t )
    {
        if( t == null )
            return new AvlTreeNode<T>( x);
        
        int compareResult = x.compareTo( t.key );
        
        if( compareResult < 0 )
            t.left = insertAvl( x, t.left );
        else if( compareResult > 0 )
            t.right = insertAvl( x, t.right );
        else{
            System.out.println("Nodo Duplicado");
        }
        return balance( t );
    }
    
    public void insert(T ele){
        AvlTreeNode<T> newNode = new AvlTreeNode(ele);
        if(root==null){
            root=newNode;
            
        }else{
            root=insertAvl(ele,root);
            
        }
    }
}
