/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles2;

import javax.swing.JOptionPane;

/**
 *
 * @author AMPARO
 */
public class Arboles2 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol2= new Arbol();
        int option=0;
           try {
             do{
                 
                    
                 option = Integer.valueOf(JOptionPane.showInputDialog(null, "Arboles binarios"+ "\n"+
                         "1. Insertar "+ "\n"+
                         "2. inorden "+ "\n"+
                         "3. preorden "+ "\n"+ 
                         "4. posorden"+"\n"+
                         "5. salir  "+ "\n"));

                    switch(option){
                        case 1: 
                          String valor= JOptionPane.showInputDialog(null, "Insertar Arboles"+"\n");
                        arbol2.setArbol(arbol2.Insertar_arbol(arbol2.getArbol(), valor));

                            break;

                        case 2:
                            
                            JOptionPane.showMessageDialog(null,"INORDEN"+"\n"+arbol2.inorden(arbol2.getArbol()));
                            break;
                            
                        case 3:
                            
                            JOptionPane.showMessageDialog(null,"PREORDEN"+"\n"+ arbol2.preorden(arbol2.getArbol()));
                            
                            break;
                            
                        case 4:
                            JOptionPane.showMessageDialog(null,"POSORDEN"+"\n"+arbol2.postorden(arbol2.getArbol()));
                            break;
                    }//switch
                    }while(option!=5);

       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "no disponible");
       } 
    }
    
}
