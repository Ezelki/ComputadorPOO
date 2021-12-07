/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computador;

/**
 *
 * @author IFSC
 */
public class Processador {
    int cores;
    
    public Processador(){
        cores = 2; //padrão
    }
    
    public Processador(int cores){
        this.cores = cores;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
