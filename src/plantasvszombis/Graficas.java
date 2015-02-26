
package plantasvszombis;

import java.io.FileWriter;


public class Graficas {
    
    String stringnodos;
    public Nodo nodo;
    
   public void generararchivo1(){
    
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
                stringnodos = stringnodos + aux.getDatos2() + ";" + "\n" ;
                    System.out.println("aux es nulo");
                }
                else{
                
                stringnodos = stringnodos + aux.getDatos2() + "->" + "\n" ;
                    System.out.println("aux no es nullo");
                }
                
                aux=aux.getSiguiente();
            }//////////////////
           
            stringnodos = stringnodos + " \n }"; 
            
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
    
   public void generarimagen1(){
   
   
   try {

       
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String fileInputPath = "C:\\Users\\Gamusa\\Desktop\\archivo.txt";
        String fileOutputPath = "C:\\Users\\Gamusa\\Desktop\\imagenprueba1.jpg";
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
   
}
