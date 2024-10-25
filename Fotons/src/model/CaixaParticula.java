/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.ControllerCaixaParticula;

/**
 *
 * @author Aline Rocha
 */
public class CaixaParticula {
    private String A, k, Xp;

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getXp() {
        return Xp;
    }

    public void setXp(String Xp) {
        this.Xp = Xp;
    }
    
    public CaixaParticula(String A, String k, String Xp) {
        this.A = A;
        this.k = k;
        this.Xp = Xp;
    }
    
    public double calcular(){
         double Ar = Double.parseDouble(A);
        double kr = Double.parseDouble(k);
        double XPr = Double.parseDouble(Xp);
        double res = Ar * Math.sin(kr*XPr);
        return res;
    }
}
