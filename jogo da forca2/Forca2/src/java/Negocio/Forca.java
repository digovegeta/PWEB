/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Random;
import java.lang.String;

/**
 *
 * @author Diogo Cardoso
 */
public class Forca {
    private String letra = "";
    private String jogo = "";
    private int bt;
    private String palavra;
    private String dica;
    private int valor;
    private int tentativas = -1;
    private int chances = 10;
    private String letrasTentadas = "";
    
    public int getBt() {
        return bt;
    }
    public String getLetrasTentadas(){
        return " Tentativas anteriores: " + letrasTentadas + ".";
    }
    public int getTentativas() {
        return tentativas;
    }
    public int getValor() {
        return valor;
    }
    public String getPalavra() {
        return palavra;
    }
    public String getDica() {
        return "A dica da palavra é\" " + dica + "\"";
    }
    public String getLetra() {
        if(this.tentativas == 0){
            return "";
        }else{ 
            return "Você utilizou a letra; " +letra;
        }
    }
    public String getJogo(){
        String temp = "";
        for(int i = 0;i<palavra.length();i++){
            temp += jogo.charAt(i) + " ";
        }
        return temp + " <br> A palavra tem " + palavra.length() + " letras.";
    }
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    public void setDica(String dica) {
        this.dica = dica;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    public void setBt(int bt) {
        this.bt = bt;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    private void setJogo(){
        int i;
        for(i = 0; i< palavra.length();i++){
            jogo += "_";
        }
    }
    
    public String getResposta(){
        if(tentativas < 0){
            gerarPalavra();
            setJogo();
        }else{
            guardarLetras();
            verificao();
        }
        tentativas++;
        return bt + "";
    }
    
    private void carro(){
        switch (valor){
            case 1:
                palavra = "astra";
                dica = "estrelas";
                break;
            case 2:
                palavra = "fusca";
                dica = "se ele falasse";                
                break;
            case 3:
                palavra = "cadilac";
                dica = "toda rita tem";
                break;
            case 4:
                palavra = "mustang";
                dica = "eleanor";
                break;
            case 5:
                palavra = "kadet";
                dica = "patente";
                break;
        }
    }
    private void novela(){
        
    }
    private void filme(){
        
    }
    private void guardarLetras(){
        if(letrasTentadas.length()==0){
            this.letrasTentadas += letra;            
        }else{
            this.letrasTentadas += " - " + letra;        
        }
    }

    private void gerarPalavra(){
        Random r = new Random();
        this.valor = r.nextInt(5);
       
        switch (bt){
            case 1:
                filme();
                break;
            case 2:
                novela();
                break;
            case 3:
                carro();
                break;
        }
    }
    public String getCondicaoDeVitoria(){
        if(jogo.equalsIgnoreCase(palavra)){
            tentativas=-1;
            valor=0;
            jogo="";
            letra="";
            return "Parabens a pavavra\" " + palavra + "\" esta correta";
        }else {
            if(chances <= tentativas){
                return "você perdeu!";                
            }else{
                return "Ainda restam " + (chances - tentativas) + " tentativas para acertar a palavra";
            }
        }
    }
    private void verificao(){
        String temp = "";
        for(int i = 0; i < palavra.length();i++ ){
            if(jogo.charAt(i) == '_'){
                if(letra.charAt(0) == palavra.charAt(i)){
                    temp += palavra.charAt(i);
                }else{ 
                    temp += "_";
                }
            }else{
                temp += palavra.charAt(i);
            }
        }
        jogo = temp;
    }
}

