/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Exemplo8;

import javax.swing.JOptionPane;

/**
 *
 * @author Geral
 */
public class Exemplo8_4 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo8_4
     */
    public Exemplo8_4() {
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

        jCIngles = new javax.swing.JCheckBox();
        jcInformatica = new javax.swing.JCheckBox();
        jbVerificar = new javax.swing.JButton();
        jbMarcar = new javax.swing.JButton();
        jbDesmarcar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("exemplo8_4");

        jCIngles.setMnemonic('i');
        jCIngles.setText("Java SE");
        jCIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCInglesActionPerformed(evt);
            }
        });

        jcInformatica.setMnemonic('i');
        jcInformatica.setText("banco de dados");
        jcInformatica.setToolTipText("informatica");

        jbVerificar.setMnemonic('v');
        jbVerificar.setText("Verificar");
        jbVerificar.setToolTipText("Verificar Formulario");
        jbVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarActionPerformed(evt);
            }
        });

        jbMarcar.setMnemonic('m');
        jbMarcar.setText("Marcar");
        jbMarcar.setToolTipText("Marcar Formulario");
        jbMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMarcarActionPerformed(evt);
            }
        });

        jbDesmarcar.setMnemonic('d');
        jbDesmarcar.setText("Desmarcar");
        jbDesmarcar.setToolTipText("Desmarcar Formulario");
        jbDesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesmarcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbDesmarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcInformatica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCIngles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jCIngles)
                .addGap(18, 18, 18)
                .addComponent(jcInformatica)
                .addGap(29, 29, 29)
                .addComponent(jbVerificar)
                .addGap(26, 26, 26)
                .addComponent(jbMarcar)
                .addGap(26, 26, 26)
                .addComponent(jbDesmarcar)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbDesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesmarcarActionPerformed
jcInformatica.setSelected(false);
jCIngles.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jbDesmarcarActionPerformed

    private void jbMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMarcarActionPerformed
jcInformatica.setSelected(true); 
jCIngles.setSelected(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jbMarcarActionPerformed

    private void jbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarActionPerformed
String selecao = "Selecionados: ";
if(jCIngles.isSelected()){
    selecao += "\n"+jCIngles.getText();
}   
if(jcInformatica.isSelected()){
    selecao += "\n"+jcInformatica.getText();
}
if(jCIngles.isSelected() && jcInformatica.isSelected()){
    JOptionPane.showMessageDialog(null, selecao);
    
   }else if(!jCIngles.isSelected() &&  !jcInformatica.isSelected()){
       JOptionPane.showMessageDialog(null, "Nenhum Curso Selecionado");
   }else{
       JOptionPane.showMessageDialog(null, selecao);
   }
    }//GEN-LAST:event_jbVerificarActionPerformed

    private void jCInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCInglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCInglesActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo8_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo8_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCIngles;
    private javax.swing.JButton jbDesmarcar;
    private javax.swing.JButton jbMarcar;
    private javax.swing.JButton jbVerificar;
    private javax.swing.JCheckBox jcInformatica;
    // End of variables declaration//GEN-END:variables
}
