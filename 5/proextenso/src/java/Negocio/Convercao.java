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
    private int  valor;
    private int totalDeCasas;
    private String centavos;
    private String unidades;
    private String dezenas;
    private String centenas;
    private int uc;
    private int dc;
    private int ur;
    private int dr;
    private int cr;
    
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
    private void nx(){
        uc = this.valor%10;
        this.valor = this.valor/10;
        dc = this.valor%10;
        this.valor = this.valor/10;
        ur = this.valor%10;
        this.valor = this.valor/10;
        dr = this.valor%10;
        this.valor = this.valor/10;
        cr = this.valor%10;
        this.valor = this.valor/10;
    }
    
    public String getExtenso(){
        String result = "valor superios";
        valor = (int) (salario*100);
        if(this.valor>=0 && this.valor <=50000){
            nx();
            getCentena(cr);
            if(dr==1){
                onzeADezenove(ur);
                }else{
                getDezena(dr);
                getUnidade(ur);
            }
            result = centenas;
            if(dezenas.length()!=0){
                if(centenas.length()!=0){
                    result += "e" + dezenas;
                }else{
                    result += dezenas;
                }
            }
            if(unidades.length()!=0&&dr!=1){
                if(dezenas.length()!=0||centenas.length()!=0){
                    result += " e " + unidades;
                }else{
                    result += unidades;
                }
            }
            if(unidades.length() + dezenas.length() + centenas.length()!=0){
                if(ur == 1 && dezenas.length() + centenas.length() == 0){
                    result += " Real";
                }else {
                    result += " Reais"; 
        
                }               
            }
            dezenas = "";
            unidades = "";
            if(dc==1){
                if(unidades.length() + dezenas.length() + centenas.length()!=0){
                    result += " e ";
                }
                onzeADezenove(uc);
            }else{
                getDezena(dc);
                getUnidade(uc);
            }
            result += dezenas;
            if(unidades.length()!=0&&dc!=1){
                if(dezenas.length()!=1){
                    result += " e " + unidades;
                }else{
                    result += unidades;
                }
            }
            if(unidades.length() + dezenas.length()!=0){
                if(uc == 1 &&  dezenas.length() == 0){
                    result += " Centavo";
                }else{
                    result += " Centavos";                
                }
            }
            //result += dezenas + unidades + " Centavos. R$ " + salario;
        }
        return result;
    }
    
    private void getCentena(int n){
        String result = "";
        switch (n){
            case 1:
                result = "cento ";
                break;
            case 2:
                result = "duzentos ";
                break;
            case 3:
                result = "trezentos ";
                break;
            case 4:
                result = "quatrocntos ";
                break;
            case 5:
                result = "quinhentos ";
                break;
        }
        centenas = result;
    }
    private void onzeADezenove(int n){
        String result = "";
        switch (n){
            case 1:
                result +=  " onze ";
                break;
            case 2:
                result +=  " doze ";
                break;
            case 3:
                result +=  " treze ";
                break;
            case 4:
                result +=  " quartoze ";
                break;
            case 5:
                result +=  " quinze ";
                break;
            case 6:
                result +=  " dezesseis ";
                break;
            case 7:
                result +=  " desessete ";
                break;
            case 8:
                result +=  " dezoito ";
                break;
            case 9:
                result +=  " dezenove ";
                break;
            case 0:
                result +=  " dez ";
                break;
        }
        dezenas = result;
    }
    private void getDezena(int n){
        
        String result = "";
        switch (n){
            case 1:
                break;
            case 2:
                result +=  " vinte ";
                break;
            case 3:
                result +=  " trinta ";
                break;
            case 4:
                result +=  " quarenta ";
                break;
            case 5:
                result +=  " cinquenta ";
                break;
            case 6:
                result +=  " secenta ";
                break;
            case 7:
                result +=  " setenta ";
                break;
            case 8:
                result +=  " oitenta ";
                break;
            case 9:
                result +=  " noventa ";
                break;
            case 0:
                break;
        }
        dezenas = result;
    }
    private void getUnidade(int n){
        String result = "";
        if(this.salario == 1){
            result = " e";
        }
        switch (n){
            case 1:
                result +=  " um";
                break;
            case 2:
                result +=  " dois";
                break;
            case 3:
                result +=  " três";
                break;
            case 4:
                result +=  " quatro";
                break;
            case 5:
                result +=  " cinco";
                break;
            case 6:
                result +=  " seis";
                break;
            case 7:
                result +=  " sete";
                break;
            case 8:
                result +=  " oito";
                break;
            case 9:
                result +=  " nove";
                break;
            case 0:
                break;
        }
        unidades = result;
    }
}
