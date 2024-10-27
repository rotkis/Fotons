/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ProtonEstadoQuantico;
import view.Proton;

/**
 *
 * @author manga
 */
public class ControllerProton {
    private Proton p = null;

    public ControllerProton(Proton p) {
        this.p = p;
    }

    public String entradasTeclado(){
        String largura = p.getTxtLargurap().getText();
        String ni = p.getTxtNip().getText();
        String nf = p.getTxtNfp().getText();
        String a = p.getTxtAp().getText();
        String b = p.getTxtBp().getText();
        ProtonEstadoQuantico peq = new ProtonEstadoQuantico(largura, a, b, ni, nf);
        return peq.protonNivelQuantico();
    }
}
