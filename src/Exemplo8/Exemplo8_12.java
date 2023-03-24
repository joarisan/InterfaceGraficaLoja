/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Exemplo8;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Exemplo8_12 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo8_12
     */
    public Exemplo8_12() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrbSimNao = new javax.swing.JRadioButton();
        jrbSimNaoCancelar = new javax.swing.JRadioButton();
        jrbOkCancelar = new javax.swing.JRadioButton();
        jbMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jrbSimNao.setText("Sim e Não");
        jrbSimNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSimNaoActionPerformed(evt);
            }
        });

        jrbSimNaoCancelar.setText("Sim e Não e Cancelar");

        jrbOkCancelar.setText("Ok e Cancelar");

        jbMostrar.setBackground(new java.awt.Color(102, 255, 51));
        jbMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbMostrar.setText("MOSTRAR");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbOkCancelar)
                    .addComponent(jrbSimNaoCancelar)
                    .addComponent(jrbSimNao)
                    .addComponent(jbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jrbSimNao)
                .addGap(18, 18, 18)
                .addComponent(jrbSimNaoCancelar)
                .addGap(21, 21, 21)
                .addComponent(jrbOkCancelar)
                .addGap(29, 29, 29)
                .addComponent(jbMostrar)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbSimNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSimNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSimNaoActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
   int resp = 0;
   if(jrbSimNao.isSelected()){
       resp = JOptionPane.showConfirmDialog(null,"Erro ao acessar o arquivo."+ "Tentar novamente? ","Erro de arquivo",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE );
   }else if(jrbSimNaoCancelar.isSelected()){
       resp = JOptionPane.showConfirmDialog(null,"Deseja salvar as alterações?","Salvar o Arquivo",
               JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
      }else {
       resp = JOptionPane.showConfirmDialog(null, "Deseja abrir o arquivo","Abrir Arquivo ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
   }
    }//GEN-LAST:event_jbMostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo8_12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbMostrar;
    private javax.swing.JRadioButton jrbOkCancelar;
    private javax.swing.JRadioButton jrbSimNao;
    private javax.swing.JRadioButton jrbSimNaoCancelar;
    // End of variables declaration//GEN-END:variables
}
