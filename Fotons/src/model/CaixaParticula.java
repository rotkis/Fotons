/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
    
    public String calcular(){
        double Ar = Double.parseDouble(A);
        double kr = Double.parseDouble(k);
        double XPr = Double.parseDouble(Xp);
        double largura, n, probabilidade;
        
        largura = 2 /(Ar*Ar);
       
        n = (kr * largura)/(Math.PI);
        
        //𝑃(𝑥) = |𝜓(𝑥)|^2 𝑑x  
        probabilidade = (2/largura) * ((Math.sin(((n * Math.PI * XPr) / largura))) * (Math.sin(((n * Math.PI * XPr) / largura))));
        
        //double res = Ar * (Math.sin(Math.toRadians((kr*XPr))));
        
        return  "\na) Largura da caixa: " + largura + " m" +
                "\nb) Nível quântico da partícula: " + n +
                "\nc) Probabilidade de encontrar a partícula na posição Xp: " + probabilidade + " dx";
    }
}
