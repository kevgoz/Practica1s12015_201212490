
package plantasvszombis;


public class Usuarios2 {
    
    public String nombre;
    public String cantidad;
    public String otro;


    public Usuarios2(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
          
    }
    
     public Usuarios2(String otr) {
        this.otro = otr;
        
          
    }


    Usuarios2() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
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
