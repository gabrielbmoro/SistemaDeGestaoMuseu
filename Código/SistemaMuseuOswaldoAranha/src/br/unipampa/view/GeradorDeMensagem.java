/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import javax.swing.JOptionPane;

/**
 * 
 * <b>Propósito:</b>
 * <br>
 * Classe responsável por automatizar os feedbacks prestados ao usuário.
 * <br>
 * <b>Instruções de uso:</b>
 * <br>
 * Deve ser utilizado por qualquer classe.
 * 
 * @author GabrielBMoro
 * @version 0.4
 * @since 24/01/2014
 */
public class GeradorDeMensagem {
/**
 * <b>Propósito:</b>
 * <br>
 * Método responsável pela formulação de uma pergunta com opções sim ou não como resposta.
 * @param message de tipo {@link String}
 * @param title de tipo {@link String}
 * @return de tipo {@link Boolean}
 */
    public static boolean exibirMensagemDeConfirmacao(String message, String title) {
        int num = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
        if (num == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
/**
 * <b>Propósito:</b>
 * <br>
 * Método responsável pela formulação de uma mensagem informativa.
 * @param message de tipo {@link String}
 * @param title de tipo {@link String}
 */
    public static void exibirMensagemDeInformacao(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
/**
 * <b>Propósito:</b>
 * <br>
 * Método responsável pela formulação de uma mensagem informativa.
 * @param message de tipo {@link String}
 */
    public static void exibirMensagemDeErro(String message) {
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
/**
 * <b>Propósito:</b>
 * <br>
 * Método responsável pela formulação de uma mensagem informativa com a opção de um input texto.
 * @param message de tipo {@link String}
 * @param title de tipo {@link String}
 * @return de tipo {@link String}
 */
    public static String exibirMensagemDeInputString(String message, String title) {
        String resposta = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        if (resposta == null || resposta.isEmpty()) {
            GeradorDeMensagem.exibirMensagemDeInformacao("Digite dados válidos...", "Alerta à Usuário");
            GeradorDeMensagem.exibirMensagemDeInputString(message, title);
        } else {
            return resposta;
        }
        return null;
    }
/**
 * <b>Propósito:</b>
 * <br>
 * Método responsável pela formulação de uma mensagem informativa com a possibilidade de um input simples.
 * @param message de tipo {@link String}
 * @param title de tipo {@link String}
 * @return de tipo {@link Double}
 */
    public static double exibirMensagemDeInputDouble(String message, String title) {
        String resposta = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        try {
            double respostaDouble = Double.parseDouble(resposta);
            return respostaDouble;
        } catch (NumberFormatException erroNum) {
            GeradorDeMensagem.exibirMensagemDeInformacao("Digite apenas digitos numéricos", "Alerta à Usuário");
            GeradorDeMensagem.exibirMensagemDeInputDouble(message, title);
        }
        return 0.0;
    }

}
