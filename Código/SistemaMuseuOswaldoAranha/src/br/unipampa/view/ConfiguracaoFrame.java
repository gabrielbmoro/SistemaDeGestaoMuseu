/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import javax.swing.JFrame;

/**
 * 
 * <b>Propósito:</b>
 * <br>
 * Classe responsável por automatizar o processo de configuração de JFrames.
 * <br>
 * <b>Instruções de uso:</b>
 * <br>
 * Deve ser utilizado por qualquer classe.
 * 
 * @author GabrielBMoro
 * @version 0.4
 * @since 24/01/2014
 */
public class ConfiguracaoFrame {
/**
 * <b>Propósito:</b>
 * Método responsável por configurar básicamente um Jframe, incluindo um tamanho padrão.
 * @param frame de tipo {@link JFrame}
 */
    public static void configFrameTamanhoPadrao(JFrame frame) {
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);//Centraliza JFRAME
        frame.setResizable(false);
        frame.setVisible(true);
    }
/**
 * <b>Propósito:</b>
 * Método responsável por configurar básicamente um Jframe, sem um padrão de tamanho.
 * @param frame de tipo {@link JFrame}
 */
    public static void configFrameSemTamanho(JFrame frame){
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    /**
 * <b>Propósito:</b>
 * Método responsável por configurar básicamente um Jframe, incluindo um tamanho personalizado.
 * @param frame de tipo {@link JFrame}
 */
    public static void configFrameComTamanhoPersonalizado(JFrame frame, int width, int height){
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
}
}
