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
public class Nodo {
    String dato;
    Nodo izquierda;
    Nodo derecha;
    
    Nodo(String dat){
        dato=dat;
        izquierda=null;
        derecha= null;
    }

    public String getDato() {
        return dato;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
    
}
