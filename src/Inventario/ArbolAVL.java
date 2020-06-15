
package Inventario;

public class ArbolAVL {
    private NodoAVL raiz;
    public ArbolAVL(){
        raiz =null;
    }
    
    public NodoAVL buscar(int d, NodoAVL r){
        if(raiz==null){
            return null;
        }
        else
            if(r.dato==d){
                return r;
            }
        else
            if(r.dato<d){
                return buscar(d, r.right);
            }
            else{
                return buscar(d,r.left);
            }
    }
    
    public int obtenerFE(NodoAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
    
    public NodoAVL rotacionLeft(NodoAVL c){
        NodoAVL aux=c.left;
        c.left=aux.right;
        aux.right=c;
        c.fe=Math.max(obtenerFE(c.left), obtenerFE(c.right))+1;
        aux.fe=Math.max(obtenerFE(aux.left), obtenerFE(aux.right))+1;
        return aux;
    }
    public NodoAVL rotacionRight(NodoAVL c){
        NodoAVL aux=c.right;
        c.right=aux.left;
        aux.left=c;
        c.fe=Math.max(obtenerFE(c.left), obtenerFE(c.right))+1;
        aux.fe=Math.max(obtenerFE(aux.left), obtenerFE(aux.right))+1;
        return aux;
    }
    public NodoAVL tocacionDobleLeft(NodoAVL c){
        NodoAVL t;
        c.left=rotacionRight(c.left);
        t=rotacionLeft(c);
        return t;
    }
    public NodoAVL rotacionDobleRight(NodoAVL c){
        NodoAVL t;
        c.right=rotacionLeft(c.right);
        t=rotacionRight(c);
        return t;
    }
}
