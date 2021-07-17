
package inter;

import java.awt.event.ActionEvent;

public class CrirConta extends javax.swing.JFrame {


    public CrirConta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroEmail = new javax.swing.JTextField();
        CadastroNome = new javax.swing.JTextField();
        CadastroNumero = new javax.swing.JTextField();
        TextoEmail = new javax.swing.JLabel();
        TextoSenha = new javax.swing.JLabel();
        TextoNome = new javax.swing.JLabel();
        TextoTelefone = new javax.swing.JLabel();
        CadastroSenha = new javax.swing.JPasswordField();
        TextoErroCadastro = new javax.swing.JLabel();
        BotaoCadastroCorrente = new javax.swing.JButton();
        BotaoCadastroPoupanca = new javax.swing.JButton();
        BotaoCadastroSalario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroNomeActionPerformed(evt);
            }
        });

        TextoEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoEmail.setText("Email:");

        TextoSenha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoSenha.setText("Senha:");

        TextoNome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoNome.setText("Nome Completo");

        TextoTelefone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoTelefone.setText("Telefone");

        TextoErroCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoErroCadastro.setForeground(new java.awt.Color(255, 102, 51));

        BotaoCadastroCorrente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoCadastroCorrente.setText("Cadastrar Conta Corrente");
        BotaoCadastroCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroCorrenteActionPerformed(evt);
            }
        });

        BotaoCadastroPoupanca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoCadastroPoupanca.setText("Cadastrar Conta Poupanca");
        BotaoCadastroPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroPoupancaActionPerformed(evt);
            }
        });

        BotaoCadastroSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoCadastroSalario.setText("Cadastrar Conta Salario");
        BotaoCadastroSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CadastroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoEmail)
                            .addComponent(TextoNome)
                            .addComponent(TextoTelefone)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CadastroEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addComponent(TextoSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CadastroSenha)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                                .addComponent(TextoErroCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotaoCadastroPoupanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotaoCadastroSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotaoCadastroCorrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoSenha)
                    .addComponent(BotaoCadastroCorrente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTelefone)
                    .addComponent(BotaoCadastroPoupanca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNome)
                    .addComponent(BotaoCadastroSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(TextoErroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroNomeActionPerformed

    private void BotaoCadastroCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroCorrenteActionPerformed
        //codigo pra criar conta corrente
        if(true){                                                    //codigo para verificar se o email ou o numero de telefone sao repetidos
            if((CadastroSenha.getText()).length() < 5){                        
                TextoErroCadastro.setText("Senha curta de mais, 5 digitos ou mais necessarios");
            }
            else{
                //codigo para registrar dados:
                
                //fim codigo para registrar dados
                dispose();
            }
        }
        else{
            
        }
    }//GEN-LAST:event_BotaoCadastroCorrenteActionPerformed

    private void BotaoCadastroPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroPoupancaActionPerformed
        //codigo pra criar conta poupanca
        if(true){                                                      //codigo para verificar se o email ou o numero de telefone sao repetidos
            if((CadastroSenha.getText()).length() < 5){                        
                TextoErroCadastro.setText("Senha curta de mais, 5 digitos ou mais necessarios");
            }
            else{
                //codigo para registrar dados:
                
                //fim codigo para registrar dados
                dispose();
            }
        }
        else{
            
        }   
    }//GEN-LAST:event_BotaoCadastroPoupancaActionPerformed

    private void BotaoCadastroSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroSalarioActionPerformed
        if(true){                                                     //codigo para verificar se o email ou o numero de telefone sao repetidos
            if((CadastroSenha.getText()).length() < 5){                        
                TextoErroCadastro.setText("Senha curta de mais, 5 digitos ou mais necessarios");
            }
            else{
                //codigo para registrar dados:
                
                //fim codigo para registrar dados
                dispose();
            }
        }
        else{
            TextoErroCadastro.setText("Dados Incorretos! Digite novamente");
        }   
    }//GEN-LAST:event_BotaoCadastroSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastroCorrente;
    private javax.swing.JButton BotaoCadastroPoupanca;
    private javax.swing.JButton BotaoCadastroSalario;
    private javax.swing.JTextField CadastroEmail;
    private javax.swing.JTextField CadastroNome;
    private javax.swing.JTextField CadastroNumero;
    private javax.swing.JPasswordField CadastroSenha;
    private javax.swing.JLabel TextoEmail;
    private javax.swing.JLabel TextoErroCadastro;
    private javax.swing.JLabel TextoNome;
    private javax.swing.JLabel TextoSenha;
    private javax.swing.JLabel TextoTelefone;
    // End of variables declaration//GEN-END:variables
}
