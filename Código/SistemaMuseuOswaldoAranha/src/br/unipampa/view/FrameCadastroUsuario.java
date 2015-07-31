/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.model.Usuario;
import br.unipampa.service.CriptografiaMD5;
import br.unipampa.service.RefatoraString;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Neto
 */
public class FrameCadastroUsuario extends javax.swing.JFrame implements WindowListener {

    private Usuario funcionario;

    /**
     * Creates new form FrameCadastroUsuario
     */
    public FrameCadastroUsuario() {
        initComponents();
        this.buttonGroupAdm.add(jRadioAdmSim);
        this.buttonGroupAdm.add(jRadioAdmNao);
        ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 549, 320);
        addWindowListener(this);
        JRootPane rootPane = SwingUtilities.getRootPane(botaoSalvar); 
        rootPane.setDefaultButton(botaoSalvar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAdm = new javax.swing.ButtonGroup();
        botaoSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioAdmSim = new javax.swing.JRadioButton();
        jRadioAdmNao = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtCpf = new javax.swing.JFormattedTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();

        setTitle("Cadastro de Usuário");

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/cadastrar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jLabel7.setText("Administrador:");

        jRadioAdmSim.setText("Sim");

        jRadioAdmNao.setSelected(true);
        jRadioAdmNao.setText("Nao");

        jLabel6.setText("*Senha:");

        jLabel4.setText("*CPF:");

        jLabel3.setText("Data de Nascimento:");

        jLabel2.setText("Endereço:");

        jLabel1.setText("*Nome:");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setToolTipText("Digite o seu cpf");

        txtSenha.setToolTipText("Digite sua senha");

        jLabel5.setText("Telefone:");

        txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEndereco)
                            .addComponent(campoNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioAdmSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioAdmNao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(22, 22, 22)
                                .addComponent(txtTelefone))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtCpf))))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioAdmSim)
                    .addComponent(jRadioAdmNao))
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (this.campoNome.getText().isEmpty()
                || this.txtCpf.getText().isEmpty()
                || this.txtSenha.getText().isEmpty()) {
            GeradorDeMensagem.exibirMensagemDeInformacao("Por favor, preencha os campos marcados com '*', pois são obrigatórios. \n Também verifique a validade das datas!", "Alerta ao Usuário");
            return;
        } else {
            try {
                this.funcionario = new Usuario();

          
            this.funcionario.setNome(this.campoNome.getText());
            this.funcionario.setDataNAsc(this.jDateChooser1.getDate());
            this.funcionario.setEndereco(this.campoEndereco.getText());
            this.funcionario.setCpf(RefatoraString.retornaCpf(this.txtCpf.getText()));
            this.funcionario.setNome(this.campoNome.getText());
            
            char[] array = this.txtSenha.getPassword();
            String senha = new String(array);
            this.funcionario.setSenha(CriptografiaMD5.codificar(senha));
            this.funcionario.setTelefone(this.txtTelefone.getText());
            this.funcionario.setStatus(true);
            
            if(jRadioAdmSim.isSelected()){
                this.funcionario.setSouUsuarioAdministrador(true);
            }else{
                this.funcionario.setSouUsuarioAdministrador(false);
            }
            
              } catch (NumberFormatException erro) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");
                return;
            }
            try {
                if (this.funcionario.salvar(this.funcionario)) {
                    GeradorDeMensagem.exibirMensagemDeInformacao("Os dados foram cadastrados com sucesso!", "Alerta ao Usuário");
                    this.dispose();
                    revalidate();
                    repaint();
                } else {
                    GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");

                }
            } catch (Exception erro) {

                GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");

            }
        }

    }//GEN-LAST:event_botaoSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroupAdm;
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
    private javax.swing.JRadioButton jRadioAdmNao;
    private javax.swing.JRadioButton jRadioAdmSim;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JPasswordField txtSenha;
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
