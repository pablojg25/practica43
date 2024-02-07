/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p8.pkg01;

/**
 *
 * @author Pablo Jorge Gorrín
 */
public class HoraPrecisa extends HoraExacta {
    protected int milisegundo;
    public HoraPrecisa(byte hora, byte minuto, byte segundo, int milisegundo) {
        super(hora,minuto,segundo);
        this.milisegundo=0;
        if (!setMilisegundo(milisegundo)) {
            System.out.println("Milisegundos introducidos no válidos.");
        }
    }
    public boolean setMilisegundo(int valor) {
        if (valor < 1000 && valor >= 0) {
            this.milisegundo = valor;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void inc() {
        milisegundo++;
        if (segundo == 1000) {
            segundo = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return (super.toString() + ":" + milisegundo);
    }
}
