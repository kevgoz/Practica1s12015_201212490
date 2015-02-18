/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombis;

/**
 *
 * @author Gamusa
 */
public class Lista {
    
     
    public  Nodos nodo;
    public Lista(){
        this.nodo=null;
    }
    public boolean esVacia(){
        if(nodo==null){
            
            return true;
        }else{
            return false;
        }
    }
    
        public void insertar(Jugadores datos){
            
        Nodos nuevo = new Nodos(datos);
        if(esVacia()){
            nodo=nuevo;
        }else{
            Nodos aux=nodo;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
        
         public String presentar(){
        String texto="";
        Nodos aux=nodo;
        while(aux!=null){
            texto +=aux.getDato()+" \n ";
            System.out.println(texto+" \n ");
            aux=aux.getSiguiente();
        }
        return texto;
    }
         
          public void insertaFin(Jugadores dato){
        if(!esVacia()){
            Nodos nuevo=new Nodos(dato);
            Nodos aux=nodo;
            while(aux.getSiguiente()!= null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
        }
    }
          
      
    
}
