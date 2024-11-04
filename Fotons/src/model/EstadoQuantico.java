/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mindfusion.charting.Axis;
import com.mindfusion.charting.GridType;
import com.mindfusion.charting.LineType;
import com.mindfusion.charting.PointSeries;
import com.mindfusion.charting.Theme;
import com.mindfusion.charting.swing.LineChart;
import com.mindfusion.drawing.Align;
import java.awt.Color;
import java.awt.Font;
import java.awt.geom.Point2D;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import view.Eletron;
import view.Simulacao;

/**
 *
 * @author manga
 */
public class EstadoQuantico {
    private Eletron view;
    private String largura, a, b, Ni, Nf;
    private double c, hev, hj, m, converterEvJ;

    public EstadoQuantico(String largura, String a, String b, String Ni, String Nf) {
        this.largura = largura;
        this.a = a;
        this.b = b;
        this.Ni = Ni;
        this.Nf = Nf;
    }

    public EstadoQuantico() {
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
        DecimalFormat formatoCientifico = new DecimalFormat("0.###E0");
        DecimalFormat formatoDecimal = new DecimalFormat("0.#");
        
        c = 3 * 10E8; 
        hev = 4.136E-15;
        hj = 6.626E-34;
        m = 9.11E-31;
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
        
        cOnda = ((hj * c) / eFotonJ)/10; // m
        
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
        double probabilidadeNi = 0, probabilidadeNf = 0; 
        String probabFormatNi = "", probabFormatNf = "";
        int numSubintervalos = 1000; // Número de subintervalos para aproximação
        
        if(aoq > boq || aoq < 0 || boq > larguraoq){
            JOptionPane.showMessageDialog(view, "Digite valores válidos para a probabilidade!"
                    + "\nA probabilidade e os gráficos só aparecerão quando:\n 0 < a ≤ x ≤ b < largura",
                    "Erro",JOptionPane.ERROR_MESSAGE);        
        }
        else{
            //𝑃(𝑥) = |𝜓(𝑥)|^2 𝑑x  
            //probabilidade = (2/largura) * ((Math.sin(((n * Math.PI * XPr) / largura))) * (Math.sin(((n * Math.PI * XPr) / largura))));
            //probabilidadeNi = (A * (1/kni) * (((kni * boq) - (Math.sin(kni * boq) * Math.cos(kni * boq))) / 2)) - (A * (1/kni) * (((kni * aoq) - (Math.sin(kni * aoq) * Math.cos(kni * aoq))) / 2));
            //probabilidadeNf = (A * (1/knf) * (((knf * boq) - (Math.sin(knf * boq) * Math.cos(knf * boq))) / 2)) - (A * (1/knf) * (((knf * aoq) - (Math.sin(knf * aoq) * Math.cos(knf * aoq))) / 2));
            
        //double L = 2E-9;   // Largura do poço (exemplo)
        //int n = 3;        // Número quântico (exemplo)
        //double a = L / 3;     // Limite inferior de integração
        //double b = (2*L) / 3;     // Limite superior de integração

        // Calcula a integral da densidade de probabilidade
        probabilidadeNi = calcularIntegral(aoq, boq, numSubintervalos, larguraoq, nioq);
        probabilidadeNf = calcularIntegral(aoq, boq, numSubintervalos, larguraoq, nfoq);
        
        // Converte o resultado para porcentagem
        double porcentagemNi = probabilidadeNi * 100;
        double porcentagemNf = probabilidadeNf * 100;

        // Formata o resultado em notação com um dígito após a vírgula
        probabFormatNi = formatoDecimal.format(porcentagemNi);
        probabFormatNf = formatoDecimal.format(porcentagemNf);
        
//-------------------------------------------------------------------------------------------------------------------------------------------
        
//----------------------------- GRAFICO FUNCAO DE ONDA ----------------------------------------------------------------------------------------------------------------------        
        // Cálculo da função de onda e exibição do gráfico do Ni
        OndaQuantica ondaQuanticaNi = new OndaQuantica(nioq, larguraoq);
        ondaQuanticaNi.exibirGrafico();
        
        // Cálculo da função de onda e exibição do gráfico do Nf
        OndaQuantica ondaQuanticaNf = new OndaQuantica(nfoq, larguraoq);
        ondaQuanticaNf.exibirGrafico();
//---------------------------------------------------------------------------------------------------------------------------------------------        

//----------------------------- GRAFICO FUNCAO DE DISTRIBUICAO DE PROBABILIDADE ----------------------------------------------------------------------------------------------------------
        // Cálculo da funcao da distribuicao de probabilidade e exibição do gráfico do Ni
        DistribuicaoProbabilidade distProbabNi = new DistribuicaoProbabilidade(aoq, boq, numSubintervalos, larguraoq, nioq);
        distProbabNi.exibirGrafico();
        
        // Cálculo da funcao da distribuicao de probabilidade e exibição do gráfico do Nf
        DistribuicaoProbabilidade distProbabNf = new DistribuicaoProbabilidade(aoq, boq, numSubintervalos, larguraoq, nfoq);
        distProbabNf.exibirGrafico();        
//---------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------- SIMULACAO ----------------------------------------------------------------------------------------------------------
        Simulacao simu = new Simulacao();
        simu.setVisible(true);
//---------------------------------------------------------------------------------------------------------------------------------------------
        }

        return "\ta) Função de onda quântica no SI:"
                + "\n\tInicial: ψ" + nioq + "(x) = " + 
                formatoCientifico.format(A) + " * sen(" + formatoCientifico.format(kni) +" * x)" + 
                "\n\tFinal: ψ" + nfoq + "(x) = " + 
                formatoCientifico.format(A) + " * sen(" + formatoCientifico.format(knf) +" * x)" + 
                "\n\n" +
                "\tb) Energia do nível quântico:"
                + "\n\tInicial (E" + nioq + "): " + formatoCientifico.format(ENiEv) + " eV ou " +
                formatoCientifico.format(ENiJ) + " J" + 
                "\n\tFinal (E" + nfoq + "): " + formatoCientifico.format(ENfEv) + " eV ou " + 
                formatoCientifico.format(ENfJ) + " J" +
                "\n\n"+
                "\tc) Energia (Efóton) do fóton " + tipo + ": " + formatoCientifico.format(eFoton) + " eV ou " +
                formatoCientifico.format(eFotonJ) + " J" +
                "\n\tFrequência (f) do fóton " + tipo + ": " + formatoCientifico.format(frequencia) + " Hz" +
                "\n\tComprimento (λ) de onda do fóton " + tipo + ": " + formatoCientifico.format(cOnda) +
                " m ou " + formatoCientifico.format(cOnda*1E9) + " nm" +
                "\n\n" +
                "\td) Velocidade (v) da partícula no nível quântico:"
                + "\n\tInicial (Ni = " + nioq + "): " + formatoCientifico.format(velocidadeInicial) + " m/s" +
                "\n\tFinal (Nf = " + nfoq + "): " + formatoCientifico.format(velocidadeFinal) + " m/s" + 
                "\n\n" +
                "\te) Comprimento de onda de De Broglie (λ) da partícula no nível quântico:"
                + "\n\tInicial (λ " + nioq + "): " + formatoCientifico.format(cOndaBNi) +
                " m ou " + formatoCientifico.format(cOndaBNi*1E9) + " nm" +
                "\n\tFinal (λ " + nfoq + "): " + formatoCientifico.format(cOndaBNf) +
                " m ou " + formatoCientifico.format(cOndaBNf*1E9) + " nm" + 
                "\n\n" +
                "\tf) Probabilidade (P(a≤x≤b)) de encontrar a partícula entre a e b no nível:"
                + "\n\tInicial (Ni = " + nioq + "): " + probabFormatNi + " %" +
                "\n\tFinal (Nf = " + nfoq + "): " + probabFormatNf + " %";
    }
    
    // Função de densidade de probabilidade que queremos integrar
    public double funcaoDensidadeProbabilidade(double x, double L, int n) {
        double coeficiente = 2 / L;
        double argumento = (n * Math.PI * x) / L;
        return coeficiente * Math.pow(Math.sin(argumento), 2);
    }

    // Método para calcular a integral usando a regra do trapézio
    public double calcularIntegral(double a, double b, int numSubintervalos, double L, int n) {
        double h = (b - a) / numSubintervalos; // Largura dos subintervalos
        double soma = (funcaoDensidadeProbabilidade(a, L, n) + funcaoDensidadeProbabilidade(b, L, n)) / 2.0;

        for (int i = 1; i < numSubintervalos; i++) {
            soma += funcaoDensidadeProbabilidade(a + i * h, L, n);
        }

        return soma * h;
    }
    
    
// Classe OndaQuantica
    class OndaQuantica {
        private double larguraoq;
        private int n;

        public OndaQuantica(int n, double larguraoq) {
            this.n = n;
            this.larguraoq = larguraoq;
        }

        public void exibirGrafico() {
            // Cria o gráfico de linha
            LineChart lineChart = new LineChart();
            List<Point2D> dataPoints = new ArrayList<>();
            List<String> labels = new ArrayList<>();

            // Gera dados da função de onda para um intervalo de x
            for (double x = 0; x <= larguraoq; x += 0.00000000001) {
                double y = (2/larguraoq) * (Math.sin(((n * Math.PI * x) / larguraoq)) / larguraoq);
                //double y = A * Math.sin(kni * x);
                dataPoints.add(new Point2D.Double(x, y));
                labels.add(" ");
                //labels.add("x: " + x); // Adiciona rótulos para cada ponto
            }

            // Cria a série de dados e adiciona ao gráfico
            PointSeries series = new PointSeries(dataPoints, labels);
            series.setTitle("Função de Onda com N = " + n);
            
            lineChart.getSeries().add(series);
            lineChart.setLegendTitle("Legenda");
            lineChart.setBackground(new java.awt.Color(153, 204, 255));
            lineChart.setGridType(GridType.Crossed);
            
            
            // Configura e exibe o gráfico
            Axis xAxis = lineChart.getXAxis();
            xAxis.setTitle("x (A)");
            xAxis.setOrigin(0.0);
            xAxis.setMinValue(-0.0000000001);
            xAxis.setNumberFormat("0.###E0");
            Axis yAxis = lineChart.getYAxis();
            yAxis.setTitle("ψ" + n);
            yAxis.setOrigin(0.0);
            yAxis.setNumberFormat("0.###E0");

            lineChart.setPreferredSize(new java.awt.Dimension(1000, 750));
            javax.swing.SwingUtilities.invokeLater(() -> {
                javax.swing.JFrame frame = new javax.swing.JFrame("Gráfico da Função de Onda com N = " + n);
                frame.setContentPane(lineChart);
                frame.pack();
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
        }
    }
    
    // Classe DistribuicaoProbabilidade
    class DistribuicaoProbabilidade {
        private double a, b, larguraoq;
        private int numSubintervalos, n;

        public DistribuicaoProbabilidade(double a, double b, int numSubintervalos, double larguraoq, int n) {
            this.a = a;
            this.b = b;
            this.numSubintervalos = numSubintervalos;
            this.larguraoq = larguraoq;
            this.n = n;
        }

        public void exibirGrafico() {
            // Cria o gráfico de linha
            LineChart lineChart = new LineChart();
            List<Point2D> dataPoints = new ArrayList<>();
            List<String> labels = new ArrayList<>();

            // Gera dados da função de onda para um intervalo de x
            for (double x = 0; x <= larguraoq; x += 0.00000000001) {
                double y = (2/larguraoq) * ((Math.sin(((n * Math.PI * x) / larguraoq))) * (Math.sin(((n * Math.PI * x) / larguraoq))));
                //double y = A * Math.sin(kni * x);
                dataPoints.add(new Point2D.Double(x, y));
                labels.add(" ");
                //labels.add("x: " + x); // Adiciona rótulos para cada ponto
            }

            // Cria a série de dados e adiciona ao gráfico
            PointSeries series = new PointSeries(dataPoints, labels);
            series.setTitle("Função de Distribuicao da Probabilidade com N = " + n);
            lineChart.getSeries().add(series);
            lineChart.setLegendTitle("Legenda");
            lineChart.setShowHighlight(false);
            lineChart.setBackground(new java.awt.Color(153, 204, 255));
            lineChart.setGridType(GridType.Crossed);
            
            // Configura e exibe o gráfico
            Axis xAxis = lineChart.getXAxis();
            xAxis.setTitle("x (A)");
            xAxis.setOrigin(0.0);
            xAxis.setMinValue(-0.0000000001);
            xAxis.setNumberFormat("0.###E0");
            Axis yAxis = lineChart.getYAxis();
            yAxis.setTitle("|ψ" + n + "|²");
            yAxis.setOrigin(0.0);
            yAxis.setNumberFormat("0.###E0");
            yAxis.setMinValue(-100000000.0);

            lineChart.setPreferredSize(new java.awt.Dimension(1000, 750));
            javax.swing.SwingUtilities.invokeLater(() -> {
                javax.swing.JFrame frame = new javax.swing.JFrame("Gráfico da Função de Distribuicao de Probabilidade com N = " + n);
                frame.setContentPane(lineChart);
                frame.pack();
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
        }
    }
    
}
