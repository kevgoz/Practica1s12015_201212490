
package plantasvszombis;

public class Usuarios {
    
    public String nombre;
    public String cantidad;
    public String otro;
  

    public Usuarios(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
          
    }

    Usuarios() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void set(String nombre) {
        this.nombre = nombre;
    }

    public String getCant() {
        return cantidad;
    }

    public void setCant(String cantidad) {
        this.cantidad = cantidad;
    }

 
   

    @Override
    public String toString() {
        return nombre +" "+cantidad;
    }

}