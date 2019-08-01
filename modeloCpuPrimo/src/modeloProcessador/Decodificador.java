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
        for(int i = 0; i < palavras.length; i++){
            System.out.println("Palavra " + i + ": " + palavras[i]);
            
        }
    }
}
