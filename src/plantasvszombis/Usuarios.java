
package plantasvszombis;

public class Usuarios {
    
    public String nombre;
    public int cantidad;
    public String otro;
  

    public Usuarios(String nombre, int cantidad, String otro) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.otro = otro;
        
    }

    Usuarios() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void set(String nombre) {
        this.nombre = nombre;
    }

    public int getCant() {
        return cantidad;
    }

    public void setCant(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getOtro() {
        return otro;
    }

    public void setNombres(String nombres) {
        this.otro = nombres;
    }

   

    @Override
    public String toString() {
        return nombre +" "+cantidad+" "+otro;
    }

}