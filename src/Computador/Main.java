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
public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.showPc();
        
        Computador pc2 = new Computador(8, 256, 4, "NVidia GTX 2080");
        pc2.showPc();
    }
}
