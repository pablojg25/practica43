/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p8.pkg01;

/**
 *
 * @author Pablo Jorge Gorrín
 */
public class Hora {
    protected byte hora;
    protected byte minuto;
    
    Hora (byte hora,byte minuto) {
        this.hora=0;
        this.minuto=0;
        if(!setHora(hora)) {
            System.out.println("Hora introducida no válida.");
        } else if (!setMinutos(minuto)) {
            System.out.println("Minutos introducidos no válidos.");
        } else {
            System.out.println("Hora y minutos válidos.");
        }
    }
    
    public void inc() {
        minuto++;
        if (minuto>59) {
            minuto=0;
            hora++;
            if (hora>23) {
                hora=0;
            }
        }
    }
    
    boolean setHora(byte valor) {
        if (valor < 24 && valor >= 0) {
            this.hora=valor;
            return true;
        } else {
            return false;
        }  
    }
    
    boolean setMinutos(byte valor) {
        if (valor < 60 && valor >= 0) {
            this.minuto = valor;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return (hora + ":" + minuto);
    }
}
