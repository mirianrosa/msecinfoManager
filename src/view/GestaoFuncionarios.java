package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Funcionario;
import model.bean.Usuario;
import model.dao.FuncionarioDAO;

/**
 *
 * @author mirian.rosa
 */
public class GestaoFuncionarios extends javax.swing.JFrame {

    public static Usuario loggedUser;
        
    public GestaoFuncionarios(Usuario user) {
        loggedUser = user;
        initComponents();
        DefaultTableModel dtmFuncionarios = (DefaultTableModel)jFuncionarios.getModel();
        jFuncionarios.setRowSorter(new TableRowSorter(dtmFuncionarios));
        readTable();
    }
    
    private void readTable(){
        
        DefaultTableModel dtmFuncionarios = (DefaultTableModel) jFuncionarios.getModel();
        dtmFuncionarios.setNumRows(0);
        FuncionarioDAO fdao = new FuncionarioDAO();
        
        for (Funcionario func: fdao.read()){
            
            dtmFuncionarios.addRow(new Object[]{  
                func.getId(),
                func.getNome(),
                func.getCpf(),
                func.getEndereco(),
                func.getSexo(),
                func.getCargo(),
                func.getSalario(),
                func.getAdmissao()
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        txtSexo = new javax.swing.JComboBox<>();
        txtCargo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        txtAdmissao = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jFuncionarios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        botaoVoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gerenciamento de funcionários");

        jLabel2.setText("Nome:");

        jLabel3.setText("C.P.F.:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Cargo:");

        jLabel7.setText("Salário:");

        jLabel8.setText("Admissão:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Masculino", "Feminino" }));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        jButton3.setText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        try {
            txtAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(botaoAtualizar)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAdmissao)
                            .addComponent(txtNome))))
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
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botaoAtualizar)
                    .addComponent(jButton3))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "C.P.F.", "Endereço", "Sexo", "Cargo", "Salário", "Admissão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFuncionariosMouseClicked(evt);
            }
        });
        jFuncionarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFuncionariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jFuncionarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
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
                        .addContainerGap(18, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        //DefaultTableModel dtmFuncionarios = (DefaultTableModel)jFuncionarios.getModel();
        
        boolean nomeRight;
        boolean cpfRight;
        boolean enderecoRight;
        boolean sexoRight;
        boolean cargoRight;
        boolean salarioRight;
        boolean admissaoRight;
        
        if (txtNome.getText().equals("")){
            nomeRight = false;
            JOptionPane.showMessageDialog(null, "Nome não foi definido!");   
    } else {
            nomeRight = true;
        }
        
        if (txtCpf.getText().equals("   .   .   -  ")){
            cpfRight = false;
            JOptionPane.showMessageDialog(null, "C.P.F. não foi definido!");   
    } else {
            cpfRight = true;
        }
        
        if (txtEndereco.getText().equals("")){
            enderecoRight = false;
            JOptionPane.showMessageDialog(null, "Endereço não foi definido!");   
    } else {
            enderecoRight = true;
        }
        
        if (txtSexo.getSelectedItem() == "Masculino" || txtSexo.getSelectedItem() == "Feminino"){
            sexoRight = true;
    } else {
            sexoRight = false;
            JOptionPane.showMessageDialog(null, "Sexo não foi selecionado!");
        }
        
        if (txtCargo.getText().equals("")){
            cargoRight = false;
            JOptionPane.showMessageDialog(null, "Cargo não foi definido!");   
    } else {
            cargoRight = true;
        }
        
        if (txtSalario.getText().equals("")){
            salarioRight = false;
            JOptionPane.showMessageDialog(null, "Salário não foi definido!");   
    } else {
            salarioRight = true;
        }
        
        if (txtAdmissao.getText().equals("  /  /    ")){
            admissaoRight = false;
            JOptionPane.showMessageDialog(null, "Data de admissão não foi definida!");   
    } else {
            admissaoRight = true;
        }
            
        if (nomeRight && cpfRight && enderecoRight && sexoRight && cargoRight && salarioRight && admissaoRight){
            
            Funcionario funcionario = new Funcionario();
            FuncionarioDAO funcionarioDao = new FuncionarioDAO();

            funcionario.setNome(txtNome.getText());
            funcionario.setCpf(txtCpf.getText());
            funcionario.setEndereco(txtEndereco.getText());
            funcionario.setSexo((String) txtSexo.getSelectedItem());
            funcionario.setCargo(txtCargo.getText());
            funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
            funcionario.setAdmissao(txtAdmissao.getText());
            funcionarioDao.create(funcionario);
            readTable();            
            
            txtNome.setText("");
            txtCpf.setText("");
            txtEndereco.setText("");
            txtSexo.setSelectedItem("Selecione...");
            txtCargo.setText("");
            txtSalario.setText("");
            txtAdmissao.setText("");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if (jFuncionarios.getSelectedRow() != -1){
            
            Funcionario funcionario = new Funcionario();
            FuncionarioDAO funcionarioDao = new FuncionarioDAO();

            funcionario.setId((int)jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(),0));
            funcionarioDao.delete(funcionario);
            readTable();            

            //JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso.");
            
            txtNome.setText("");
            txtCpf.setText("");
            txtEndereco.setText("");
            txtSexo.setSelectedItem("Selecione...");
            txtCargo.setText("");
            txtSalario.setText("");
            txtAdmissao.setText("");
                        
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário foi selecionado!");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFuncionariosMouseClicked
        // TODO add your handling code here:
        
        if (jFuncionarios.getSelectedRow() != -1){
            
            txtNome.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 1).toString());
            txtCpf.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 2).toString());
            txtEndereco.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 3).toString());
            txtSexo.setSelectedItem(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 4).toString());
            txtCargo.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 5).toString());
            txtSalario.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 6).toString());
            txtAdmissao.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 7).toString());
            
        }
        
    }//GEN-LAST:event_jFuncionariosMouseClicked

    private void jFuncionariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFuncionariosKeyReleased
        // TODO add your handling code here:
        
        if (jFuncionarios.getSelectedRow() != -1){
            
            txtNome.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 1).toString());
            txtCpf.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 2).toString());
            txtEndereco.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 3).toString());
            txtSexo.setSelectedItem(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 4).toString());
            txtCargo.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 5).toString());
            txtSalario.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 6).toString());
            txtAdmissao.setText(jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(), 7).toString());
            
        }
    }//GEN-LAST:event_jFuncionariosKeyReleased

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        // TODO add your handling code here:
        
        if (jFuncionarios.getSelectedRow() != -1){
            
            Funcionario funcionario = new Funcionario();
            FuncionarioDAO funcionarioDao = new FuncionarioDAO();

            funcionario.setNome(txtNome.getText());
            funcionario.setCpf(txtCpf.getText());
            funcionario.setEndereco(txtEndereco.getText());
            funcionario.setSexo((String) txtSexo.getSelectedItem());
            funcionario.setCargo(txtCargo.getText());
            funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
            funcionario.setAdmissao(txtAdmissao.getText());
            funcionario.setId((int)jFuncionarios.getValueAt(jFuncionarios.getSelectedRow(),0));
            funcionarioDao.update(funcionario);
            readTable();            

            //JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso.");
            
            txtNome.setText("");
            txtCpf.setText("");
            txtEndereco.setText("");
            txtSexo.setSelectedItem("Selecione...");
            txtCargo.setText("");
            txtSalario.setText("");
            txtAdmissao.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário foi selecionado!");
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void botaoVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarMenuActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial(loggedUser).setVisible(true);
            }
        });
        
        dispose();
    }//GEN-LAST:event_botaoVoltarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(GestaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GestaoFuncionarios(loggedUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoVoltarMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JTable jFuncionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtAdmissao;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JComboBox<String> txtSexo;
    // End of variables declaration//GEN-END:variables
}
