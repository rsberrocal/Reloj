/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author Richard
 */
public class Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int horas = 0, minutos = 0, segundos = 0;
        int inf = 2;
        while (inf == 2) {
            segundos++;
            if (segundos >= 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos >= 60) {
                horas++;
                minutos = 0;
            }
            if (horas >= 24) {
                horas = 0;
            }
            System.out.println("Horas:" + horas);
            System.out.println("Minutos:" + minutos);
            System.out.println("Segundos" + segundos);
            
        }
    }

}
