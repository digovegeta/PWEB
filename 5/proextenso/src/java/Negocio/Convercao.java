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
public class Convercao {
    
    private String nome;
    private String cpf;
    private double salario;
    private double  valor;
    private int totalDeCasas;
   
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    private double getTotalDeCasas(){
        double x = this.valor;
        while(x>=0){
            this.totalDeCasas++;
        }
        return this.totalDeCasas;
    }
    private int nx(){
        int r = (int) this.valor%10;
        this.valor = this.valor/10;
        return r;
    }
    
    public String getExtenso(){
        String result = "valor superios";
        
        if(this.valor>=0 && this.valor <=50000){
            result = getCentena(nx()) + getDezena(nx()) + getUnidade(nx()) + "Reais";
        }
        return result;
    }
    
    private String getCentena(int n){
        String result = "";
        switch (n){
            case 1:
                result = "cento";
                break;
            case 2:
                result = "duzentos";
                break;
            case 3:
                result = "trezentos";
                break;
            case 4:
                result = "quatrocntos";
                break;
            case 5:
                result = "quinhentos";
                break;
        }
        return result;
    }
    private String outro(){
        
    }
    private String getDezena(int n){
        
        String result = "";
        if(this.salario == 1){
            result = " e";
        }
        switch (n){
            case 1:
                outro();
                break;
            case 2:
                result +=  " vinte";
                break;
            case 3:
                result +=  " trinta";
                break;
            case 4:
                result +=  " quarenta";
                break;
            case 5:
                result +=  " cinquenta";
                break;
            case 6:
                result +=  " secenta";
                break;
            case 7:
                result +=  " setenta";
                break;
            case 8:
                result +=  " oitenta";
                break;
            case 9:
                result +=  " noventa";
                break;
            case 0:
                break;
        }

        return result;
    }
    private String getUnidade(int n){
        String result = "";
        if(this.salario == 1){
            result = " e";
        }
        switch (n){
            case 1:
                result +=  "um";
                break;
            case 2:
                result +=  "dois";
                break;
            case 3:
                result +=  "três";
                break;
            case 4:
                result +=  "quatro";
                break;
            case 5:
                result +=  "cinco";
                break;
            case 6:
                result +=  "seis";
                break;
            case 7:
                result +=  "sete";
                break;
            case 8:
                result +=  "oito";
                break;
            case 9:
                result +=  "nove";
                break;
            case 0:
                break;
        }
        return result;
    }
}
