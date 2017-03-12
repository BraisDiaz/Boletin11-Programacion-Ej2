/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11.programacionej2;

import java.time.Duration;
import java.time.Instant;
import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class TiempoFrase {
    
    String parida;
    
    public void tiempoFrase (){
        
        Instant ahora = Instant.now();
        JOptionPane.showInputDialog("Escribe a frase");
        Instant antes = Instant.now();
        Duration tiempo = Duration.between(ahora, antes);
        
        System.out.println("Ha tardado en escribir la frase " + tiempo.getSeconds() + " segundos");
    }
    
    
}
