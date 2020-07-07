/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author USER
 */
class HashNode<T extends Comparable<? super T>,K>{
    T key;
    K value;
    HashNode<T,K> next;

    public HashNode(T key, K value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
    
    
}
public class HashMap<T extends Comparable<? super T>,K> {
    int cardinality;
    int size;
    boolean[] neverUsed;
    HashNode<T, K>[] table;

    public HashMap(int incapacity) {
        this.cardinality = incapacity;
        this.size = 0;
        this.neverUsed = new boolean[cardinality];
        this.table = new HashNode[cardinality];
        Arrays.fill(neverUsed, true);
    }
    
    
    public boolean isEmpty( )
   {
      return size == 0;
   }
    
    
    public int size( )
   {
      return size;
   }
    
    public K put( T theKey, K theElement )
   {
      
      int b = search( theKey );

      
      if( neverUsed[ b ] )
      {
         
         table[ b ] = new HashNode<T, K>( theKey, theElement );
         neverUsed[ b ] = false;
         size++;
         return null;
      }
      else
      { 
         if( table[ b ].key.equals( theKey ) )
         {  
            K elementToReturn = table[ b ].value;
            table[ b ].value = theElement;
            return elementToReturn;
         }
         else throw new IllegalArgumentException( "table is full" );
      }
   }
    
    
    
    
    private int search( T theKey )
   {
      int i = Math.abs( theKey.hashCode() ) % cardinality;
      int j = i; 
      do
      {
         if( neverUsed[ j ] ||
             ( table[ j ] != null && table[ j ].key.equals( theKey ) ) )
            return j;
         j = ( j + 1 ) % cardinality; 
      } while( j != i ); 

      return j;
   }
    
    public K get( T theKey )
   {
      
      int b = search( theKey );

      
      if( neverUsed[ b ] || !table[ b ].key.equals( theKey ) )
         return null; 

      return table[ b ].value; 
   }
    
    public K remove( T theKey )
   {
      
      int b = search( theKey );

      if( neverUsed[ b ] )
         return null; 
      if( table[ b ].key.equals( theKey ) )
      {
         K elementToReturn = table[ b ].value;
         table[ b ] = null;
         size--;
         return elementToReturn;
      }
      else
         return null;
   }
    
    public String toString( )
   {
      StringBuilder s = new StringBuilder( "\n[" );

      
      for( int i = 0; i < cardinality; i++)
         s.append( "{" + Objects.toString( table[ i ] ) +
                   "," + ( neverUsed[ i ] ? "T" : "F" ) + "}, " );

      if( size > 0 )
         s.setLength( s.length( ) - 2 ); 

      s.append( "]\n" );

      
      return new String( s );
   }
    
   
}
