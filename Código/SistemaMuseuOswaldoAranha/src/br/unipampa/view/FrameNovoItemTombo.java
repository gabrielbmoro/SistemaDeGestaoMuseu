/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.model.ItemTombo;
import br.unipampa.service.UtilitariaDeUploadDeImagem;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author AugustoCesar
 */
public class FrameNovoItemTombo extends javax.swing.JFrame {

    private ItemTombo itemTombo;
    private JFileChooser jFileChooser;

    /**
     * Creates new form FrameItemTombo
     */
    public FrameNovoItemTombo() {
        initComponents();
        ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 1100, 500);
        jPanelDadosTombo.setVisible(true);
        jPanelUploadDeImagem.setVisible(false);
        revalidate();
        repaint();
//        addWindowListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDadosTombo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoAuxiliarItemTombo = new javax.swing.JTextField();
        txtMateriaPrimaItemTombo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateDeUtilizacaoInicialItemTombo = new com.toedter.calendar.JDateChooser();
        jDateDeUtilizacaoFinalItemTombo = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtTipoDeObjetoItemTombo = new javax.swing.JTextField();
        txtFuncaoEspecificaItemTombo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCulturaItemTombo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEstiloItemTombo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGrupoLingItemTombo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTecmanufaturaItemTombo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtProcedenciaItemTombo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRegiaoItemTombo = new javax.swing.JTextField();
        txtSitioItemTombo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboPaisItemTombo = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        btnRegistrarDadosItemTombo = new javax.swing.JButton();
        btnRegistrarImagem = new javax.swing.JButton();
        txtCaminhoImagem = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtBuscarImagem = new javax.swing.JButton();
        jPanelUploadDeImagem = new javax.swing.JPanel();

        setTitle("Cadastro de Novo Item");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("*Código Auxiliar:");

        jLabel2.setText("*Matéria Prima:");

        jLabel3.setText("*Data de Utilização Inicial:");

        jLabel4.setText("*Data de Utilização Final:");

        jLabel8.setText("*Tipo de Objeto:");

        jLabel9.setText("Função Específica:");

        txtCulturaItemTombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCulturaItemTomboActionPerformed(evt);
            }
        });

        jLabel10.setText("Cultura:");

        jLabel11.setText("Estilo:");

        txtGrupoLingItemTombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoLingItemTomboActionPerformed(evt);
            }
        });

        jLabel12.setText("Grupo Linguístico:");

        jLabel13.setText("Técnica de Manufatura:");

        jLabel14.setText("Procedência:");

        jLabel16.setText("Sítio:");

        jLabel15.setText("Região:");

        jComboPaisItemTombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------------", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Anguilla", "Antigua", "Arábia Saudita", "Argentina", "Armênia", "Aruba", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Bélgica", "Benin", "Bermudas", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burkina Fasso", "Botão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Cazaquistão", "Chade", "Chile", "China", "Cidade do Vaticano", "Colômbia", "Congo", "Coréia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Dinamarca", "Djibuti", "Dominica", "EUA", "Egito", "El Salvador", "Emirados Árabe", "Equador", "Eritréia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Gibraltar", "Granada", "Grécia", "Guadalupe", "Guam", "Guatemala", "Guiana", "Guiana Francesa", "Guiné-bissau", "Haiti", "Holanda", "Honduras", "Hong Kong", "Hungria", "Iêmen", "Ilhas Cayman", "Ilhas Cook", "Ilhas Curaçao", "Ilhas Marshall", "Ilhas Turks & Caicos", "Ilhas Virgens (brit.)", "lhas Virgens(amer.)", "Ilhas Wallis e Futuna", "Índia", "Indonésia", "Inglaterra", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Latvia", "Líbano", "Liechtenstein", "Lituânia", "Luxemburgo", "Macau", "Macedônia", "Madagascar", "Malásia", "Malaui", "Mali", "Malta", "Marrocos", "Martinica", "Mauritânia", "Mauritius", "México", "Moldova", "Mônaco", "Montserrat", "Nepal", "Nicarágua", "Niger", "Nigéria", "Noruega", "Nova Caledônia", "Nova Zelândia", "Omã", "Palau", "Panamá", "Papua-nova Guiné", "Paquistão", "Peru", "Polinésia Francesa", "Polônia", "Porto Rico", "Portugal", "Qatar", "Quênia", "Rep. Dominicana", "Rep. Tcheca", "Reunion", "Romênia", "Ruanda", "Rússia", "Saipan", "Samoa Americana", "Senegal", "Serra Leone", "Seychelles", "Singapura", "Síria", "Sri Lanka", "St. Kitts & Nevis", "St. Lúcia", "St. Vincent", "Sudão", "Suécia", "Suiça", "Suriname", "Tailândia", "Taiwan", "Tanzânia", "Togo", "Trinidad & Tobago", "Tunísia", "Turquia", "Ucrânia", "Uganda", "Uruguai", "Venezuela", "Vietnã", "Zaire", "Zâmbia", "Zimbábue" }));
        jComboPaisItemTombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPaisItemTomboActionPerformed(evt);
            }
        });

        jLabel17.setText("País:");

        btnRegistrarDadosItemTombo.setText("Salvar");
        btnRegistrarDadosItemTombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDadosItemTomboActionPerformed(evt);
            }
        });

        btnRegistrarImagem.setText("Registrar Imagem");
        btnRegistrarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarImagemActionPerformed(evt);
            }
        });

        txtCaminhoImagem.setText("Caminho do Arquivo");
        txtCaminhoImagem.setEnabled(false);

        jLabel18.setText("Foto do Item:");

        txtBuscarImagem.setText("Buscar");
        txtBuscarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosTomboLayout = new javax.swing.GroupLayout(jPanelDadosTombo);
        jPanelDadosTombo.setLayout(jPanelDadosTomboLayout);
        jPanelDadosTomboLayout.setHorizontalGroup(
            jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosTomboLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoDeObjetoItemTombo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosTomboLayout.createSequentialGroup()
                        .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosTomboLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtTecmanufaturaItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txtRegiaoItemTombo)
                                .addGap(27, 27, 27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txtSitioItemTombo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosTomboLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProcedenciaItemTombo))))
                    .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFuncaoEspecificaItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCulturaItemTombo))
                    .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstiloItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrupoLingItemTombo))
                    .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                        .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(12, 12, 12)
                                .addComponent(jComboPaisItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegistrarDadosItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                                .addComponent(txtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscarImagem))
                            .addComponent(btnRegistrarImagem)
                            .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jDateDeUtilizacaoInicialItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateDeUtilizacaoFinalItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoAuxiliarItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMateriaPrimaItemTombo)))
                .addContainerGap())
        );
        jPanelDadosTomboLayout.setVerticalGroup(
            jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosTomboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAuxiliarItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMateriaPrimaItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateDeUtilizacaoInicialItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateDeUtilizacaoFinalItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoDeObjetoItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncaoEspecificaItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCulturaItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstiloItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrupoLingItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTecmanufaturaItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProcedenciaItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegiaoItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSitioItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboPaisItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosTomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarImagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarImagem)
                .addGap(10, 10, 10)
                .addComponent(btnRegistrarDadosItemTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDadosTombo);

        javax.swing.GroupLayout jPanelUploadDeImagemLayout = new javax.swing.GroupLayout(jPanelUploadDeImagem);
        jPanelUploadDeImagem.setLayout(jPanelUploadDeImagemLayout);
        jPanelUploadDeImagemLayout.setHorizontalGroup(
            jPanelUploadDeImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelUploadDeImagemLayout.setVerticalGroup(
            jPanelUploadDeImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelUploadDeImagem);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCulturaItemTomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCulturaItemTomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCulturaItemTomboActionPerformed

    private void txtGrupoLingItemTomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoLingItemTomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoLingItemTomboActionPerformed

    private void jComboPaisItemTomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPaisItemTomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPaisItemTomboActionPerformed

    private void btnRegistrarDadosItemTomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDadosItemTomboActionPerformed
        if ((this.txtCodigoAuxiliarItemTombo.getText().isEmpty()
                || this.txtMateriaPrimaItemTombo.getText().isEmpty()
                || this.jDateDeUtilizacaoFinalItemTombo.getDateFormatString().isEmpty()
                || this.txtTipoDeObjetoItemTombo.getText().isEmpty()) || (this.jDateDeUtilizacaoInicialItemTombo.getDate().after(this.jDateDeUtilizacaoFinalItemTombo.getDate()))) {
            GeradorDeMensagem.exibirMensagemDeInformacao("Por favor, preencha os campos marcados com '*', pois são obrigatórios. \n Também verifique a validade das datas!", "Alerta ao Usuário");
            return;
        } else {
            try {
                this.itemTombo = new ItemTombo();
                System.out.println("chegou");
                this.itemTombo.setOutroCodigo(Integer.parseInt(this.txtCodigoAuxiliarItemTombo.getText()));
                System.out.println("passou" + txtCodigoAuxiliarItemTombo.getText());
            } catch (NumberFormatException erroDeConversao) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");
                return;
            }

            this.itemTombo.setMateriaPrima(this.txtMateriaPrimaItemTombo.getText());
            this.itemTombo.setDataUtilizacaoInicial(this.jDateDeUtilizacaoInicialItemTombo.getDate());
            this.itemTombo.setDataUtilizacaoFinal(this.jDateDeUtilizacaoFinalItemTombo.getDate());
            this.itemTombo.setEstilo(this.txtEstiloItemTombo.getText());
            this.itemTombo.setGrupoLinguistico(this.txtGrupoLingItemTombo.getText());
            this.itemTombo.setRegiao(this.txtRegiaoItemTombo.getText());
            Object dadosPais = this.jComboPaisItemTombo.getSelectedItem();
            this.itemTombo.setPais(dadosPais.toString());
            this.itemTombo.setProcedencia(this.txtProcedenciaItemTombo.getText());
            this.itemTombo.setFuncaoEspecifica(this.txtFuncaoEspecificaItemTombo.getText());
            this.itemTombo.setCultura(this.txtCulturaItemTombo.getText());
            this.itemTombo.setSitio(this.txtSitioItemTombo.getText());
            this.itemTombo.setTecnicaManufatura(this.txtTecmanufaturaItemTombo.getText());
            this.itemTombo.setTipoObjeto(this.txtTipoDeObjetoItemTombo.getText());
            this.itemTombo.setImage(false);
            try {
                if (this.itemTombo.salvar(this.itemTombo)) {
                    GeradorDeMensagem.exibirMensagemDeInformacao("Os dados foram cadastrados com sucesso!", "Alerta ao Usuário");
                    GeradorDeMensagem.exibirMensagemDeInformacao("Envie agora uma foto do item de acervo!", "Alerta ao Usuário");
                    jPanelDadosTombo.setVisible(false);
                    jPanelUploadDeImagem.setVisible(true);
                    revalidate();
                    repaint();
                } else {
                    GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");
                }

            } catch (Exception erro1) {
                System.out.println(erro1);
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");
            }

        }
    }//GEN-LAST:event_btnRegistrarDadosItemTomboActionPerformed

    private void txtBuscarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarImagemActionPerformed
        jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        jFileChooser.setAcceptAllFileFilterUsed(false);
        jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Imagens", "jpg"));
        
        int resposta = jFileChooser.showOpenDialog(null);
        if (resposta == JFileChooser.APPROVE_OPTION) {
            File diretorioEscolhido = jFileChooser.getSelectedFile();
            GeradorDeMensagem.exibirMensagemDeInformacao("Você escolheu a imagem: " + diretorioEscolhido.getName().toString(), "Alerta ao Usuário");
            txtCaminhoImagem.setText(diretorioEscolhido.getPath().toString());
        } else {
            GeradorDeMensagem.exibirMensagemDeInformacao("Você não selecionou nenhuma imagem!", "Alerta ao Usuário");
        }
    }//GEN-LAST:event_txtBuscarImagemActionPerformed

    private void btnRegistrarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarImagemActionPerformed
        boolean verificacao = UtilitariaDeUploadDeImagem.verificarArquivo(new File(this.txtCaminhoImagem.getText()));
        if (verificacao == true) {
            if (itemTombo != null) {
                Long resultado = itemTombo.recuperarID(itemTombo);
                if (resultado != null) {
                    File fileArquivo = new File(this.txtCaminhoImagem.getText());
                    boolean resposta = UtilitariaDeUploadDeImagem.enviarArquivo(fileArquivo, resultado);
                    if (resposta) {
                        itemTombo.setImage(true);
                        itemTombo.setID(resultado);
                        itemTombo.alterar(itemTombo);
                        GeradorDeMensagem.exibirMensagemDeInformacao("Arquivo enviado com sucesso!", "Alerta ao Usuário");
                        boolean resposta2 = GeradorDeMensagem.exibirMensagemDeConfirmacao("Você deseja registrar um novo item?", "Alerta ao Usuário");
                        if (resposta2) {
                            dispose();
                            new FrameNovoItemTombo();
                        } else {
                            dispose();
                        }
                    } else {
                        GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");

                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarImagemActionPerformed

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
            java.util.logging.Logger.getLogger(FrameNovoItemTombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNovoItemTombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNovoItemTombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNovoItemTombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameNovoItemTombo().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarDadosItemTombo;
    private javax.swing.JButton btnRegistrarImagem;
    private javax.swing.JComboBox jComboPaisItemTombo;
    private com.toedter.calendar.JDateChooser jDateDeUtilizacaoFinalItemTombo;
    private com.toedter.calendar.JDateChooser jDateDeUtilizacaoInicialItemTombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelDadosTombo;
    private javax.swing.JPanel jPanelUploadDeImagem;
    private javax.swing.JButton txtBuscarImagem;
    private javax.swing.JTextField txtCaminhoImagem;
    private javax.swing.JTextField txtCodigoAuxiliarItemTombo;
    private javax.swing.JTextField txtCulturaItemTombo;
    private javax.swing.JTextField txtEstiloItemTombo;
    private javax.swing.JTextField txtFuncaoEspecificaItemTombo;
    private javax.swing.JTextField txtGrupoLingItemTombo;
    private javax.swing.JTextField txtMateriaPrimaItemTombo;
    private javax.swing.JTextField txtProcedenciaItemTombo;
    private javax.swing.JTextField txtRegiaoItemTombo;
    private javax.swing.JTextField txtSitioItemTombo;
    private javax.swing.JTextField txtTecmanufaturaItemTombo;
    private javax.swing.JTextField txtTipoDeObjetoItemTombo;
    // End of variables declaration//GEN-END:variables
}
