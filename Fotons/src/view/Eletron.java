/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerEletron;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author unifaljesus
 */
public class Eletron extends javax.swing.JFrame {

    /**
     * Creates new form Eletron
     */
    public Eletron() {
        initComponents();
        ce = new ControllerEletron(this);
    }

    public JButton getBtEnviar() {
        return btEnviar;
    }

    public void setBtEnviar(JButton btEnviar) {
        this.btEnviar = btEnviar;
    }

    public JButton getBtVoltar() {
        return btVoltar;
    }

    public void setBtVoltar(JButton btVoltar) {
        this.btVoltar = btVoltar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getLblA() {
        return lblA;
    }

    public void setLblA(JLabel lblA) {
        this.lblA = lblA;
    }

    public JLabel getLblB() {
        return lblB;
    }

    public void setLblB(JLabel lblB) {
        this.lblB = lblB;
    }

    public JLabel getLblDados() {
        return lblDados;
    }

    public void setLblDados(JLabel lblDados) {
        this.lblDados = lblDados;
    }

    public JLabel getLblLargura() {
        return lblLargura;
    }

    public void setLblLargura(JLabel lblLargura) {
        this.lblLargura = lblLargura;
    }

    public JLabel getLblNf() {
        return lblNf;
    }

    public void setLblNf(JLabel lblNf) {
        this.lblNf = lblNf;
    }

    public JLabel getLblNi() {
        return lblNi;
    }

    public void setLblNi(JLabel lblNi) {
        this.lblNi = lblNi;
    }

    public JLabel getLblUnidade() {
        return lblUnidade;
    }

    public void setLblUnidade(JLabel lblUnidade) {
        this.lblUnidade = lblUnidade;
    }

    public JLabel getLblUnidade1() {
        return lblUnidade1;
    }

    public void setLblUnidade1(JLabel lblUnidade1) {
        this.lblUnidade1 = lblUnidade1;
    }

    public JLabel getLblUnidade2() {
        return lblUnidade2;
    }

    public void setLblUnidade2(JLabel lblUnidade2) {
        this.lblUnidade2 = lblUnidade2;
    }

    public JTextField getTxtAe() {
        return txtAe;
    }

    public void setTxtAe(JTextField txtAe) {
        this.txtAe = txtAe;
    }

    public JTextField getTxtBe() {
        return txtBe;
    }

    public void setTxtBe(JTextField txtBe) {
        this.txtBe = txtBe;
    }

    public JTextField getTxtLargurae() {
        return txtLargurae;
    }

    public void setTxtLargurae(JTextField txtLargurae) {
        this.txtLargurae = txtLargurae;
    }

    public JTextField getTxtNfe() {
        return txtNfe;
    }

    public void setTxtNfe(JTextField txtNfe) {
        this.txtNfe = txtNfe;
    }

    public JTextField getTxtNie() {
        return txtNie;
    }

    public void setTxtNie(JTextField txtNie) {
        this.txtNie = txtNie;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPanel getPanelEletron() {
        return panelEletron;
    }

    public void setPanelEletron(JPanel panelEletron) {
        this.panelEletron = panelEletron;
    }

    public JTextArea getTxtEletron() {
        return txtEletron;
    }

    public void setTxtEletron(JTextArea txtEletron) {
        this.txtEletron = txtEletron;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEletron = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEletron = new javax.swing.JTextArea();
        btEnviar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        txtLargurae = new javax.swing.JTextField();
        txtNie = new javax.swing.JTextField();
        txtNfe = new javax.swing.JTextField();
        lblDados = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblNf = new javax.swing.JLabel();
        lblLargura = new javax.swing.JLabel();
        lblUnidade2 = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblNi = new javax.swing.JLabel();
        txtAe = new javax.swing.JTextField();
        lblUnidade1 = new javax.swing.JLabel();
        txtBe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblUnidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAIXA 1D");
        setSize(new java.awt.Dimension(903, 626));

        panelEletron.setBackground(new java.awt.Color(153, 204, 255));
        panelEletron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEletron.setPreferredSize(new java.awt.Dimension(903, 626));

        txtEletron.setColumns(20);
        txtEletron.setRows(5);
        jScrollPane1.setViewportView(txtEletron);

        btEnviar.setBackground(new java.awt.Color(153, 204, 255));
        btEnviar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btEnviar.setText("Enviar");
        btEnviar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(153, 204, 255));
        btVoltar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        lblDados.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblDados.setText("Dados para a probabilidade:");

        lblA.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblA.setText("a:");

        lblNf.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblNf.setText("N final da partícula (Nf):");

        lblLargura.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblLargura.setText("Largura da caixa (L):");

        lblUnidade2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblUnidade2.setText("m");

        lblB.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblB.setText("b:");

        lblNi.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblNi.setText("N inicial da partícula (Ni):");

        lblUnidade1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblUnidade1.setText("m");

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Elétron");

        lblUnidade.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblUnidade.setText("m");

        javax.swing.GroupLayout panelEletronLayout = new javax.swing.GroupLayout(panelEletron);
        panelEletron.setLayout(panelEletronLayout);
        panelEletronLayout.setHorizontalGroup(
            panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEletronLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEletronLayout.createSequentialGroup()
                        .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEletronLayout.createSequentialGroup()
                                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLargura)
                                    .addComponent(lblNi)
                                    .addComponent(lblNf))
                                .addGap(33, 33, 33)
                                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNfe)
                                        .addComponent(txtNie, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEletronLayout.createSequentialGroup()
                                        .addComponent(txtLargurae, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUnidade))
                                    .addComponent(lblUnidade2)
                                    .addGroup(panelEletronLayout.createSequentialGroup()
                                        .addComponent(lblUnidade1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblDados))
                        .addGap(118, 118, 118))
                    .addGroup(panelEletronLayout.createSequentialGroup()
                        .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblA)
                            .addComponent(lblB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAe, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtBe))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelEletronLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(panelEletronLayout.createSequentialGroup()
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelEletronLayout.setVerticalGroup(
            panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEletronLayout.createSequentialGroup()
                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLargura)
                    .addComponent(txtLargurae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidade))
                .addGap(18, 18, 18)
                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNi)
                    .addComponent(txtNie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNf)
                    .addComponent(txtNfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(lblDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA)
                    .addComponent(lblUnidade1)
                    .addComponent(txtAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEletronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblB)
                    .addComponent(lblUnidade2)
                    .addComponent(txtBe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEletron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEletron, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        PocoPotencial pp = new PocoPotencial();
        pp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        String resultados = ce.entradasTeclado();
        txtEletron.setText("\t\t\tRESULTADOS\n\n"
                            + resultados);
    }//GEN-LAST:event_btEnviarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Eletron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Eletron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Eletron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Eletron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Eletron().setVisible(true);
//            }
//        });
//    }

    private ControllerEletron ce;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblLargura;
    private javax.swing.JLabel lblNf;
    private javax.swing.JLabel lblNi;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JLabel lblUnidade1;
    private javax.swing.JLabel lblUnidade2;
    private javax.swing.JPanel panelEletron;
    private javax.swing.JTextField txtAe;
    private javax.swing.JTextField txtBe;
    private javax.swing.JTextArea txtEletron;
    private javax.swing.JTextField txtLargurae;
    private javax.swing.JTextField txtNfe;
    private javax.swing.JTextField txtNie;
    // End of variables declaration//GEN-END:variables
}
