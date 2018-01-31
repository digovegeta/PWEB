/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Diogo Cardoso
 */
public class Letras {
    
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public int getVogais(){
        int valor = 0;
        char temp;
        for(int i = 0; i < texto.length(); i++){
            temp = getTexto().toLowerCase().charAt(i);
            if( temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' ){
                valor++;
            }
        }
        return valor;
    }

    public int getConsoantes(){
        int valor = 0;
        char temp;
        for(int i = 0; i < texto.length(); i++){
            temp = getTexto().toLowerCase().charAt(i);
            if( temp == 'b' || temp == 'c' || temp == 'd' || temp == 'f' || temp == 'g' 
                || temp == 'h' || temp == 'i' || temp == 'j' || temp == 'l' || temp == 'k' 
                || temp == 'm' || temp == 'n' || temp == 'p' || temp == 'q' || temp == 'r' 
                || temp == 's' || temp == 't' || temp == 'v' || temp == 'x' || temp == 'w' 
                || temp == 'y' || temp == 'z' ){
                valor++;
            }
        }
        return valor;
    }

    public int getOutros(){
        return texto.length() - (getVogais() + getConsoantes());
    }
    
}
