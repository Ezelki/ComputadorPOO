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
public class Ram {
    int qntRam;
    
    public Ram(){
        qntRam = 2; // padrão
    }
    
    public Ram(int qntRam){
        this.qntRam = qntRam; //definir
    }

    public int getQntRam() {
        return qntRam;
    }

    public void setQntRam(int qntRam) {
        this.qntRam = qntRam;
    }
}
