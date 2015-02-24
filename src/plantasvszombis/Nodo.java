
package plantasvszombis;

public class Nodo {
    
   public Usuarios datos;
   public int clave;
    public Nodo siguiente;
    
    Nodo(Usuarios datos){
    
        this.datos = datos;
        siguiente = null;

    
    }
    
     public Nodo(Usuarios dato,int clave){
        this.datos=dato;
        this.clave=clave;
        siguiente=null;
    }
    public Object getDato() {
        return datos;
    }

    public void setDato(Usuarios dato) {
        this.datos = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    

   
}
