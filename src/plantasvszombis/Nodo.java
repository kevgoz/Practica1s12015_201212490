
package plantasvszombis;



public class Nodo {
    
   public Usuarios datos;

   public Usuarios2 datos2;

   
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
    
     
    Nodo(Usuarios2 datos){
    
        this.datos2 = datos;
        siguiente = null;

    
    }
    
     public Nodo(Usuarios2 dato,int clave){
        this.datos2 =dato;
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
    
    
    public Usuarios2 getDatos2() {
        return datos2;
    }

    public void setDatos2(Usuarios2 datos2) {
        this.datos2 = datos2;
    }
  
}
