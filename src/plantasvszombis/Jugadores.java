
package plantasvszombis;


public class Jugadores {
    
     
    public String nombre;
    public String cantidad;
    
  

    public Jugadores(String nombre) {
        this.nombre = nombre;
        //this.cantidad = cantidad;
       
        
    }

    Jugadores() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void set(String nombre) {
        this.nombre = nombre;
    }

   
  
   

    @Override
    public String toString() {
        return nombre;
    }
    
}
