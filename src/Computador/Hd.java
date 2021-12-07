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
public class Hd {
    int hdGb;
    
    public Hd(){
        hdGb = 100; //padrão
    }
    
    public Hd(int hdGb){
        this.hdGb = hdGb; //definir
    }

    public int getHdGb() {
        return hdGb;
    }

    public void setHdGb(int hdGb) {
        this.hdGb = hdGb;
    }
}
