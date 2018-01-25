package Negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diogo Cardoso
 */
public class IMC {
    private String nome;
    private double altura;
    private double peso;
    private double result;
    private String sResult = "";
    
    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    private double getCalculo(){
        result = peso / (altura*altura);
        return result;
    }
    
    public String getResult(){
        getCalculo();
        if(result<25){
            sResult = "com peso normal";
        }else if(result>30){
            sResult = "obeso";            
        }else{
            sResult = "sobre peso";
        }
        return getNome()+ " está " + sResult + " com IMC " + result;
    }
}
