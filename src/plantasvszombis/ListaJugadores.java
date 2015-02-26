
package plantasvszombis;

import java.io.FileWriter;

public class ListaJugadores {
    
    //JugadorPlanta jugadorplanta = new JugadorPlanta();
    public  Nodo nodo;
    public  String stringnodos;
    public  static String nodosplanta;
    
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
        
        //inserta un nuevo nodo en la posicion siguiente = null
        public void insertarzombi(Usuarios2 dato){
            
        Nodo nuevo = new Nodo(dato);
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
         
           //muestra el nodo
         public String presentarzombi(){
        String texto="";
        Nodo aux=nodo;
        while(aux!=null){
            //texto +=aux.getDato()+" \n ";
            texto = texto + aux.getDatos2() + "->";
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
        
         public void insertaFinzombi(Usuarios2 dato){
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
              System.out.println("" + tamano);
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
    
    public String generarnodosplanta(){
        
        nodosplanta ="";
        nodosplanta = nodosplanta + " { rank = same; \n";
            
            /////////////////
            Nodo aux=nodo;
            while(aux!=null){
            
                if(aux.getSiguiente()== null){
                nodosplanta = nodosplanta + aux.getDato() + ";" + "\n" ;
                    System.out.println("aux es nulo");
                }
                else{
                
                nodosplanta = nodosplanta + aux.getDato() + "->" + "\n" ;
                    System.out.println("aux no es nullo");
                }
                
                aux=aux.getSiguiente();
            }//////////////////
           
            nodosplanta = nodosplanta + " \n }"; 
            System.out.println(nodosplanta);
           
    
    
        return stringnodos;
    }
    
    
   public void generar(){
    
     FileWriter fichero = null;
    stringnodos="";
  
        try
        {
           String f = "C:\\Users\\Gamusa\\Desktop\\archivoplanta.txt";
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

   public void generarimagen2(){
   try {

        //path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz

       
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

        //path del archivo creado con el codigo del graphviz que queremos

        String fileInputPath = "C:\\Users\\Gamusa\\Desktop\\archivoplanta.txt";

        //path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

        String fileOutputPath = "C:\\Users\\Gamusa\\Desktop\\imagenplanta.jpg";

        //tipo de imagen de salida, en este caso es jpg

        String tParam = "-Tjpg";

        String tOParam = "-o";

        //concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas

        //recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:

        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = fileInputPath;
        cmd[3] = tOParam;
        cmd[4] = fileOutputPath;

        //Invocamos nuestra clase 

        Runtime rt = Runtime.getRuntime();

        //Ahora ejecutamos como lo hacemos en consola

        rt.exec( cmd );
            System.out.println("correcto");
        } catch (Exception ex) {
        ex.printStackTrace();
        }  finally {
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
   
   ///////////////////metodo para la grafica 1 y archivo 1 /////////////////////
   
   public String retornornodosplanta(){
   
          nodosplanta ="";
            /////////////////
            Nodo aux=nodo;
            while(aux!=null){
            
                if(aux.getSiguiente()== null){
                nodosplanta = nodosplanta + aux.getDato() + ";" + "\n" ;
                    System.out.println("aux es nulo");
                }
                else{
                
                nodosplanta = nodosplanta + aux.getDato() + "->" + "\n" ;
                    System.out.println("aux no es nullo");
                }
                
                aux=aux.getSiguiente();
            }//////////////////
           
            //stringnodos = stringnodos + " \n }"; 
            System.out.println("metodo de plantas "+" ---"+nodosplanta);
            return nodosplanta;
   
   
   }
   
   public void generararchivo1(){
    
     FileWriter fichero = null;
    stringnodos="";
    String a ="siguardo";
  
        try
        {
           String f = "C:\\Users\\Gamusa\\Desktop\\archivozombi.txt";
           stringnodos = stringnodos + "digraph  G { Judagores {rank = same;  Planta->"+nodosplanta+" }{ rank = same; Zombi->";
            
            /////////////////
            Nodo aux=nodo;
            while(aux!=null){
            
                if(aux.getSiguiente()== null){
                stringnodos = stringnodos + aux.getDatos2()+ ";" + "\n" ;
                    System.out.println("aux es nulo");
                }
                else{
                
                stringnodos = stringnodos + aux.getDatos2()+ "->" + "\n" ;
                    System.out.println("aux no es nullo");
                }
                
                aux=aux.getSiguiente();
            }
           
           //////////////
            //retornarnodosplantas();
           
           //retornornodosplanta();
            //retornanodos();
           
           stringnodos = stringnodos + " \n } Judagores -> Planta; Planta-> Zombi  }";
            //stringnodos = stringnodos + " \n } "+a+" Jugador-> Plantas; Plantas ->Zombis; }";
            
           //String a = "hola"+stringnodos+"";
            
            
            fichero = new FileWriter(f);
            fichero.write(stringnodos);
            fichero.close();
            
            //metodos
            System.out.println("entro al metodo generargrafica");
 
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
   
   public String retornanodos(){
   
   
                Nodo aux1=nodo;
            while(aux1!=null){
            
                if(aux1.getSiguiente()== null){
                stringnodos = stringnodos + aux1.getDatos2() + ";" + "\n" ;
                    System.out.println("aux es nulo");
                }
                else{
                
                stringnodos = stringnodos + aux1.getDatos2() + "->" + "\n" ;
                    System.out.println("aux no es nullo");
                }
                
                aux1=aux1.getSiguiente();
            }
            System.out.println("nodos zombi" +  stringnodos);
       return stringnodos;
   
   }
    
   public void generarimagen1(){
   
   
   try {

       
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String fileInputPath = "C:\\Users\\Gamusa\\Desktop\\archivozombi.txt";
        String fileOutputPath = "C:\\Users\\Gamusa\\Desktop\\imagenzombi.jpg";
        String tParam = "-Tjpg";
        String tOParam = "-o";
        
        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = fileInputPath;
        cmd[3] = tOParam;
        cmd[4] = fileOutputPath;
        
        Runtime rt = Runtime.getRuntime();
        
        rt.exec( cmd );
            System.out.println("genero la imagen correctamente");
        } catch (Exception ex) {
        ex.printStackTrace();
        }  finally {
        }
   
   
   }
   
   //////////METODO PARA GARAFICAR Y ARCHIVO 2
   
   
   
   
}
