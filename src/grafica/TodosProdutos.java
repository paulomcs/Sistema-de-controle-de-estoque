/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

/**
 *
 * @author Paulo
 */
public class TodosProdutos extends javax.swing.JFrame {

    /**
     * Creates new form TodosProdutos
     */
    public TodosProdutos() {
        initComponents();
        
        negocio.TodosProdutos tp = new negocio.TodosProdutos();
        Object[] strings = tp.getProdutosOrganizados().toArray();
        
        Produtos.setModel(new javax.swing.AbstractListModel<String>() {
            @Override
            public int getSize() { return strings.length; }
            @Override
            public String getElementAt(int i) { return (String)strings[i]; }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Produtos = new javax.swing.JList<>();
        Voltar = new javax.swing.JToggleButton();
        NomeApagado = new javax.swing.JTextField();
        BotaoApagar = new javax.swing.JToggleButton();
        BotaoRestoque = new javax.swing.JToggleButton();
        ProdutoRestocado = new javax.swing.JTextField();
        QuantidadeRestoque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Produtos.setToolTipText("");
        Produtos.setName(""); // NOI18N
        jScrollPane1.setViewportView(Produtos);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        NomeApagado.setText("Digite o numero do produto desejado");
        NomeApagado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomeApagadoMouseClicked(evt);
            }
        });
        NomeApagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeApagadoActionPerformed(evt);
            }
        });

        BotaoApagar.setText("Apagar produto acima");
        BotaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoApagarActionPerformed(evt);
            }
        });

        BotaoRestoque.setText("Restocar produto acima");
        BotaoRestoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRestoqueActionPerformed(evt);
            }
        });

        ProdutoRestocado.setText("Digite o nome do produto desejado");
        ProdutoRestocado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdutoRestocadoMouseClicked(evt);
            }
        });

        QuantidadeRestoque.setText("Quantidade a se restocar");
        QuantidadeRestoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuantidadeRestoqueMouseClicked(evt);
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
                    .addComponent(NomeApagado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(BotaoRestoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProdutoRestocado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(QuantidadeRestoque))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NomeApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProdutoRestocado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QuantidadeRestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoRestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        Inicial i = new Inicial();
        i.setVisible(true);

    }//GEN-LAST:event_VoltarActionPerformed

    private void NomeApagadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomeApagadoMouseClicked
        // TODO add your handling code here:
        NomeApagado.setText("");
        //Chamada da função de apagar que leva em conta o valor em "NumeroApagado"
    }//GEN-LAST:event_NomeApagadoMouseClicked

    private void NomeApagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeApagadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeApagadoActionPerformed

    private void BotaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoApagarActionPerformed
        // TODO add your handling code here:
        negocio.TodosProdutos tp = new negocio.TodosProdutos();
        tp.excluirProduto(NomeApagado.getText());
        dispose();
        Inicial in = new Inicial();
        in.setVisible(true);
        in.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotaoApagarActionPerformed

    private void BotaoRestoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRestoqueActionPerformed
        // TODO add your handling code here:
        negocio.TodosProdutos tp = new negocio.TodosProdutos();
        int quantRestoque = Integer.parseInt(QuantidadeRestoque.getText());
        tp.Restoque(ProdutoRestocado.getText(), quantRestoque);
        dispose();
        Inicial i = new Inicial();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_BotaoRestoqueActionPerformed

    private void ProdutoRestocadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdutoRestocadoMouseClicked
        // TODO add your handling code here:
        ProdutoRestocado.setText("");
        //Chamada da função de apagar que leva em conta o valor em "NumeroApagado"
    }//GEN-LAST:event_ProdutoRestocadoMouseClicked

    private void QuantidadeRestoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantidadeRestoqueMouseClicked
        // TODO add your handling code here:
        QuantidadeRestoque.setText("");
    }//GEN-LAST:event_QuantidadeRestoqueMouseClicked

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
            java.util.logging.Logger.getLogger(TodosProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodosProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodosProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodosProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodosProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotaoApagar;
    private javax.swing.JToggleButton BotaoRestoque;
    private javax.swing.JTextField NomeApagado;
    private javax.swing.JTextField ProdutoRestocado;
    private javax.swing.JList<String> Produtos;
    private javax.swing.JTextField QuantidadeRestoque;
    private javax.swing.JToggleButton Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
