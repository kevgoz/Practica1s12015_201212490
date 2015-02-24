
package plantasvszombis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;

public class ListaJugadores {
    
    public  Nodo nodo;
    public String stringnodos;
    
    //contructor de la lista
    public ListaJugadores(){
        this.nodo=null;
    }
    
    //retorna si esta vacio o no
    public boolean esVacia(){
        if(nodo==null){
            
            return true;
        }else{
            return false;
        }
    }
    
    //inserta un nuevo nodo en la posicion siguiente = null
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
        
        //muestra el nodo
         public String presentar(){
        String texto="";
        Nodo aux=nodo;
        while(aux!=null){
            //texto +=aux.getDato()+" \n ";
            texto = texto + aux.getDato() + "->";
            System.out.println(texto);
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
          
     int indice_nodo=0;
    public Nodo buscarNodoIndice(int indice){
		Nodo aux = nodo;
		int tamano = 0;
	    while(aux!= null){
	    	if(tamano==indice)
	    		return aux;
	    	aux = aux.siguiente;
	    	tamano++;
	    }
		return null;
	}
    
    public String recorrido(Nodo aux){
    // aux = nodo;
    if( aux == null){
    
        return null;
    
    }
    else{
    
        stringnodos = stringnodos + aux.getDato() + "->" + aux.getSiguiente().getDato() + "\n";
        
     
    }
       
    recorrido(aux.getSiguiente());
    return stringnodos;
    }
    
    
   public void generar(){
    
     FileWriter fichero = null;
    stringnodos="";
  
        try
        {
           String f = "C:\\Users\\Gamusa\\Desktop\\archivo.txt";
           stringnodos = stringnodos + "digraph  G { rankdir=LR node [shape=box, color=blue] \n";
            
            /////////////////
            Nodo aux=nodo;
            
            while(aux!=null){
            
                if(aux.getSiguiente()== null){
                stringnodos = stringnodos + aux.getDato() + ";" + "\n" ;
                    System.out.println("aux es nulo");
                }
                else{
                
                stringnodos = stringnodos + aux.getDato() + "->" + "\n" ;
                    System.out.println("aux no es nullo");
                }
                
                aux=aux.getSiguiente();
                 
              
            }//////////////////
           
            stringnodos = stringnodos + " \n }"; 
            
            fichero = new FileWriter(f);
            fichero.write(stringnodos);
            fichero.close();
            
            //metodos
            System.out.println("entro al metodo generar");
 
            
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    
    
    }
    
//    String stringnodos;
//    public void buscarnodo(Nodo nodo){
//     Nodo temp = nodo.siguiente;
//        if(nodo == null){
//        
//            return ;
//        }
//        else
//        {
//       
//        stringnodos = stringnodos +  temp.getDato().toString() + "->" +  temp.getSiguiente().getDato().toString()+ "\n";
//        
//        }
//         buscarnodo(temp.getSiguiente()); 
//        System.out.println("metodo entre nodos");
//       // return stringnodos;
//    }
//    
}
