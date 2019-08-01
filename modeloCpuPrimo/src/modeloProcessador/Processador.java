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
    private ULA ula;
    private Registrador registrador;
    private boolean[] sreg = new boolean[4];

    public Processador() {
        this.decodificador = new Decodificador();
        this.ula = new ULA();
        this.registrador = new Registrador();
    }

    
}