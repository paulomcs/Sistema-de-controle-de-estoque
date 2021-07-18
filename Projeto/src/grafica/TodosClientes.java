package grafica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TodosClientes extends javax.swing.JFrame {

    
    public TodosClientes() {
        initComponents();
        
        negocio.TodosClientes tc = new negocio.TodosClientes();
        Object[] strings = tc.clientesTodos().toArray();
        
        ListaPessoas.setModel(new javax.swing.AbstractListModel<String>() {
            @Override
            public int getSize() { return strings.length; }
            @Override
            public String getElementAt(int i) { return (String)strings[i]; }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPessoas = new javax.swing.JList<>();
        Voltar = new javax.swing.JToggleButton();
        BotaoApagar = new javax.swing.JToggleButton();
        NumeroApagado = new javax.swing.JTextField();
        NumeroConsulta = new javax.swing.JTextField();
        BotaoCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaPessoas.setToolTipText("");
        ListaPessoas.setName(""); // NOI18N
        jScrollPane1.setViewportView(ListaPessoas);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        BotaoApagar.setText("Apagar pessoa acima");
        BotaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoApagarActionPerformed(evt);
            }
        });

        NumeroApagado.setText("Digite o numero da pessoa desejada");
        NumeroApagado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumeroApagadoMouseClicked(evt);
            }
        });
        NumeroApagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroApagadoActionPerformed(evt);
            }
        });

        NumeroConsulta.setText("Digite o numero da pessoa desejada");
        NumeroConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumeroConsultaMouseClicked(evt);
            }
        });
        NumeroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroConsultaActionPerformed(evt);
            }
        });

        BotaoCompras.setText("Consultar compras da pessoa a cima");
        BotaoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumeroConsulta)
                    .addComponent(BotaoCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumeroApagado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NumeroApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NumeroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        Inicial i = new Inicial();
        i.setVisible(true);
        
    }//GEN-LAST:event_VoltarActionPerformed

    private void NumeroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroConsultaActionPerformed
        NumeroConsulta.setText("");
    }//GEN-LAST:event_NumeroConsultaActionPerformed

    private void BotaoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoComprasActionPerformed
        // TODO add your handling code here
        dispose();
        negocio.TodosClientes tc = new negocio.TodosClientes();
        int numero = Integer.parseInt(NumeroConsulta.getText());
        HistoricoCliente hc = new HistoricoCliente(numero);
        hc.setVisible(true);
        hc.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_BotaoComprasActionPerformed

    private void NumeroConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroConsultaMouseClicked
        NumeroConsulta.setText("");
    }//GEN-LAST:event_NumeroConsultaMouseClicked

    private void NumeroApagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroApagadoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NumeroApagadoActionPerformed

    private void NumeroApagadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroApagadoMouseClicked
        // TODO add your handling code here:
        NumeroApagado.setText("");
        //Chamada da função de apagar que leva em conta o valor em "NumeroApagado"
    }//GEN-LAST:event_NumeroApagadoMouseClicked

    private void BotaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoApagarActionPerformed
        // TODO add your handling code here:
        negocio.TodosClientes tc = new negocio.TodosClientes();
        int numApagar = Integer.parseInt(NumeroApagado.getText());
        try {
            if(!tc.excluirCliente(numApagar))
            JOptionPane.showMessageDialog(this, evt, "Numero invalido", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, evt, "Digite um numero!!", JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
        Inicial in = new Inicial();
        in.setVisible(true);
        in.setLocationRelativeTo(null);

    }//GEN-LAST:event_BotaoApagarActionPerformed

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
            java.util.logging.Logger.getLogger(TodosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodosClientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotaoApagar;
    private javax.swing.JButton BotaoCompras;
    private javax.swing.JList<String> ListaPessoas;
    private javax.swing.JTextField NumeroApagado;
    private javax.swing.JTextField NumeroConsulta;
    private javax.swing.JToggleButton Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
