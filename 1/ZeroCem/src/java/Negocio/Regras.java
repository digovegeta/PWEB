/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Random;

/**
 *
 * @author Diogo Cardoso
 */
public class Regras {

    private int numero;
    private int sorteado;
    private String tentativas = "";
    public Regras(){
        sortear();
    }
    private void sortear(){
        Random r = new Random();
        this.setSorteado(r.nextInt(101));
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSorteado() {
        return sorteado;
    }

    private void setSorteado(int sorteado) {
        this.sorteado = sorteado;
    }
    public String getTentativas(){
        tentativas = tentativas + "<br> o número já giditado " + getNumero();
        return tentativas;
    }
    public String getResult(){
        String r = "o numero " + getNumero();
        if(getNumero() == getSorteado()){
            return r + " é igual ao numero " + getSorteado();
        }else if(getNumero() > getSorteado()){
            return r + " é maior gerado";
        }else{
            return r + " é menor gerado";
        }
    }
}
