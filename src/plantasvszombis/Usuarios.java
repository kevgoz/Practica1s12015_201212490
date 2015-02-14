
package plantasvszombis;

public class Usuarios {
    
   Nodo cabeza;
   
   Usuarios(){
   
   cabeza = null;
   
   }
    
public boolean SinUsuarios(){

    if (cabeza== null) {
            
        return true;
        } else {
        
            return false;
        }

}

public void nuevodato(String dato){

    Nodo nuevo = new Nodo(dato);
    if(SinUsuarios()){
        
        cabeza = nuevo;

    }
    
    else{
    
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    
    }

}

public String recorrer(){

    String info;
    Nodo aux = cabeza;
    
    while(cabeza!= null){
    
    info = aux.datos + "\n ";
    aux = aux.siguiente;
    
    }


    

}