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
public class Computador {
    private Ram ram;
    private Hd hd;
    private Processador processador;
    private Placadevideo placadevideo;
    
    public void showPc(){
        System.out.println("---------------Computador---------------");
        System.out.println("Quantidade de ram: "+ram.getQntRam());
        System.out.println("Tamanho do HD: "+hd.getHdGb());
        System.out.println("Quantidade de cores do processador: "+processador.getCores());
        System.out.println("Modelo da placa de vídeo: "+placadevideo.getModelo());
    }
    
    public Computador(){
        ram = new Ram();
        hd = new Hd();
        processador = new Processador();
        placadevideo = new Placadevideo();
    }
    
    public Computador(int qntRam, int hdGb, int cores, String modelo){
        ram = new Ram(qntRam);
        hd = new Hd(hdGb);
        processador = new Processador(cores);
        placadevideo = new Placadevideo(modelo);
    }
}
