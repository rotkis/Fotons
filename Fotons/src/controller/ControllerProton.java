/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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

    public double entradasTeclado(){
        String largura = p.getTxtLargurap().getText();
        String ni = p.getTxtNip().getText();
        String nf = p.getTxtNfp().getText();
        String a = p.getTxtAp().getText();
        String b = p.getTxtBp().getText();
        //EstadoQuantico eq = new EstadoQuantico(A , k ,Xp);
        //return eq.calcular();
        return 0;
    }
}
