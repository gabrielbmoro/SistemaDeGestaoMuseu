/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.model.Usuario;
import br.unipampa.service.RefatoraString;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author gabrielbmoro
 */
public class FrameInfoEditUsuario extends javax.swing.JFrame implements WindowListener {

    private Usuario usuario;

    /**
     * Creates new form FrameInfoEditUsuario
     */
    public FrameInfoEditUsuario(Usuario usuarioParametro) {
        initComponents();
        buttonGroupAtivo.add(jRadioButtonSimAtivo);
        buttonGroupAtivo.add(jRadioButtonNaoAtivo);
        buttonGroupAdm.add(jRadioButtonSimAdm);
        buttonGroupAdm.add(jRadioButtonNaoAdm);
        this.usuario = usuarioParametro;

        preencherCampos();

        ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 490, 378);
        addWindowListener(this);
        JRootPane rootPane = SwingUtilities.getRootPane(btnAtualizarDados); 
        rootPane.setDefaultButton(btnAtualizarDados);

    }

    private void preencherCampos() {
        String CPFadaptado = "";
        int zeros = 11 - this.usuario.getCpf().toString().length();
        while (zeros > 0) {
            CPFadaptado = CPFadaptado + "0";
            zeros--;
        }
        CPFadaptado = CPFadaptado + this.usuario.getCpf();
        this.txtCpf.setText(CPFadaptado);
        this.txtTelefone.setText(this.usuario.getTelefone());
        this.campoEndereco.setText(this.usuario.getEndereco());
        this.campoNome.setText(this.usuario.getNome());
        this.jDateChooser1.setDate(this.usuario.getDataNAsc());
        if (this.usuario.isStatus()) {
            this.jRadioButtonSimAtivo.setSelected(true);
            this.jRadioButtonNaoAtivo.setSelected(false);
        } else {
            this.jRadioButtonSimAtivo.setSelected(false);
            this.jRadioButtonNaoAtivo.setSelected(true);
        }
        if (this.usuario.isSouUsuarioAdministrador()) {
            this.jRadioButtonSimAdm.setSelected(true);
            this.jRadioButtonNaoAdm.setSelected(false);
        } else {
            this.jRadioButtonSimAdm.setSelected(false);
            this.jRadioButtonNaoAdm.setSelected(true);
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

        buttonGroupAtivo = new javax.swing.ButtonGroup();
        buttonGroupAdm = new javax.swing.ButtonGroup();
        btnAtualizarDados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonSimAtivo = new javax.swing.JRadioButton();
        jRadioButtonNaoAtivo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonSimAdm = new javax.swing.JRadioButton();
        jRadioButtonNaoAdm = new javax.swing.JRadioButton();
        txtCpf = new javax.swing.JFormattedTextField();
        campoNome = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setTitle("Edição de Cadastro de Usuário");

        btnAtualizarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/cadastrar.png"))); // NOI18N
        btnAtualizarDados.setText("Atualizar Dados");
        btnAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDadosActionPerformed(evt);
            }
        });

        jLabel1.setText("*Cpf:");

        jLabel2.setText("*Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Data de Nascimento:");

        jLabel6.setText("Ativo:");

        jRadioButtonSimAtivo.setText("Sim");

        jRadioButtonNaoAtivo.setText("Nao");
        jRadioButtonNaoAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNaoAtivoActionPerformed(evt);
            }
        });

        jLabel7.setText("Administrador:");

        jRadioButtonSimAdm.setText("Sim");

        jRadioButtonNaoAdm.setText("Nao");
        jRadioButtonNaoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNaoAdmActionPerformed(evt);
            }
        });

        txtCpf.setEditable(false);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setToolTipText("Digite o seu cpf");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizarDados)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonSimAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonNaoAtivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonSimAdm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonNaoAdm)))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(campoNome))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButtonSimAtivo)
                    .addComponent(jRadioButtonNaoAtivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButtonSimAdm)
                    .addComponent(jRadioButtonNaoAdm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnAtualizarDados)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDadosActionPerformed
        if ((this.txtCpf.getText().isEmpty()
                || this.campoNome.getText().isEmpty())) {
            GeradorDeMensagem.exibirMensagemDeInformacao("Por favor, preencha os campos marcados com '*', pois são obrigatórios. \n Também verifique a validade das datas!", "Alerta ao Usuário");
            return;
        } else {

            try {
                this.usuario.setCpf(RefatoraString.retornaCpf(this.txtCpf.getText()));
            } catch (NumberFormatException erroDeConversao) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");
                return;
            }
            this.usuario.setNome(this.campoNome.getText());
            this.usuario.setDataNAsc(this.jDateChooser1.getDate());
            this.usuario.setEndereco(this.campoEndereco.getText());
            this.usuario.setTelefone(this.txtTelefone.getText());
            boolean status = false;
            if (this.jRadioButtonSimAtivo.isSelected()) {
                status = true;
            }
            this.usuario.setStatus(status);
            boolean adm = false;
            if (this.jRadioButtonSimAdm.isSelected()) {
                adm = true;
            }
            this.usuario.setSouUsuarioAdministrador(adm);
            try {
                if (this.usuario.alterar(this.usuario)) {
                    GeradorDeMensagem.exibirMensagemDeInformacao("Os dados foram cadastrados com sucesso!", "Alerta ao Usuário");
                    dispose();
                } else {
                    GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");
                }

            } catch (Exception erro1) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");
            }

        }
    }//GEN-LAST:event_btnAtualizarDadosActionPerformed

    private void jRadioButtonNaoAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNaoAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNaoAtivoActionPerformed

    private void jRadioButtonNaoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNaoAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNaoAdmActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarDados;
    private javax.swing.ButtonGroup buttonGroupAdm;
    private javax.swing.ButtonGroup buttonGroupAtivo;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButtonNaoAdm;
    private javax.swing.JRadioButton jRadioButtonNaoAtivo;
    private javax.swing.JRadioButton jRadioButtonSimAdm;
    private javax.swing.JRadioButton jRadioButtonSimAtivo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
