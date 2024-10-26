/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.EstadoQuantico;
import view.Eletron;

/**
 *
 * @author manga
 */
public class ControllerEletron {
    private Eletron e = null;

    public ControllerEletron(Eletron e) {
        this.e = e;
    }

    public String entradasTeclado(){
        String largura = e.getTxtLargurae().getText();
        String ni = e.getTxtNie().getText();
        String nf = e.getTxtNfe().getText();
        String a = e.getTxtAe().getText();
        String b = e.getTxtBe().getText();
        EstadoQuantico eq = new EstadoQuantico(largura, a, b, ni, nf);
        return eq.energiaNivelQuantico();
    }
    
    
    
}
