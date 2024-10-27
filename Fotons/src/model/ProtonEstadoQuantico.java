/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aline Rocha
 */
public class ProtonEstadoQuantico {
    private String largura, a, b, Ni, Nf;
    private double c, hev, hj, m, converterEvJ;

    public ProtonEstadoQuantico(String largura, String a, String b, String Ni, String Nf) {
        this.largura = largura;
        this.a = a;
        this.b = b;
        this.Ni = Ni;
        this.Nf = Nf;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getNi() {
        return Ni;
    }

    public void setNi(String Ni) {
        this.Ni = Ni;
    }

    public String getNf() {
        return Nf;
    }

    public void setNf(String Nf) {
        this.Nf = Nf;
    }
    
    public String protonNivelQuantico(){
        double larguraoq = Double.parseDouble(largura);
        double aoq = Double.parseDouble(a);
        double boq = Double.parseDouble(b);
        int nioq = Integer.parseInt(Ni);
        int nfoq = Integer.parseInt(Nf); 
        
        c = 3 * 10E8; 
        hev = 4.136E-15;
        hj = 6.626E-34;
        m = 1.67E-27;
        converterEvJ = 1.602E-19;
//        self.c = 3*(10**8)
//        self.hev = 4.136e-15
//        self.hj = 6.626e-34
//        self.m = 9.11e-31
//        self.converterEvJ = 1.602e-9
        
//-------------------- FUNCAO DE ONDA QUANTICA --------------------------------------------------------------------------------------------------------------
        double A, kni, knf;
        
        A = Math.sqrt(2 / larguraoq);
        
        kni =  (nioq * Math.PI) / larguraoq;
        knf =  (nfoq * Math.PI) / larguraoq;
//----------------------------------------------------------------------------------------------------------------------------------

//------------------ ENERGIA DO NIVEL QUANTICO ----------------------------------------------------------------------------------------------------------------        


//      𝐸𝑛=(ℎ2/8𝑚𝐿2)𝑛2
        double ENiEv = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * (nioq * nioq)) / converterEvJ; 
        double ENiJ = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * (nioq * nioq)); 
        double ENfEv = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * (nfoq * nfoq)) / converterEvJ;
        double ENfJ = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * (nfoq * nfoq)); 
        //double bidimencEv = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * ((nioq * nioq) + (nfoq * nfoq))) / converterEvJ;
        //double bidimencJ = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * ((nioq * nioq) + (nfoq * nfoq)));
//----------------------------------------------------------------------------------------------------------------------------------
        
//------------------------------ EFOTON, FREQUENCIA E COMPRIMENTO DE ONDA ----------------------------------------------------------------------------------------------------
        double eFoton  = 1;
        double eFotonJ = 1;
        double frequencia;
        double cOnda;
        String tipo = "";
        
        // Emissao
        if(nfoq < nioq){
            eFoton = ENiEv - ENfEv;
            eFotonJ = ENiJ - ENfJ;
            tipo = "emitido";
        }
        // Absorcao
        else if(nfoq > nioq){
            eFoton = ENfEv - ENiEv;
            eFotonJ = ENfJ - ENiJ;
            tipo = "absorvido";
        }
        
        // Conta para garantir que o valor sera positivo
        if(eFoton < 0){
            eFoton = eFoton * (-1);
        }
        if(eFotonJ < 0){
            eFotonJ = eFotonJ * (-1);
        }
        
        cOnda = (hj * c) / eFotonJ; // m
        
        frequencia = eFotonJ / hj; // Hz
//----------------------------------------------------------------------------------------------------------------------------------
        
//--------------------------- VELOCIDADE -------------------------------------------------------------------------------------------------------
        double velocidadeInicial, velocidadeFinal;
        
        velocidadeInicial = Math.sqrt(((2 * ENiJ)/m));
        velocidadeFinal = Math.sqrt(((2 * ENfJ)/m));
//----------------------------------------------------------------------------------------------------------------------------------
        
//------------------------- COMPRIMENTO DE ONDA DE BROGLIE --------------------------------------------------------------------------
        double cOndaBNi, cOndaBNf, cOndaBidimenc;
        //self.condab = self.hj/(self.velocidade * self.m)
        cOndaBNi = hj / (velocidadeInicial * m);
        cOndaBNf = hj / (velocidadeFinal * m);
        //cOndaBidimenc = hj / Math.sqrt(2 * m * bidimencJ);
//----------------------------------------------------------------------------------------------------------------------------------

//-------------------------- PROBABILIDADE --------------------------------------------------------------------------------------------------------
        double probabilidadeNi, probabilidadeNf, x;
        //𝑃(𝑥) = |𝜓(𝑥)|^2 𝑑x  
        //probabilidade = (2/largura) * ((Math.sin(((n * Math.PI * XPr) / largura))) * (Math.sin(((n * Math.PI * XPr) / largura))));
        probabilidadeNi = (A * (1/kni) * (((kni * boq) - (Math.sin(kni * boq) * Math.cos(kni * boq))) / 2)) - (A * (1/kni) * (((kni * aoq) - (Math.sin(kni * aoq) * Math.cos(kni * aoq))) / 2));
        probabilidadeNf = (A * (1/knf) * (((knf * boq) - (Math.sin(knf * boq) * Math.cos(knf * boq))) / 2)) - (A * (1/knf) * (((knf * aoq) - (Math.sin(knf * aoq) * Math.cos(knf * aoq))) / 2));
//----------------------------------------------------------------------------------------------------------------------------------

        return "a) Função de onda quântica no SI (Ni): 𝜓" + nioq + "(𝑥) = " + 
                A + " * sin⁡(" + kni +" * 𝑥)" + 
                "\nFunção de onda quântica no SI (Nf): 𝜓" + nfoq + "(𝑥) = " + 
                A + " * sin⁡(" + knf +" * 𝑥)" + 
                "\n\n" +
                "b) Energia do nível quântico inicial (Ni): " + ENiEv + " eV ou " +
                ENiJ + " J" + 
                "\nEnergia do nível quântico final (Nf): " + ENfEv + " eV ou " + 
                + ENfJ + " J" + 
                "\n\n"+
                "c) Energia (𝐸fóton) do fóton " + tipo + ": " + eFoton + " eV ou " +
                eFotonJ + " J" +
                "\nFrequência (𝑓) do fóton " + tipo + ": " + frequencia + " Hz" +
                "\nComprimento (𝜆) de onda do fóton " + tipo + ": " + cOnda +
                " m ou " + cOnda*1E8 + " nm" +
                "\n\n" +
                "d) Velocidade (𝑣) da partícula no nível quântico inicial: " +
                velocidadeInicial + " m/s" +
                "\nVelocidade (𝑣) da partícula no nível quântico final: " + 
                velocidadeFinal + " m/s" + 
                "\n\n" +
                "e) Comprimento de onda de De Broglie (𝜆" + nioq + ") da "
                + "partícula no nível quântico inicial: " + cOndaBNi +
                " m ou " + cOndaBNi*1E9 + " nm" +
                "\nComprimento de onda de De Broglie (𝜆" + nfoq + ") da "
                + "partícula no nível quântico final: " + cOndaBNf +
                " m ou " + cOndaBNf*1E9 + " nm" + 
                "\n\n" +
                "f) Probabilidade (𝑃(𝑎≤𝑥≤𝑏)) de encontrar a partícula, em %, "
                + "entre 𝑎 e 𝑏 no nível inicial: " + probabilidadeNi +
                "\nProbabilidade (𝑃(𝑎≤𝑥≤𝑏)) de encontrar a partícula, em %, "
                + "entre 𝑎 e 𝑏 no nível final: " + probabilidadeNf;
    }
    
}
