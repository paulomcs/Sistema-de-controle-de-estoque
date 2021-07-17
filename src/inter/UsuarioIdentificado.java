
package inter;

 class UsuarioIdentificado extends javax.swing.JFrame {


    public UsuarioIdentificado() {
        initComponents();
        TextoSaldo.setText("Saldo: " ); // esperando arquivo de lula
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoHistoricoTransferencia = new javax.swing.JButton();
        BotaoCriarPix = new javax.swing.JButton();
        TextoSaldo = new javax.swing.JLabel();
        BotaoTransferencia = new javax.swing.JButton();
        TextoTituloPIX = new javax.swing.JLabel();
        ChavePIX1 = new javax.swing.JLabel();
        ChavePIX2 = new javax.swing.JLabel();
        ChavePIX3 = new javax.swing.JLabel();
        ChavePIX4 = new javax.swing.JLabel();
        ChavePIX5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoHistoricoTransferencia.setText("Historico de Transferencias");
        BotaoHistoricoTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHistoricoTransferenciaActionPerformed(evt);
            }
        });

        BotaoCriarPix.setText("Criar Chave PIX");
        BotaoCriarPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCriarPixActionPerformed(evt);
            }
        });

        TextoSaldo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoSaldo.setText("Saldo: ");

        BotaoTransferencia.setText("Transferencia");
        BotaoTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTransferenciaActionPerformed(evt);
            }
        });

        TextoTituloPIX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoTituloPIX.setText("Chaves PIX cadastradas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextoTituloPIX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChavePIX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChavePIX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChavePIX3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChavePIX4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoHistoricoTransferencia)
                                .addGap(10, 10, 10)
                                .addComponent(BotaoCriarPix, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotaoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ChavePIX5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoTituloPIX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(BotaoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoHistoricoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCriarPix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCriarPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCriarPixActionPerformed
        dispose();
        new CriarPix().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCriarPixActionPerformed

    private void BotaoHistoricoTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHistoricoTransferenciaActionPerformed
        dispose();
        new Historico().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoHistoricoTransferenciaActionPerformed

    private void BotaoTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTransferenciaActionPerformed
        dispose();
        new Transferencia().setVisible(true);
    }//GEN-LAST:event_BotaoTransferenciaActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioIdentificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioIdentificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioIdentificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioIdentificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioIdentificado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCriarPix;
    private javax.swing.JButton BotaoHistoricoTransferencia;
    private javax.swing.JButton BotaoTransferencia;
    private javax.swing.JLabel ChavePIX1;
    private javax.swing.JLabel ChavePIX2;
    private javax.swing.JLabel ChavePIX3;
    private javax.swing.JLabel ChavePIX4;
    private javax.swing.JLabel ChavePIX5;
    private javax.swing.JLabel TextoSaldo;
    private javax.swing.JLabel TextoTituloPIX;
    // End of variables declaration//GEN-END:variables
}
