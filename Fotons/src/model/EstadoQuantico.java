/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manga
 */
public class EstadoQuantico {
    private String largura, a, b, Ni, Nf;
    private double c, hev, hj, m, converterEvJ;

    public EstadoQuantico(String largura, String a, String b, String Ni, String Nf) {
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
    
    
    public String energiaNivelQuantico(){
        double larguraoq = Double.parseDouble(largura);
        double aoq = Double.parseDouble(a);
        double boq = Double.parseDouble(b);
        int nioq = Integer.parseInt(Ni);
        int nfoq = Integer.parseInt(Nf);        
        
        double A, kni, knf;
        
        A = Math.sqrt(2 / larguraoq);
        
        kni =  (nioq * Math.PI) / larguraoq;
        knf =  (nfoq * Math.PI) / larguraoq;
        //largura = 2 /(Ar*Ar);
        
        //n = kr * XPr * largura;
        
        c = 3 * 10E8; // c = 3*(10**8)
        hev = 4.136E-15;
        hj = 6.626E-34;
        m = 9.11E-31;
        converterEvJ = 1.602E-9;
            // self.c = 3*(10**8)
//        self.hev = 4.136e-15
//        self.hj = 6.626e-34
//        self.m = 9.11e-31
//        self.converterEvJ = 1.602e-9

//      𝐸𝑛=(ℎ2/8𝑚𝐿2)𝑛2
        double ENiEv = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * (nioq * nioq)) / converterEvJ; 
        double ENiJ = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * (nioq * nioq)); 
        double ENfEv = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * (nfoq * nfoq)) / converterEvJ;
        double ENfJ = (((hj * hj)/(8 * m * (larguraoq * larguraoq))) * (nfoq * nfoq)); 
        
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
        
        double velocidadeInicial, velocidadeFinal;
        
        velocidadeInicial = Math.sqrt(((2 * ENiJ)/m));
        velocidadeFinal = Math.sqrt(((2 * ENfJ)/m));
        
        
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
                " m ou " + cOnda*1E9 + " nm" +
                "\n\n" +
                "d) Velocidade (𝑣) da partícula no nível quântico inicial: " +
                velocidadeInicial + " m/s" +
                "\nVelocidade (𝑣) da partícula no nível quântico final: " + 
                velocidadeFinal + " m/s\n\n";
    }
    
    
    
    
    
    
    
    public String energiaFrequenciaCOnda(){
        double larguraoq = Double.parseDouble(largura);
        double aoq = Double.parseDouble(a);
        double boq = Double.parseDouble(b);
        int nioq = Integer.parseInt(Ni);
        int nfoq = Integer.parseInt(Nf);        
        
        c = 3 * Math.pow(10, 8); // c = 3*(10**8)
        hev = Math.pow(4.136, -15);
        hj = Math.pow(6.626, -34);
        m = Math.pow(9.11, -31);
            
//        self.c = 3*(10**8)
//        self.hev = 4.136e-15
//        self.hj = 6.626e-34
//        self.m = 9.11e-31
//        self.converterEvJ = 1.602e-9

        if(nfoq < nioq){
            
        }
        // Absorcao
        else if(nfoq > nioq){
        
        }

//      𝐸𝑛=(ℎ2/8𝑚𝐿2)𝑛2
        double eFoton = ((Math.pow(hev, 2))/(8 * m * Math.pow(larguraoq, 2))) * Math.pow(nioq, 2); 
        double frequencia = ((Math.pow(hj, 2))/(8 * m * Math.pow(larguraoq, 2))) * Math.pow(nioq, 2); 
        double cOnda = ((Math.pow(hev, 2))/(8 * m * Math.pow(larguraoq, 2))) * Math.pow(nfoq, 2);
        
       
        return "Energia do nível quântico inicial (Ni) em Ev: ";
    }
    
}
