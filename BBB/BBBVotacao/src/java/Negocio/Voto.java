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
public class Voto {

    private String votadoNome;
    private String votadoNumero;
    private int v1;
    private int v2;
    private final String nome1 = "Diogo";
    private final String nome2 = "Neto";
    
    
    public String getVotadoNome() {
        return votadoNome;
    }

    public void setVotadoNome(String votadoNome) {
        this.votadoNome = votadoNome;
    }

    public String getVotadoNumero() {
        return votadoNumero;
    }

    public void setVotadoNumero(String votadoNumero) {
        this.votadoNumero = votadoNumero;
    }
    
    public String getVoto(){
        if(votadoNome.equalsIgnoreCase(nome1) || votadoNumero.equalsIgnoreCase("1")){
           v1++;
           votadoNome = "Diogo";
        }else if(votadoNome.equalsIgnoreCase(nome2) || votadoNumero.equalsIgnoreCase("2")){
            v2++;
           votadoNome = "Neto";
        }
        return "voto computado " + votadoNome;
    }
    public String getResult(){
        int soma = v1 +v2;
        return "Diogo " + ((v1 / soma) * 100) + " % Neto" + ((v2 / soma) * 100) + " % ";
    }
}
