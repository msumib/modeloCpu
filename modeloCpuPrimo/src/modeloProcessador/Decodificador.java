/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloProcessador;

/**
 *
 * @author Administrador
 */
public class Decodificador {
    private String aDecodificar;
    private String operacao;
    private String operando1;
    private String operando2;
    
    public Decodificador(){
        aDecodificar = null;
    }
    
    public void decodificar(String instrucao) {
        instrucao = instrucao.replaceAll(", ", " ");
        String[] palavras = instrucao.split(" ");
        this.operacao = palavras[0].toUpperCase();
        this.operando1 = palavras[1].toUpperCase();
        this.operando2 = palavras[2].toUpperCase();
        if(this.operacao.equals("ADD")){
            //this.soma(this.operando1, this.operando2);
        }
        
    }
    
    /*public int soma(String operando1, String operando2){
        
    }*/
}
