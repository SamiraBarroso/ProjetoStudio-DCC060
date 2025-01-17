
package visao;

import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloDao.DaoProfessor;
import modeloBeans.BeansProfessor;
import modeloBeans.BeansUsuario;

/**
 *
 * @author Samira
 */
public class FormProfessor extends javax.swing.JFrame {

    BeansProfessor modP = new BeansProfessor();
    BeansUsuario modU = new BeansUsuario();
    DaoProfessor control = new DaoProfessor();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    
    public FormProfessor() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelFormProfessor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataContratacao = new javax.swing.JFormattedTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldIdentidade = new javax.swing.JTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldPais = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEspecialidade = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProfessor = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldTurno1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimento1 = new javax.swing.JFormattedTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelFormProfessor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelFormProfessor.setForeground(new java.awt.Color(0, 0, 51));
        jPanelFormProfessor.setPreferredSize(new java.awt.Dimension(717, 482));
        jPanelFormProfessor.setLayout(null);

        jLabel2.setText("Nome:");
        jPanelFormProfessor.add(jLabel2);
        jLabel2.setBounds(17, 57, 40, 20);

        jLabel3.setText("CPF:");
        jPanelFormProfessor.add(jLabel3);
        jLabel3.setBounds(15, 88, 40, 20);

        jLabel4.setText("Identidade:");
        jPanelFormProfessor.add(jLabel4);
        jLabel4.setBounds(363, 88, 80, 20);

        jLabel5.setText("E-mail:");
        jPanelFormProfessor.add(jLabel5);
        jLabel5.setBounds(18, 121, 40, 20);

        jLabel6.setText("Data Nascimento:");
        jPanelFormProfessor.add(jLabel6);
        jLabel6.setBounds(455, 55, 100, 20);

        jLabel7.setText("Telefone:");
        jPanelFormProfessor.add(jLabel7);
        jLabel7.setBounds(366, 121, 70, 20);

        jLabel8.setText("ID:");
        jPanelFormProfessor.add(jLabel8);
        jLabel8.setBounds(580, 245, 20, 20);

        jLabel9.setText("Rua:");
        jPanelFormProfessor.add(jLabel9);
        jLabel9.setBounds(18, 152, 40, 20);

        jLabel10.setText("Estado:");
        jPanelFormProfessor.add(jLabel10);
        jLabel10.setBounds(13, 214, 50, 20);

        jLabel11.setText("Cidade:");
        jPanelFormProfessor.add(jLabel11);
        jLabel11.setBounds(13, 183, 50, 20);

        jLabel12.setText("País:");
        jPanelFormProfessor.add(jLabel12);
        jLabel12.setBounds(380, 183, 31, 20);

        jLabel13.setText("Turno:");
        jPanelFormProfessor.add(jLabel13);
        jLabel13.setBounds(18, 245, 40, 20);

        jLabel14.setText("Especialidade:");
        jPanelFormProfessor.add(jLabel14);
        jLabel14.setBounds(280, 245, 80, 20);

        jLabel15.setText("Sexo:");
        jPanelFormProfessor.add(jLabel15);
        jLabel15.setBounds(587, 88, 40, 20);

        jFormattedTextFieldCpf.setEnabled(false);
        jFormattedTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCpfActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jFormattedTextFieldCpf);
        jFormattedTextFieldCpf.setBounds(63, 85, 280, 28);

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldNome);
        jTextFieldNome.setBounds(63, 54, 380, 28);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jComboBoxSexo.setEnabled(false);
        jPanelFormProfessor.add(jComboBoxSexo);
        jComboBoxSexo.setBounds(619, 88, 40, 20);

        jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFormattedTextFieldDataNascimento.setEnabled(false);
        jPanelFormProfessor.add(jFormattedTextFieldDataNascimento);
        jFormattedTextFieldDataNascimento.setBounds(550, 54, 106, 28);

        jFormattedTextFieldDataContratacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFormattedTextFieldDataContratacao.setEnabled(false);
        jFormattedTextFieldDataContratacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataContratacaoActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jFormattedTextFieldDataContratacao);
        jFormattedTextFieldDataContratacao.setBounds(425, 211, 114, 28);

        jTextFieldEmail.setEnabled(false);
        jPanelFormProfessor.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(63, 118, 283, 28);

        jTextFieldIdentidade.setEnabled(false);
        jTextFieldIdentidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentidadeActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldIdentidade);
        jTextFieldIdentidade.setBounds(425, 85, 150, 28);

        jTextFieldRua.setEnabled(false);
        jTextFieldRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuaActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldRua);
        jTextFieldRua.setBounds(62, 149, 380, 28);
        jTextFieldRua.getAccessibleContext().setAccessibleName("");

        jTextFieldCidade.setEnabled(false);
        jPanelFormProfessor.add(jTextFieldCidade);
        jTextFieldCidade.setBounds(63, 180, 290, 28);

        jTextFieldID.setEnabled(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldID);
        jTextFieldID.setBounds(600, 242, 46, 28);

        jTextFieldPais.setEnabled(false);
        jTextFieldPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPaisActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldPais);
        jTextFieldPais.setBounds(425, 180, 228, 28);

        jTextFieldEstado.setEnabled(false);
        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldEstado);
        jTextFieldEstado.setBounds(63, 211, 190, 28);

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(100, 300, 383, 28);

        jTextFieldTelefone.setEnabled(false);
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(425, 120, 210, 28);

        jTextFieldEspecialidade.setEnabled(false);
        jTextFieldEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEspecialidadeActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldEspecialidade);
        jTextFieldEspecialidade.setBounds(360, 242, 190, 28);

        jTableProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableProfessor);

        jPanelFormProfessor.add(jScrollPane3);
        jScrollPane3.setBounds(60, 340, 614, 94);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jButtonPesquisar);
        jButtonPesquisar.setBounds(500, 300, 137, 23);

        jTextFieldTurno1.setEnabled(false);
        jTextFieldTurno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTurno1ActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldTurno1);
        jTextFieldTurno1.setBounds(63, 242, 190, 28);

        jLabel16.setText("Data Contratação: ");
        jPanelFormProfessor.add(jLabel16);
        jLabel16.setBounds(327, 214, 110, 20);

        jTextFieldNumero1.setEnabled(false);
        jTextFieldNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero1ActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jTextFieldNumero1);
        jTextFieldNumero1.setBounds(533, 149, 46, 28);

        jLabel17.setText("Número:");
        jPanelFormProfessor.add(jLabel17);
        jLabel17.setBounds(473, 152, 50, 20);

        jFormattedTextFieldDataNascimento1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jPanelFormProfessor.add(jFormattedTextFieldDataNascimento1);
        jFormattedTextFieldDataNascimento1.setBounds(550, 54, 106, 28);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jButtonNovo);
        jButtonNovo.setBounds(60, 10, 100, 23);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jButtonSalvar);
        jButtonSalvar.setBounds(190, 10, 100, 23);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jButtonCancelar);
        jButtonCancelar.setBounds(320, 10, 100, 23);

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jButtonEditar);
        jButtonEditar.setBounds(450, 10, 100, 23);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelFormProfessor.add(jButtonExcluir);
        jButtonExcluir.setBounds(580, 10, 100, 23);

        getContentPane().add(jPanelFormProfessor);
        jPanelFormProfessor.setBounds(35, 42, 730, 470);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Professor");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 4, 230, 24);

        setSize(new java.awt.Dimension(815, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPaisActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRuaActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfActionPerformed

    private void jTextFieldEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEspecialidadeActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jFormattedTextFieldDataContratacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataContratacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataContratacaoActionPerformed

    private void jTextFieldIdentidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentidadeActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jTextFieldTurno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTurno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTurno1ActionPerformed

    private void jTextFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero1ActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
//        flag = 1;
//        jTextFieldLogin.setEnabled(true);
//        jPasswordFieldSenha.setEnabled(true);
//        jFormattedTextFieldCpf.setEnabled(true);
//        jTextFieldIdentidade.setEnabled(true);
//        jTextFieldEmail.setEnabled(true);
//        jTextFieldTelefone.setEnabled(true);
//        jTextFieldNome.setEnabled(true);
//        jTextFieldID.setEnabled(true);
//
//        jButtonSalvar.setEnabled(true);
//        jButtonCancelar.setEnabled(true);
//        jTextFieldPesquisa.setEditable(false);
//
//        jTextFieldLogin.setText("");
//        jPasswordFieldSenha.setText("");
//        jFormattedTextFieldCpf.setText("");
//        jTextFieldIdentidade.setText("");
//        jTextFieldEmail.setText("");
//        jTextFieldTelefone.setText("");
//        jTextFieldNome.setText("");
//        jTextFieldID.setText("");
//
//        //        jButtonEditar.setEnabled(false);
//        //        jButtonExcluir.setEnabled(false);
//        //        jTextFieldPesquisa.setEditable(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
//
//        if (flag == 1) {
//
//            if (jTextFieldLogin.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Preencha o Login para continuar");
//                jTextFieldNome.requestFocus();
//            } else if (jPasswordFieldSenha.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Preencha a Senha para continuar");
//                jPasswordFieldSenha.requestFocus();
//            } else if (jFormattedTextFieldCpf.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Preencha o CPF para continuar");
//                jFormattedTextFieldCpf.requestFocus();
//            } else if (jTextFieldIdentidade.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Preencha a Identidade para continuar");
//                jTextFieldIdentidade.requestFocus();
//            } else if (jTextFieldEmail.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Preencha o Email para continuar");
//                jTextFieldEmail.requestFocus();
//            } else if (jTextFieldID.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Preencha o ID para continuar");
//                jTextFieldID.requestFocus();
//            } else {
//                mod.setNome(jTextFieldNome.getText());
//                mod.setLogin(jTextFieldLogin.getText());
//                mod.setCpf(jFormattedTextFieldCpf.getText());
//                mod.setRg(jTextFieldIdentidade.getText());
//                mod.setTelefone(jTextFieldTelefone.getText());
//                mod.setIdUsuario(Integer.parseInt(jTextFieldID.getText()));
//                mod.setEmail(jTextFieldEmail.getText());
//                mod.setSenha(jPasswordFieldSenha.getText());
//
//                control.salvar(mod);
//
//                jTextFieldLogin.setText("");
//                jPasswordFieldSenha.setText("");
//                jFormattedTextFieldCpf.setText("");
//                jTextFieldIdentidade.setText("");
//                jTextFieldEmail.setText("");
//                jTextFieldTelefone.setText("");
//                jTextFieldNome.setText("");
//                jTextFieldID.setText("");
//
//                jTextFieldLogin.setEnabled(false);
//                jPasswordFieldSenha.setEnabled(false);
//                jFormattedTextFieldCpf.setEnabled(false);
//                jTextFieldIdentidade.setEnabled(false);
//                jTextFieldEmail.setEnabled(false);
//                jTextFieldTelefone.setEnabled(false);
//                jTextFieldNome.setEnabled(false);
//                jTextFieldID.setEnabled(false);
//
//                jButtonSalvar.setEnabled(false);
//                jButtonCancelar.setEnabled(false);
//
//                preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
//            }
//        } else {
//            mod.setNome(jTextFieldNome.getText());
//            mod.setLogin(jTextFieldLogin.getText());
//            mod.setCpf(jFormattedTextFieldCpf.getText());
//            mod.setRg(jTextFieldIdentidade.getText());
//            mod.setTelefone(jTextFieldTelefone.getText());
//            mod.setEmail(jTextFieldEmail.getText());
//            mod.setIdUsuario(Integer.parseInt(jTextFieldID.getText()));
//
//            control.editar(mod);
//            jTextFieldLogin.setText("");
//            jFormattedTextFieldCpf.setText("");
//            jTextFieldIdentidade.setText("");
//            jTextFieldEmail.setText("");
//            jTextFieldTelefone.setText("");
//            jTextFieldNome.setText("");
//
//            jTextFieldLogin.setEnabled(false);
//            jPasswordFieldSenha.setEnabled(false);
//            jFormattedTextFieldCpf.setEnabled(false);
//            jTextFieldIdentidade.setEnabled(false);
//            jTextFieldEmail.setEnabled(false);
//            jTextFieldTelefone.setEnabled(false);
//            jTextFieldNome.setEnabled(false);
//            jTextFieldID.setEnabled(false);
//
//            jButtonNovo.setEnabled(true);
//            jButtonSalvar.setEnabled(false);
//            jButtonCancelar.setEnabled(false);
//
//            preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
//        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
//        jTextFieldLogin.setEnabled(!true);
//        jPasswordFieldSenha.setEnabled(!true);
//        jFormattedTextFieldCpf.setEnabled(!true);
//        jTextFieldIdentidade.setEnabled(!true);
//        jTextFieldEmail.setEnabled(!true);
//        jTextFieldTelefone.setEnabled(!true);
//        jTextFieldNome.setEnabled(!true);
//        jTextFieldID.setEnabled(!true);
//
//        jButtonSalvar.setEnabled(!true);
//        jButtonCancelar.setEnabled(!true);
//        jTextFieldPesquisa.setEditable(!false);
//        jButtonPesquisar.setEnabled(!false);
//        jButtonNovo.setEnabled(true);
//        jButtonExcluir.setEnabled(false);
//        jButtonEditar.setEnabled(false);
//
//        jTextFieldLogin.setText("");
//        jFormattedTextFieldCpf.setText("");
//        jTextFieldIdentidade.setText("");
//        jTextFieldEmail.setText("");
//        jTextFieldTelefone.setText("");
//        jTextFieldNome.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
//        flag = 2;
//
//        jTextFieldLogin.setEnabled(true);
//        jFormattedTextFieldCpf.setEnabled(true);
//        jTextFieldIdentidade.setEnabled(true);
//        jTextFieldEmail.setEnabled(true);
//        jTextFieldTelefone.setEnabled(true);
//        jTextFieldNome.setEnabled(true);
//
//        jButtonSalvar.setEnabled(true);
//        jButtonCancelar.setEnabled(true);
//        jButtonEditar.setEnabled(false);
//        jButtonNovo.setEnabled(false);
//        jButtonExcluir.setEnabled(false);
//
//        preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
//        int resp = 0;
//        resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir? ");
//        if (resp == JOptionPane.YES_OPTION) {
//            mod.setIdUsuario(Integer.parseInt(jTextFieldID.getText()));
//            control.excluir(mod);
//
//            //            jTextFieldLogin.setText("");
//            //            jFormattedTextFieldCpf.setText("");
//            //            jTextFieldIdentidade.setText("");
//            //            jTextFieldEmail.setText("");
//            //            jTextFieldTelefone.setText("");
//            //            jTextFieldNome.setText("");
//            jTextFieldLogin.setEnabled(false);
//            jPasswordFieldSenha.setEnabled(false);
//            jFormattedTextFieldCpf.setEnabled(false);
//            jTextFieldIdentidade.setEnabled(false);
//            jTextFieldEmail.setEnabled(false);
//            jTextFieldTelefone.setEnabled(false);
//            jTextFieldNome.setEnabled(false);
//            jTextFieldID.setEnabled(false);
//
//            jButtonNovo.setEnabled(true);
//            jButtonSalvar.setEnabled(false);
//            jButtonCancelar.setEnabled(false);
//            jButtonEditar.setEnabled(false);
//            jButtonExcluir.setEnabled(false);
//
//            preencherTabela("SELECT * FROM usuario ORDER BY idUsuario");
//        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProfessor().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataContratacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelFormProfessor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableProfessor;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEspecialidade;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldIdentidade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTurno1;
    // End of variables declaration//GEN-END:variables

}
