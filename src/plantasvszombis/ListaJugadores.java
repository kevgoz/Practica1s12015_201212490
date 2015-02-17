
package plantasvszombis;

public class ListaJugadores {
    
    public  Nodo nodo;
    public ListaJugadores(){
        this.nodo=null;
    }
    public boolean esVacia(){
        if(nodo==null){
            
            return true;
        }else{
            return false;
        }
    }
    
        public void insertar(Usuarios dato){
            
        Nodo nuevo=new Nodo(dato);
        if(esVacia()){
            nodo=nuevo;
        }else{
            Nodo aux=nodo;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
        
         public String presentar(){
        String texto="";
        Nodo aux=nodo;
        while(aux!=null){
            texto +=aux.getDato()+" \n ";
            System.out.println(texto+" \n ");
            aux=aux.getSiguiente();
        }
        return texto;
    }
         
          public void insertaFin(Usuarios dato){
        if(!esVacia()){
            Nodo nuevo=new Nodo(dato);
            Nodo aux=nodo;
            while(aux.getSiguiente()!= null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
        }
    }
}
