/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloMemoria;

/**
 *
 * @author Administrador
 */
public class MP {
    private String[] instrucoes = new String[100];

    public MP() {
    }

    public MP(String[] inst) {
        this.instrucoes = inst;
    }    
    
    public String[] getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String[] instrucoes) {
        this.instrucoes = instrucoes;
    }
    
    public void flush() {
        this.instrucoes = new String[100];
    }
    public void print() {
        for(int i = 0; i < this.instrucoes.length; i++){
            System.out.println("Celula " + i + ": " + this.instrucoes[i]);
        }
    }
}
