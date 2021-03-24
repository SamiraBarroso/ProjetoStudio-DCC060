
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloDao.DaoUsuario;
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;


public class FormUsuario extends javax.swing.JFrame {

    BeansUsuario mod = new BeansUsuario();
    DaoUsuario control = new DaoUsuario();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;

    public FormUsuario() {
        initComponents();
        preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelFormUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldIdentidade = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuários");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 10, 230, 24);

        jPanelFormUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelFormUsuario.setForeground(new java.awt.Color(0, 0, 51));
        jPanelFormUsuario.setPreferredSize(new java.awt.Dimension(717, 482));
        jPanelFormUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFormUsuarioMouseClicked(evt);
            }
        });
        jPanelFormUsuario.setLayout(null);

        jLabel2.setText("Login:");
        jPanelFormUsuario.add(jLabel2);
        jLabel2.setBounds(17, 57, 40, 20);

        jLabel3.setText("CPF:");
        jPanelFormUsuario.add(jLabel3);
        jLabel3.setBounds(20, 94, 30, 30);

        jLabel4.setText("Identidade:");
        jPanelFormUsuario.add(jLabel4);
        jLabel4.setBounds(360, 100, 80, 20);

        jLabel5.setText("E-mail:");
        jPanelFormUsuario.add(jLabel5);
        jLabel5.setBounds(20, 134, 40, 30);

        jLabel6.setText("Senha:");
        jPanelFormUsuario.add(jLabel6);
        jLabel6.setBounds(380, 60, 40, 14);

        jLabel7.setText("Telefone:");
        jPanelFormUsuario.add(jLabel7);
        jLabel7.setBounds(360, 135, 60, 30);

        jLabel8.setText("ID:");
        jPanelFormUsuario.add(jLabel8);
        jLabel8.setBounds(400, 180, 50, 20);

        jLabel11.setText("Nome: ");
        jPanelFormUsuario.add(jLabel11);
        jLabel11.setBounds(20, 180, 40, 20);

        jFormattedTextFieldCpf.setEnabled(false);
        jFormattedTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCpfActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jFormattedTextFieldCpf);
        jFormattedTextFieldCpf.setBounds(63, 95, 280, 28);

        jTextFieldLogin.setEnabled(false);
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jTextFieldLogin);
        jTextFieldLogin.setBounds(63, 55, 280, 28);

        jTextFieldEmail.setEnabled(false);
        jPanelFormUsuario.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(63, 135, 283, 28);

        jTextFieldIdentidade.setEnabled(false);
        jTextFieldIdentidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentidadeActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jTextFieldIdentidade);
        jTextFieldIdentidade.setBounds(425, 95, 283, 28);

        jTextFieldNome.setEnabled(false);
        jPanelFormUsuario.add(jTextFieldNome);
        jTextFieldNome.setBounds(63, 175, 283, 28);

        jTextFieldID.setEnabled(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jTextFieldID);
        jTextFieldID.setBounds(426, 175, 283, 28);

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(110, 260, 383, 28);

        jTextFieldTelefone.setEnabled(false);
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(425, 135, 283, 28);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jButtonNovo);
        jButtonNovo.setBounds(30, 10, 100, 23);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jButtonSalvar);
        jButtonSalvar.setBounds(160, 10, 100, 23);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jButtonCancelar);
        jButtonCancelar.setBounds(290, 10, 100, 23);

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jButtonEditar);
        jButtonEditar.setBounds(420, 10, 100, 23);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jButtonExcluir);
        jButtonExcluir.setBounds(550, 10, 100, 23);

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableUsuario);

        jPanelFormUsuario.add(jScrollPane3);
        jScrollPane3.setBounds(24, 304, 670, 130);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanelFormUsuario.add(jButtonPesquisar);
        jButtonPesquisar.setBounds(500, 260, 137, 23);

        jPasswordFieldSenha.setEnabled(false);
        jPanelFormUsuario.add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(426, 55, 160, 28);

        getContentPane().add(jPanelFormUsuario);
        jPanelFormUsuario.setBounds(20, 50, 720, 450);

        setSize(new java.awt.Dimension(778, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jTextFieldIdentidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentidadeActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldLogin.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);
        jTextFieldIdentidade.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldID.setEnabled(true);

        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldPesquisa.setEditable(false);

        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jFormattedTextFieldCpf.setText("");
        jTextFieldIdentidade.setText("");
        jTextFieldEmail.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldNome.setText("");
        jTextFieldID.setText("");

//        jButtonEditar.setEnabled(false);
//        jButtonExcluir.setEnabled(false);
//        jTextFieldPesquisa.setEditable(false);

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (flag == 1) {

            if (jTextFieldLogin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Login para continuar");
                jTextFieldNome.requestFocus();
            } else if (jPasswordFieldSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha a Senha para continuar");
                jPasswordFieldSenha.requestFocus();
            } else if (jFormattedTextFieldCpf.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o CPF para continuar");
                jFormattedTextFieldCpf.requestFocus();
            } else if (jTextFieldIdentidade.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha a Identidade para continuar");
                jTextFieldIdentidade.requestFocus();
            } else if (jTextFieldEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Email para continuar");
                jTextFieldEmail.requestFocus();
            } else if (jTextFieldID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o ID para continuar");
                jTextFieldID.requestFocus();
            } else {
                mod.setNome(jTextFieldNome.getText());
                mod.setLogin(jTextFieldLogin.getText());
                mod.setCpf(jFormattedTextFieldCpf.getText());
                mod.setRg(jTextFieldIdentidade.getText());
                mod.setTelefone(jTextFieldTelefone.getText());
                mod.setIdUsuario(Integer.parseInt(jTextFieldID.getText()));
                mod.setEmail(jTextFieldEmail.getText());
                mod.setSenha(jPasswordFieldSenha.getText());

                control.salvar(mod);

                jTextFieldLogin.setText("");
                jPasswordFieldSenha.setText("");
                jFormattedTextFieldCpf.setText("");
                jTextFieldIdentidade.setText("");
                jTextFieldEmail.setText("");
                jTextFieldTelefone.setText("");
                jTextFieldNome.setText("");
                jTextFieldID.setText("");

                jTextFieldLogin.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jFormattedTextFieldCpf.setEnabled(false);
                jTextFieldIdentidade.setEnabled(false);
                jTextFieldEmail.setEnabled(false);
                jTextFieldTelefone.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jTextFieldID.setEnabled(false);

                jButtonSalvar.setEnabled(false);
                jButtonCancelar.setEnabled(false);

                preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
            }
        } else {
            mod.setNome(jTextFieldNome.getText());
            mod.setLogin(jTextFieldLogin.getText());
            mod.setCpf(jFormattedTextFieldCpf.getText());
            mod.setRg(jTextFieldIdentidade.getText());
            mod.setTelefone(jTextFieldTelefone.getText());
            mod.setEmail(jTextFieldEmail.getText());
            mod.setIdUsuario(Integer.parseInt(jTextFieldID.getText()));

            control.editar(mod);
            jTextFieldLogin.setText("");
            jFormattedTextFieldCpf.setText("");
            jTextFieldIdentidade.setText("");
            jTextFieldEmail.setText("");
            jTextFieldTelefone.setText("");
            jTextFieldNome.setText("");

            jTextFieldLogin.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jFormattedTextFieldCpf.setEnabled(false);
            jTextFieldIdentidade.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jTextFieldTelefone.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldID.setEnabled(false);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);

            preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldLogin.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jFormattedTextFieldCpf.setEnabled(!true);
        jTextFieldIdentidade.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        jTextFieldTelefone.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jTextFieldID.setEnabled(!true);

        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jTextFieldPesquisa.setEditable(!false);
        jButtonPesquisar.setEnabled(!false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);

        jTextFieldLogin.setText("");
        jFormattedTextFieldCpf.setText("");
        jTextFieldIdentidade.setText("");
        jTextFieldEmail.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldNome.setText("");

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;

        jTextFieldLogin.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);
        jTextFieldIdentidade.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldNome.setEnabled(true);

        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resp = 0;
        resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir? ");
        if (resp == JOptionPane.YES_OPTION) {
            mod.setIdUsuario(Integer.parseInt(jTextFieldID.getText()));
            control.excluir(mod);

//            jTextFieldLogin.setText("");
//            jFormattedTextFieldCpf.setText("");
//            jTextFieldIdentidade.setText("");
//            jTextFieldEmail.setText("");
//            jTextFieldTelefone.setText("");
//            jTextFieldNome.setText("");
            jTextFieldLogin.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jFormattedTextFieldCpf.setEnabled(false);
            jTextFieldIdentidade.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jTextFieldTelefone.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldID.setEnabled(false);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);

            preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
        }


    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisa.getText());
        BeansUsuario model = control.buscaUsuario(mod);

        jTextFieldLogin.setText(model.getLogin());
        jFormattedTextFieldCpf.setText(model.getCpf());
        jTextFieldIdentidade.setText(model.getRg());
        jTextFieldEmail.setText(model.getEmail());
        jTextFieldTelefone.setText(model.getTelefone());
        jTextFieldNome.setText(model.getNome());
        jTextFieldID.setText(Integer.toString(model.getIdUsuario()));

        preencherTabela("SELECT *FROM usuario WHERE nome like '%" + mod.getPesquisa() + "%'");

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        String nome = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 2);
        conex.conexao();
        conex.executaSql("SELECT *FROM usuario WHERE nome='" + nome + "'");

        try {
            conex.rs.first();
            jTextFieldLogin.setText(conex.rs.getString("login"));
            jTextFieldNome.setText(conex.rs.getString("nome"));
            jFormattedTextFieldCpf.setText(conex.rs.getString("cpf"));
            jTextFieldIdentidade.setText(conex.rs.getString("rg"));
            jTextFieldEmail.setText(conex.rs.getString("email"));
            jTextFieldTelefone.setText(conex.rs.getString("telefone"));
            jTextFieldID.setText(Integer.toString(conex.rs.getInt("idUsuario")));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados " + ex);
        }
        conex.desconecta();
        jButtonNovo.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(false);

        jTextFieldLogin.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldCpf.setEnabled(false);
        jTextFieldIdentidade.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldID.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);

    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jPanelFormUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFormUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelFormUsuarioMouseClicked

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Login", "Nome", "CPF", "RG", "Email", "Telefone"};
        conex.conexao();
        conex.executaSql(sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("idUsuario"), conex.rs.getString("login"), conex.rs.getString("nome"),
                    conex.rs.getString("cpf"), conex.rs.getString("rg"), conex.rs.getString("email"), conex.rs.getString("telefone")});
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque por outro Usuario.");
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableUsuario.setModel(modelo);
        jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableUsuario.getColumnModel().getColumn(0).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableUsuario.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableUsuario.getColumnModel().getColumn(2).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableUsuario.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTableUsuario.getColumnModel().getColumn(4).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(5).setPreferredWidth(180);
        jTableUsuario.getColumnModel().getColumn(5).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTableUsuario.getColumnModel().getColumn(6).setResizable(false);
        jTableUsuario.getTableHeader().setReorderingAllowed(false);
        jTableUsuario.setAutoResizeMode(jTableUsuario.AUTO_RESIZE_OFF);
        jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conex.desconecta();
    }

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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelFormUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldIdentidade;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
