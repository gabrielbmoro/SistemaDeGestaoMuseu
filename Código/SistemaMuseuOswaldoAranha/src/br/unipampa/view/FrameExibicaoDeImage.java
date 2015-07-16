/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.service.UtilitariaDeUploadDeImagem;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author gabrielbmoro
 */
public class FrameExibicaoDeImage extends javax.swing.JFrame implements WindowListener{

    private Image bImage;

    /**
     * Creates new form FrameExibicaoDeImage
     */
    public FrameExibicaoDeImage(Long idItemDeAcervo) {
        initComponents();
        
        if(new File(UtilitariaDeUploadDeImagem.PATH+idItemDeAcervo.toString()+UtilitariaDeUploadDeImagem.EXTENSAO).exists()){
        bImage = Toolkit.getDefaultToolkit().createImage(UtilitariaDeUploadDeImagem.PATH+idItemDeAcervo.toString()+UtilitariaDeUploadDeImagem.EXTENSAO);
        
        super.setContentPane(new PanelInterno());
        definirDimensaoDoFrame(idItemDeAcervo);
        
        addWindowListener(this);
        setVisible(true);
        }else{
            GeradorDeMensagem.exibirMensagemDeInformacao("Nenhuma imagem encontrada!", "Alerta ao Usuario");
            dispose();
        }
    }

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

    protected class PanelInterno extends JPanel {

        @Override
        protected void paintComponent(final Graphics g) {
            super.paintComponent(g);
            g.drawImage(bImage, 0, 0, this);
        }
    }

    private void definirDimensaoDoFrame(Long idItemDeAcervo){
        try {
            BufferedImage imagem = ImageIO.read(new File(UtilitariaDeUploadDeImagem.PATH+idItemDeAcervo.toString()+UtilitariaDeUploadDeImagem.EXTENSAO));
            if(imagem.getWidth()>0 && imagem.getHeight()>0){
                setSize(imagem.getWidth(), imagem.getHeight());
            }else{
                setSize(800,600);
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameExibicaoDeImage.class.getName()).log(Level.SEVERE, null, ex);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Frame de Exibiçao de Imagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
