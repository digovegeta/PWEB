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
public class Calcular {
    private int[] vetor;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private int item5;
    private int item6;
    private int item7;
    private int item8;
    private int item9;
    
    public Calcular(){
        gerar();
        vetor = new int[9];
    }

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public int getItem4() {
        return item4;
    }

    public void setItem4(int item4) {
        this.item4 = item4;
    }

    public int getItem6() {
        return item6;
    }

    public void setItem6(int item6) {
        this.item6 = item6;
    }
    
    public int[] getResult(){
        int l1;
        l1=item1+item2+item3;
        item5=l1-(item4+item6);
        item7=l1-(item1+item4);
        item8=l1-(item2+item5);
        item9=l1-(item3+item6);
        
        vetor[1]=item1;
        vetor[2]=item2;
        vetor[3]=item3;
        vetor[4]=item4;
        vetor[5]=item5;
        vetor[6]=item6;
        vetor[7]=item7;
        vetor[8]=item8;
        vetor[9]=item9;
        return vetor;
    }
    private void gerar(){
        Random r = new Random();
        item1 = r.nextInt(1000);
        item2 = r.nextInt(1000);
        item3 = r.nextInt(1000);
        item5 = r.nextInt(1000);
        item6 = r.nextInt(1000);
        
    }
}
