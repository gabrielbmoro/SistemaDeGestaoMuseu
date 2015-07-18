/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.model.ItemTombo;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author gabrielbmoro
 */
public class FrameInfoEditLivroCombo extends javax.swing.JFrame implements WindowListener {
    
    private ItemTombo itemTombo;

    /**
     * Creates new form FrameInformacoesEditarLivroConsignado
     */
    public FrameInfoEditLivroCombo(ItemTombo itemTombo, boolean informacoes) {
        initComponents();
        this.itemTombo = itemTombo;
        
        preencherCampos();
        if (informacoes) {
            desabilitarComponentes();
            btnAtualizarDados.setEnabled(false);
            btnEditarLivroConsignado.setEnabled(true);
        } else {
            btnEditarLivroConsignado.setEnabled(false);
        }
        ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 1108, 500);
        addWindowListener(this);
    }
    
    private void desabilitarComponentes() {
        this.txtMateriaPrimaLivroConsignado.setEnabled(false);
        this.jDateDeUtilizacaoInicialLivroConsignado.setEnabled(false);
        this.jDateDeUtilizacaoFinalLivroConsignado.setEnabled(false);
        this.txtEstiloLivroConsignado.setEnabled(false);
        this.txtGrupoLingLivroConsignado.setEnabled(false);
        this.txtRegiaoLivroConsignado.setEnabled(false);
        this.jComboPaisLivroConsignado.setEnabled(false);
        this.txtProcedenciaLivroConsignado.setEnabled(false);
        this.txtFuncaoEspecificaLivroConsignado.setEnabled(false);
        this.txtCulturaLivroConsignado.setEnabled(false);
        this.txtSitioLivroConsignado.setEnabled(false);
        this.txtTecmanufaturaLivroConsignado1.setEnabled(false);
        this.txtTipoDeObjetoLivroConsignado.setEnabled(false);
        this.txtCodigoAuxiliarLivroConsignado.setEnabled(false);
    }
    
    private void habilitarComponentes() {
        this.txtMateriaPrimaLivroConsignado.setEnabled(true);
        this.jDateDeUtilizacaoInicialLivroConsignado.setEnabled(true);
        this.jDateDeUtilizacaoFinalLivroConsignado.setEnabled(true);
        this.txtEstiloLivroConsignado.setEnabled(true);
        this.txtGrupoLingLivroConsignado.setEnabled(true);
        this.txtRegiaoLivroConsignado.setEnabled(true);
        this.jComboPaisLivroConsignado.setEnabled(true);
        this.txtProcedenciaLivroConsignado.setEnabled(true);
        this.txtFuncaoEspecificaLivroConsignado.setEnabled(true);
        this.txtCulturaLivroConsignado.setEnabled(true);
        this.txtSitioLivroConsignado.setEnabled(true);
        this.txtTecmanufaturaLivroConsignado1.setEnabled(true);
        this.txtTipoDeObjetoLivroConsignado.setEnabled(true);
        this.txtCodigoAuxiliarLivroConsignado.setEnabled(true);
    }
    
    private void preencherCampos() {
        this.txtMateriaPrimaLivroConsignado.setText(itemTombo.getMateriaPrima());
        this.jDateDeUtilizacaoInicialLivroConsignado.setDate(itemTombo.getDataUtilizacaoInicial());
        this.jDateDeUtilizacaoFinalLivroConsignado.setDate(itemTombo.getDataUtilizacaoFinal());
        this.txtEstiloLivroConsignado.setText(itemTombo.getEstilo());
        this.txtGrupoLingLivroConsignado.setText(itemTombo.getGrupoLinguistico());
        this.txtRegiaoLivroConsignado.setText(itemTombo.getRegiao());
        this.jComboPaisLivroConsignado.setSelectedItem(itemTombo.getPais());
        this.txtProcedenciaLivroConsignado.setText(itemTombo.getProcedencia());
        this.txtFuncaoEspecificaLivroConsignado.setText(itemTombo.getFuncaoEspecifica());
        this.txtCulturaLivroConsignado.setText(itemTombo.getCultura());
        this.txtSitioLivroConsignado.setText(itemTombo.getSitio());
        this.txtTecmanufaturaLivroConsignado1.setText(itemTombo.getTecnicaManufatura());
        this.txtTipoDeObjetoLivroConsignado.setText(itemTombo.getTipoObjeto());
        this.txtCodigoAuxiliarLivroConsignado.setText(String.valueOf(itemTombo.getOutroCodigo()));
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
        txtCodigoAuxiliarLivroConsignado = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMateriaPrimaLivroConsignado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateDeUtilizacaoInicialLivroConsignado = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtTipoDeObjetoLivroConsignado = new javax.swing.JTextField();
        jDateDeUtilizacaoFinalLivroConsignado = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRegiaoLivroConsignado = new javax.swing.JTextField();
        txtTecmanufaturaLivroConsignado1 = new javax.swing.JTextField();
        txtEstiloLivroConsignado = new javax.swing.JTextField();
        txtFuncaoEspecificaLivroConsignado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtGrupoLingLivroConsignado = new javax.swing.JTextField();
        txtCulturaLivroConsignado = new javax.swing.JTextField();
        txtProcedenciaLivroConsignado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSitioLivroConsignado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboPaisLivroConsignado = new javax.swing.JComboBox();
        btnAtualizarDados = new javax.swing.JButton();
        btnEditarLivroConsignado = new javax.swing.JButton();
        btnImagem = new javax.swing.JButton();
        btnAlterarImagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Informaçoes Item Livro Consignado");

        jLabel1.setText("*Codigo Auxiliar:");

        txtCodigoAuxiliarLivroConsignado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabel2.setText("*Materia Prima:");

        jLabel6.setText("Data de Utilizaçao Inicial:");

        jLabel8.setText("*Tipo de Objeto:");

        jLabel7.setText("Data de Utilizaçao Final:");

        jLabel9.setText("Funçao Especifica:");

        jLabel11.setText("Estilo:");

        jLabel13.setText("Tecnica de Manufatura:");

        jLabel15.setText("Regiao:");

        jLabel10.setText("Cultura:");

        jLabel12.setText("Grupo Linguistico:");

        txtGrupoLingLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoLingLivroConsignadoActionPerformed(evt);
            }
        });

        txtCulturaLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCulturaLivroConsignadoActionPerformed(evt);
            }
        });

        jLabel14.setText("Procedencia:");

        jLabel16.setText("Sitio:");

        jLabel17.setText("Pais:");

        jComboPaisLivroConsignado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------------", "África do Sul", "Albânia", "Alemanha", " Andorra", "Angola", "Anguilla", "Antigua", "Arábia Saudita", "Argentina", "Armênia", "Aruba", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Bélgica", "Benin", "Bermudas", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burkina Fasso", "Botão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Cazaquistão", "Chade", "Chile", "China", "Cidade do Vaticano", "Colômbia", "Congo", "Coréia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Dinamarca", "Djibuti", "Dominica", "EUA", "Egito", "El Salvador", "Emirados Árabe", "Equador", "Eritréia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Gibraltar", "Granada", "Grécia", "Guadalupe", "Guam", "Guatemala", "Guiana", "Guiana Francesa", "Guiné-bissau", "Haiti", "Holanda", "Honduras", "Hong Kong", "Hungria", "Iêmen", "Ilhas Cayman", "Ilhas Cook", "Ilhas Curaçao", "Ilhas Marshall", "Ilhas Turks & Caicos", "Ilhas Virgens (brit.)", "lhas Virgens(amer.)", "Ilhas Wallis e Futuna", "Índia", "Indonésia", "Inglaterra", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Latvia", "Líbano", "Liechtenstein", "Lituânia", "Luxemburgo", "Macau", "Macedônia", "Madagascar", "Malásia", "Malaui", "Mali", "Malta", "Marrocos", "Martinica", "Mauritânia", "Mauritius", "México", "Moldova", "Mônaco", "Montserrat", "Nepal", "Nicarágua", "Niger", "Nigéria", "Noruega", "Nova Caledônia", "Nova Zelândia", "Omã", "Palau", "Panamá", "Papua-nova Guiné", "Paquistão", "Peru", "Polinésia Francesa", "Polônia", "Porto Rico", "Portugal", "Qatar", "Quênia", "Rep. Dominicana", "Rep. Tcheca", "Reunion", "Romênia", "Ruanda", "Rússia", "Saipan", "Samoa Americana", "Senegal", "Serra Leone", "Seychelles", "Singapura", "Síria", "Sri Lanka", "St. Kitts & Nevis", "St. Lúcia", "St. Vincent", "Sudão", "Suécia", "Suiça", "Suriname", "Tailândia", "Taiwan", "Tanzânia", "Togo", "Trinidad & Tobago", "Tunísia", "Turquia", "Ucrânia", "Uganda", "Uruguai", "Venezuela", "Vietnã", "Zaire", "Zâmbia", "Zimbábue" }));
        jComboPaisLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPaisLivroConsignadoActionPerformed(evt);
            }
        });

        btnAtualizarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/cadastrar.png"))); // NOI18N
        btnAtualizarDados.setText("Atualizar Dados");
        btnAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDadosActionPerformed(evt);
            }
        });

        btnEditarLivroConsignado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/editar.png"))); // NOI18N
        btnEditarLivroConsignado.setText("Editar");
        btnEditarLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLivroConsignadoActionPerformed(evt);
            }
        });

        btnImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/calcular.png"))); // NOI18N
        btnImagem.setText("Ver Imagem");
        btnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemActionPerformed(evt);
            }
        });

        btnAlterarImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/add.png"))); // NOI18N
        btnAlterarImagem.setText("Adicionar/Atualizar Imagem");
        btnAlterarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarImagemActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoAuxiliarLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMateriaPrimaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFuncaoEspecificaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCulturaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateDeUtilizacaoInicialLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateDeUtilizacaoFinalLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstiloLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGrupoLingLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTecmanufaturaLivroConsignado1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProcedenciaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtRegiaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSitioLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jComboPaisLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoDeObjetoLivroConsignado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarLivroConsignado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAtualizarDados)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnImagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarImagem)
                                .addGap(520, 520, 520)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoAuxiliarLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMateriaPrimaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateDeUtilizacaoInicialLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateDeUtilizacaoFinalLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoDeObjetoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncaoEspecificaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCulturaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstiloLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrupoLingLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTecmanufaturaLivroConsignado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProcedenciaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegiaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSitioLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboPaisLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImagem)
                    .addComponent(btnAlterarImagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarDados)
                    .addComponent(btnEditarLivroConsignado))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGrupoLingLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoLingLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoLingLivroConsignadoActionPerformed

    private void txtCulturaLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCulturaLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCulturaLivroConsignadoActionPerformed

    private void jComboPaisLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPaisLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPaisLivroConsignadoActionPerformed

    private void btnEditarLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLivroConsignadoActionPerformed
        habilitarComponentes();
        btnAtualizarDados.setEnabled(true);
    }//GEN-LAST:event_btnEditarLivroConsignadoActionPerformed

    private void btnAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDadosActionPerformed
        if ((this.txtCodigoAuxiliarLivroConsignado.getText().isEmpty()
                || this.txtMateriaPrimaLivroConsignado.getText().isEmpty()
                || this.txtTipoDeObjetoLivroConsignado.getText().isEmpty())
                && (this.jDateDeUtilizacaoInicialLivroConsignado.getDate().after(this.jDateDeUtilizacaoFinalLivroConsignado.getDate()))) {
            GeradorDeMensagem.exibirMensagemDeInformacao("Por favor, preencha os campos marcados com '*', pois sao obrigatorios. \n Tambem verifique a validade das datas!", "Alerta de Usuario");
            return;
        } else {
            
            try {
                this.itemTombo.setOutroCodigo(Integer.parseInt(this.txtCodigoAuxiliarLivroConsignado.getText()));
            } catch (NumberFormatException erroDeConversao) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operaçao novamente!");
                return;
            }
            
            this.itemTombo.setMateriaPrima(this.txtMateriaPrimaLivroConsignado.getText());
            this.itemTombo.setDataUtilizacaoInicial(this.jDateDeUtilizacaoInicialLivroConsignado.getDate());
            this.itemTombo.setDataUtilizacaoFinal(this.jDateDeUtilizacaoFinalLivroConsignado.getDate());
            this.itemTombo.setEstilo(this.txtEstiloLivroConsignado.getText());
            this.itemTombo.setGrupoLinguistico(this.txtGrupoLingLivroConsignado.getText());
            this.itemTombo.setRegiao(this.txtRegiaoLivroConsignado.getText());
            Object dadosPais = this.jComboPaisLivroConsignado.getSelectedItem();
            this.itemTombo.setPais(dadosPais.toString());
            this.itemTombo.setProcedencia(this.txtProcedenciaLivroConsignado.getText());
            this.itemTombo.setFuncaoEspecifica(this.txtFuncaoEspecificaLivroConsignado.getText());
            this.itemTombo.setCultura(this.txtCulturaLivroConsignado.getText());
            this.itemTombo.setSitio(this.txtSitioLivroConsignado.getText());
            this.itemTombo.setTecnicaManufatura(this.txtTecmanufaturaLivroConsignado1.getText());
            this.itemTombo.setTipoObjeto(this.txtTipoDeObjetoLivroConsignado.getText());
            this.itemTombo.setImage(false);
            try {
                if (this.itemTombo.alterar(this.itemTombo)) {
                    GeradorDeMensagem.exibirMensagemDeInformacao("Os dados foram cadastrados com sucesso!", "Alerta ao Usuario");
                    dispose();
                } else {
                    GeradorDeMensagem.exibirMensagemDeErro("Ocorreu alguns problemas, por favor realize a operaçao mais tarde!");
                }
                
            } catch (Exception erro1) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreu alguns problemas, por favor realize a operaçao mais tarde!");
            }
            
        }        
    }//GEN-LAST:event_btnAtualizarDadosActionPerformed

    private void btnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemActionPerformed
        if(itemTombo.getID()!=null){
            new FrameExibicaoDeImage(itemTombo.getID());
        }
    }//GEN-LAST:event_btnImagemActionPerformed

    private void btnAlterarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarImagemActionPerformed
        if(itemTombo.getID()!=null){
        new FrameAlterarImagem(itemTombo.getID());
        }
    }//GEN-LAST:event_btnAlterarImagemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarImagem;
    private javax.swing.JButton btnAtualizarDados;
    private javax.swing.JButton btnEditarLivroConsignado;
    private javax.swing.JButton btnImagem;
    private javax.swing.JComboBox jComboPaisLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateDeUtilizacaoFinalLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateDeUtilizacaoInicialLivroConsignado;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtCodigoAuxiliarLivroConsignado;
    private javax.swing.JTextField txtCulturaLivroConsignado;
    private javax.swing.JTextField txtEstiloLivroConsignado;
    private javax.swing.JTextField txtFuncaoEspecificaLivroConsignado;
    private javax.swing.JTextField txtGrupoLingLivroConsignado;
    private javax.swing.JTextField txtMateriaPrimaLivroConsignado;
    private javax.swing.JTextField txtProcedenciaLivroConsignado;
    private javax.swing.JTextField txtRegiaoLivroConsignado;
    private javax.swing.JTextField txtSitioLivroConsignado;
    private javax.swing.JTextField txtTecmanufaturaLivroConsignado1;
    private javax.swing.JTextField txtTipoDeObjetoLivroConsignado;
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
