package modeloProcessador;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Processador {
    private Decodificador decodificador;
    private Registrador[] registrador = new Registrador[8];
    private boolean[] sreg = new boolean[4];

    public Processador() {
        this.decodificador = new Decodificador();        
    }    
}