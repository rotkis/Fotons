/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fotons;

import view.Eletron;
import view.ParametrosCaixaParticula;
import view.PocoPotencial;

/**
 *
 * @author unifaljesus
 */
public class Fotons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParametrosCaixaParticula j = new ParametrosCaixaParticula();
        j.setVisible(true);
        
        Eletron e = new Eletron();
        e.setVisible(true);
    }
    
}
