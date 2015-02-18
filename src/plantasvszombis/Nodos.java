
package plantasvszombis;


public class Nodos {
    
    
   public Jugadores datos;
   public int clave;
    public Nodos siguiente;
    
    Nodos(Jugadores datos){
    
        this.datos = datos;
        siguiente = null;

    
    }
    
     public Nodos(Jugadores dato,int clave){
        this.datos=dato;
        this.clave=clave;
        siguiente=null;
    }
    public Object getDato() {
        return datos;
    }

    public void setDato(Jugadores dato) {
        this.datos = dato;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }
    

   
    
}
