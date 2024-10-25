/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CaixaParticula;
import view.ParametrosCaixaParticula;

/**
 *
 * @author Aline Rocha
 */
public class ControllerCaixaParticula {
     private ParametrosCaixaParticula parametros = null;

    public ControllerCaixaParticula(ParametrosCaixaParticula parametros) {
        this.parametros = parametros;
    }
     
     
    
    public double pegarParametros(){
        String A = parametros.getTxtA().getText();
        String k = parametros.getTxtK().getText();
        String Xp = parametros.getTxtXp().getText();
        CaixaParticula c = new CaixaParticula(A , k ,Xp);
        return c.calcular();

    }

}
