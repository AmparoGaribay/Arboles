/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles2;

/**
 *
 * @author AMPARO
 */
public class Arbol {
        Nodo arbol;

    
    public Nodo getArbol() {
        return arbol;
    }

    public void setArbol(Nodo arbol) {
        this.arbol = arbol;
    }
    
    public  Nodo Insertar_arbol(Nodo arbol, String dato) {
        Nodo nuevo= new Nodo(dato);
        
       if (arbol==null){
           arbol=nuevo;
       }else{
           if (arbol.getDato().charAt(0)>dato.charAt(0)){//se emplea el charAt();
               if (arbol.getIzquierda()==null){
                   arbol.setIzquierda(nuevo);
               }else{
                   setArbol(Insertar_arbol(arbol.getIzquierda(), dato));
                  
               }
           }else{
               if(arbol.getDerecha()==null){
                   arbol.setDerecha(nuevo);
               }else{
                   setArbol(Insertar_arbol(arbol.getDerecha(), dato));
               }
           }
       }
            
        
        return arbol;
    }
    
    
   /* public String preorder(Nodo Arbol){
        Nodo nuevo= new Nodo(Arbol.getDato());
        if (Arbol.getIzquierda()==null){
            Arbol= nuevo;
        }else{
          if (Arbol.getIzquierda()!=null){
             
              preorder(Arbol.getIzquierda());
          }else{
              if (arbol.getDerecha()!=null){
                  preorder(Arbol.getDerecha());
              
              }
          }   
        }
    
    */
    
    
    public String inorden(Nodo Arbol){//raiz izquierda derecha
        
          if(Arbol==null){
              return "";
       }else{
          
              
                   return (inorden(Arbol.getIzquierda())+" "+Arbol.getDato()+" " +inorden(Arbol.getDerecha()));
          }
     

    }
        
    
    public String preorden(Nodo Arbol){
        if(Arbol==null){
            return "";
        }
        else{
            ///igual a inorder
            return (Arbol.getDato()+" "+ preorden(Arbol.getIzquierda())+" "+ preorden(Arbol.getDerecha()));
        }
    }
    
    public String postorden(Nodo Arbol){
        if(Arbol==null){
            return "";
        }
        else{
            
            return postorden(Arbol.getIzquierda())+" "+ postorden(Arbol.getDerecha())+" "+Arbol.getDato();
        }
    }
        
       /*
       if(Arbol.getIzquierda()==null){
           if (Arbol.getDerecha()==null){
               return "Vacio";
                
            }
           
       }else{
           if(Arbol.getIzquierda()!=null){
               if (Arbol.getDerecha()!=null){
                   return (Arbol.getIzquierda().getDato()+"#" +Arbol.getDerecha().getDato());
               }
           }else{
               return (Arbol.getIzquierda().getDato()+"#"+Arbol.getDerecha().getDato()+preorder(Arbol));
           }
       }
            return " ";
       
    }//metodo
    */
    
    
    
}//clase
   
    

    




