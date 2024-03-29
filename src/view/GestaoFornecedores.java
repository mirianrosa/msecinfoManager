package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Fornecedor;
import model.bean.Usuario;
import model.dao.FornecedorDAO;

/**
 *
 * @author mirian.rosa
 */
public class GestaoFornecedores extends javax.swing.JFrame {

    public static Usuario loggedUser;

    public GestaoFornecedores(Usuario user) {
        loggedUser = user;
        initComponents();
        DefaultTableModel dtmFornecedores = (DefaultTableModel)jFornecedores.getModel();
        jFornecedores.setRowSorter(new TableRowSorter(dtmFornecedores));
        readTable();
    }
    
    private void readTable(){
        
        DefaultTableModel dtmFornecedores = (DefaultTableModel) jFornecedores.getModel();
        dtmFornecedores.setNumRows(0);
        FornecedorDAO fdao = new FornecedorDAO();
        
        for (Fornecedor forne: fdao.read()){
            
            dtmFornecedores.addRow(new Object[]{  
                forne.getId(),
                forne.getEmpresa(),
                forne.getCnpj(),
                forne.getFornecimento(),
                forne.getPreco(),
                //forne.getStatuspagamento(),
                forne.getVencimento()
            });   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtFornecimento = new javax.swing.JTextField();
        txtVencimento = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jFornecedores = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        botaoVoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gerenciamento de Fornecedores");

        jLabel2.setText("Empresa:");

        jLabel3.setText("C.N.P.J:");

        jLabel4.setText("Fornecimento:");

        jLabel5.setText("Preço:");

        jLabel6.setText("Dia de vencimento:");

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtVencimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVencimentoKeyTyped(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botaoCadastrar)
                        .addGap(36, 36, 36)
                        .addComponent(botaoAtualizar)
                        .addGap(29, 29, 29)
                        .addComponent(botaoRemover))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFornecimento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVencimento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmpresa)
                            .addComponent(txtPreco))))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFornecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoAtualizar)
                    .addComponent(botaoRemover))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Empresa", "C.N.P.J.", "Fornecimento", "Preço", "Vencimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFornecedoresMouseClicked(evt);
            }
        });
        jFornecedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFornecedoresKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jFornecedores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 887, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botaoVoltarMenu.setText("Voltar ao Menu");
        botaoVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botaoVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(botaoVoltarMenu)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        // TODO add your handling code here:
        
        //DefaultTableModel dtmFornecedores = (DefaultTableModel)jFornecedores.getModel();
        
        boolean empresaRight;
        boolean cnpjRight;
        boolean fornecimentoRight;
        boolean vencimentoRight;
        boolean precoRight;
        
        if (txtEmpresa.getText().equals("")){
            empresaRight = false;
            JOptionPane.showMessageDialog(null, "Nome da empresa não foi definido!");   
    } else {
            empresaRight = true;
        }
        
        if (txtCnpj.getText().equals("  .   .   /    -  ")){
            cnpjRight = false;
            JOptionPane.showMessageDialog(null, "C.N.P.J. não foi definido!");   
    } else {
            cnpjRight = true;
        }
        
        if (txtFornecimento.getText().equals("")){
            fornecimentoRight = false;
            JOptionPane.showMessageDialog(null, "Tipo de fornecimento não foi definido!");   
    } else {
            fornecimentoRight = true;
        }

        if (txtPreco.getText().equals("")){
            precoRight = false;
            JOptionPane.showMessageDialog(null, "Preço não foi definido!");   
    } else {
            precoRight = true;
        }
        
        if (txtVencimento.getText().equals("")){
            vencimentoRight = false;
            JOptionPane.showMessageDialog(null, "Dia de vencimento não foi definido!");   
    } else {
            vencimentoRight = true;
        }
            
        if (empresaRight && cnpjRight && fornecimentoRight && precoRight && vencimentoRight){
            
            Fornecedor fornecedor = new Fornecedor();
            FornecedorDAO fornecedorDao = new FornecedorDAO();

            fornecedor.setEmpresa(txtEmpresa.getText());
            fornecedor.setCnpj(txtCnpj.getText());
            fornecedor.setFornecimento(txtFornecimento.getText());
            fornecedor.setPreco(Double.parseDouble(txtPreco.getText()));
            fornecedor.setVencimento(txtVencimento.getText());
            fornecedorDao.create(fornecedor);
            readTable();
            
            txtEmpresa.setText("");
            txtCnpj.setText("");
            txtFornecimento.setText("");
            txtPreco.setText("");
            txtVencimento.setText("");
            
        }
        
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        // TODO add your handling code here:
        
        if (jFornecedores.getSelectedRow() != -1){
                      
            Fornecedor fornecedor = new Fornecedor();
            FornecedorDAO fornecedorDao = new FornecedorDAO();

            fornecedor.setId((int)jFornecedores.getValueAt(jFornecedores.getSelectedRow(),0));
            fornecedorDao.delete(fornecedor);
            readTable();            

            //JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso.");
            
            txtEmpresa.setText("");
            txtCnpj.setText("");
            txtFornecimento.setText("");
            txtPreco.setText("");
            txtVencimento.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum fornecedor foi selecionado!");
        }
        
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void jFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFornecedoresMouseClicked
        // TODO add your handling code here:
        
        if (jFornecedores.getSelectedRow() != -1){
            
            txtEmpresa.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 1).toString());
            txtCnpj.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 2).toString());
            txtFornecimento.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 3).toString());
            txtPreco.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 4).toString());
            txtVencimento.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 5).toString());
           
        }
        
    }//GEN-LAST:event_jFornecedoresMouseClicked

    private void jFornecedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFornecedoresKeyReleased
        // TODO add your handling code here:
        
        if (jFornecedores.getSelectedRow() != -1){
            
            txtEmpresa.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 1).toString());
            txtCnpj.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 2).toString());
            txtFornecimento.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 3).toString());
            txtPreco.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 4).toString());
            txtVencimento.setText(jFornecedores.getValueAt(jFornecedores.getSelectedRow(), 5).toString());
     
        }
    }//GEN-LAST:event_jFornecedoresKeyReleased

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        // TODO add your handling code here:
        
        if (jFornecedores.getSelectedRow() != -1){
            
            Fornecedor fornecedor = new Fornecedor();
            FornecedorDAO fornecedorDao = new FornecedorDAO();

            fornecedor.setEmpresa(txtEmpresa.getText());
            fornecedor.setCnpj(txtCnpj.getText());
            fornecedor.setFornecimento(txtFornecimento.getText());
            fornecedor.setPreco(Double.parseDouble(txtPreco.getText()));
            fornecedor.setVencimento(txtVencimento.getText());
            fornecedor.setId((int)jFornecedores.getValueAt(jFornecedores.getSelectedRow(),0));
            fornecedorDao.update(fornecedor);
            readTable();
            
            //JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso.");
            
            txtEmpresa.setText("");
            txtCnpj.setText("");
            txtFornecimento.setText("");
            txtPreco.setText("");
            txtVencimento.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum fornecedor foi selecionado!");
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void botaoVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarMenuActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial(loggedUser).setVisible(true);
            }
        });
        
        dispose();
    }//GEN-LAST:event_botaoVoltarMenuActionPerformed

    private void txtPrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecoKeyTyped

    private void txtVencimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVencimentoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtVencimentoKeyTyped

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
            java.util.logging.Logger.getLogger(GestaoFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestaoFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestaoFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestaoFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoFornecedores(loggedUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoVoltarMenu;
    private javax.swing.JTable jFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtFornecimento;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtVencimento;
    // End of variables declaration//GEN-END:variables
}
