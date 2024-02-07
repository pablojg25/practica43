/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p8.pkg01;

/**
 *
 * @author Pablo Jorge Gorrín
 */
public class HoraExacta extends Hora {
    protected byte segundo;
    public HoraExacta(byte hora, byte minuto, byte segundo) {
        super(hora,minuto);
        this.segundo=0;
        if (!setSegundo(segundo)) {
            System.out.println("Segundos introducidos no válidos.");
        }
    }
    public boolean setSegundo(byte valor) {
        if (valor < 60 && valor >= 0) {
            this.minuto = valor;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void inc() {
        segundo++;
        if (segundo==60) {
            segundo=0;
            super.inc();
        }
    }
    
    @Override
    public String toString() {
        return (super.toString() + ":" + segundo);
    }
}
