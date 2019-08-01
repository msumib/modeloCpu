
import modeloMemoria.MP;
import modeloProcessador.Decodificador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Program {
    public static void main(String[] args) {
        String codigo = "MOV R1, #10\n" +
                        "MOV R2, #6\n" +
                        "ADD R1, R2\n" +
                        "ADD R2, #8";
        String[] resp = new String[100];
        resp = codigo.split("\n");        
        MP memoria = new MP();
        memoria.setInstrucoes(resp);
        //memoria.print();
        
        Decodificador dec = new Decodificador();
        dec.decodificar(resp[0]);
        
    }
}
