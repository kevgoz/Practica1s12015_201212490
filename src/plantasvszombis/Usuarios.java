
package plantasvszombis;

public class Usuarios {
    
    public String nombre;
    public String cantidad;
    public String otro;

   
  

    public Usuarios(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
          
    }
    
     public Usuarios(String otr) {
        this.otro = otr;
        
          
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

     public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }
   

    @Override
    public String toString() {
        return nombre +"->"+cantidad;
    }

}