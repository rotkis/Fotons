/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerCaixaParticula;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Aline Rocha
 */
public class ParametrosCaixaParticula extends javax.swing.JFrame {

    /**
     * Creates new form ParametrosCaixaParticula
     */
    public ParametrosCaixaParticula() {
        initComponents();
        c = new ControllerCaixaParticula(this);
    }

    public JButton getBtEnviar() {
        return btEnviar;
    }

    public void setBtEnviar(JButton btEnviar) {
        this.btEnviar = btEnviar;
    }

    public JLabel getLblA() {
        return lblA;
    }

    public void setLblA(JLabel lblA) {
        this.lblA = lblA;
    }

    public JLabel getLblK() {
        return lblK;
    }

    public void setLblK(JLabel lblK) {
        this.lblK = lblK;
    }

    public JLabel getLblParametros() {
        return lblParametros;
    }

    public void setLblParametros(JLabel lblParametros) {
        this.lblParametros = lblParametros;
    }

    public JLabel getLblUnidadeA() {
        return lblUnidadeA;
    }

    public void setLblUnidadeA(JLabel lblUnidadeA) {
        this.lblUnidadeA = lblUnidadeA;
    }

    public JLabel getLblUnidadeK() {
        return lblUnidadeK;
    }

    public void setLblUnidadeK(JLabel lblUnidadeK) {
        this.lblUnidadeK = lblUnidadeK;
    }

    public JLabel getLblUnidadeXp() {
        return lblUnidadeXp;
    }

    public void setLblUnidadeXp(JLabel lblUnidadeXp) {
        this.lblUnidadeXp = lblUnidadeXp;
    }

    public JLabel getLblXp() {
        return lblXp;
    }

    public void setLblXp(JLabel lblXp) {
        this.lblXp = lblXp;
    }

    public JPanel getPanelParametros() {
        return panelParametros;
    }

    public void setPanelParametros(JPanel panelParametros) {
        this.panelParametros = panelParametros;
    }

    public JTextField getTxtA() {
        return txtA;
    }

    public void setTxtA(JTextField txtA) {
        this.txtA = txtA;
    }

    public JTextField getTxtK() {
        return txtK;
    }

    public void setTxtK(JTextField txtK) {
        this.txtK = txtK;
    }

    public JTextField getTxtXp() {
        return txtXp;
    }

    public void setTxtXp(JTextField txtXp) {
        this.txtXp = txtXp;
    }

    public ControllerCaixaParticula getC() {
        return c;
    }

    public void setC(ControllerCaixaParticula c) {
        this.c = c;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getTxtRes() {
        return txtRes;
    }

    public void setTxtRes(JTextArea txtRes) {
        this.txtRes = txtRes;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblParametros = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtK = new javax.swing.JTextField();
        txtXp = new javax.swing.JTextField();
        lblA = new javax.swing.JLabel();
        lblK = new javax.swing.JLabel();
        lblXp = new javax.swing.JLabel();
        lblUnidadeA = new javax.swing.JLabel();
        lblUnidadeK = new javax.swing.JLabel();
        lblUnidadeXp = new javax.swing.JLabel();
        panelParametros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();
        btEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblParametros.setText("𝝍 𝒏 (𝒙) ");

        txtXp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXpActionPerformed(evt);
            }
        });

        lblA.setText("A:");

        lblK.setText("k:");

        lblXp.setText("Xp:");

        lblUnidadeA.setText("un");

        lblUnidadeK.setText("un");

        lblUnidadeXp.setText("un");

        panelParametros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtRes.setColumns(20);
        txtRes.setRows(5);
        jScrollPane1.setViewportView(txtRes);

        javax.swing.GroupLayout panelParametrosLayout = new javax.swing.GroupLayout(panelParametros);
        panelParametros.setLayout(panelParametrosLayout);
        panelParametrosLayout.setHorizontalGroup(
            panelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelParametrosLayout.setVerticalGroup(
            panelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );

        btEnviar.setText("Enviar");
        btEnviar.setToolTipText("");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lblParametros, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblA)
                    .addComponent(lblK)
                    .addComponent(lblXp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtK)
                    .addComponent(txtA)
                    .addComponent(txtXp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUnidadeXp)
                    .addComponent(lblUnidadeK)
                    .addComponent(lblUnidadeA))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelParametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblParametros, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidadeA)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidadeK)
                    .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblK))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidadeXp)
                    .addComponent(txtXp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXp))
                .addGap(35, 35, 35)
                .addComponent(btEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(panelParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtXpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXpActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        
        String r = c.pegarParametros();
        txtRes.setText("RESULTADOS\n" + r);
//        txtRes.setText("RESULTADOS\na) Largura da caixa: "  + String.valueOf(r) + "\n" +
//                "b) Nível quântico da partícula: " + "\n" + 
//                "c) Probabilidade de encontrar a partícula na posição Xp: ");
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
//            java.util.logging.Logger.getLogger(ParametrosCaixaParticula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ParametrosCaixaParticula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ParametrosCaixaParticula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ParametrosCaixaParticula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ParametrosCaixaParticula().setVisible(true);
//            }
//        });
//    }
    
    public ControllerCaixaParticula c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblK;
    private javax.swing.JLabel lblParametros;
    private javax.swing.JLabel lblUnidadeA;
    private javax.swing.JLabel lblUnidadeK;
    private javax.swing.JLabel lblUnidadeXp;
    private javax.swing.JLabel lblXp;
    private javax.swing.JPanel panelParametros;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtK;
    private javax.swing.JTextArea txtRes;
    private javax.swing.JTextField txtXp;
    // End of variables declaration//GEN-END:variables
}
