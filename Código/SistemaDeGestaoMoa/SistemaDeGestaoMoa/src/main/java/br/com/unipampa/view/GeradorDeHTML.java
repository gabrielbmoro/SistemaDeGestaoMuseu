/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.view;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author gabrielbmoro
 */
public class GeradorDeHTML {

    public static void gerarAreaDeNotificacao(JspWriter print) throws IOException {
        print.println("<ul class=\"nav navbar-right top-nav\">");
        print.println("<li class=\"dropdown\">");
        print.println("<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-bell\"></i> <b class=\"caret\"></b></a>");
        print.println("<ul class=\"dropdown-menu alert-dropdown\">");
        print.println("<li>");
        print.println("<a href=\"#\">Alert Name <span class=\"label label-default\">Alert Badge</span></a>");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"#\">Alert Name <span class=\"label label-primary\">Alert Badge</span></a>");
        print.println(" </li>");
        print.println(" <li>");
        print.println("          <a href=\"#\">Alert Name <span class=\"label label-success\">Alert Badge</span></a>");
        print.println("   </li>");
        print.println("    <li>");
        print.println("       <a href=\"#\">Alert Name <span class=\"label label-info\">Alert Badge</span></a>");
        print.println("   </li>");
        print.println("  <li>");
        print.println("   <a href=\"#\">Alert Name <span class=\"label label-warning\">Alert Badge</span></a>");
        print.println(" </li>");
        print.println("<li>");
        print.println("    <a href=\"#\">Alert Name <span class=\"label label-danger\">Alert Badge</span></a>");
        print.println("</li>");
        print.println("<li class=\"divider\"></li>");
        print.println("<li>");
        print.println("     <a href=\"#\">View All</a>");
        print.println(" </li>");
        print.println(" </ul>");
        print.println(" </li>");
        print.println(" <li class=\"dropdown\">");
        print.println("<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> Usuario <b class=\"caret\"></b></a>");
        print.println("<ul class=\"dropdown-menu\">");
        print.println("   <li class=\"divider\"></li>");
        print.println("  <li>");
        print.println("     <a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Sair </a>");
        print.println(" </li>");
        print.println("</ul>");
        print.println("</li>");
        print.println(" </ul>");
    }

    public static void gerarMenuPadrao(JspWriter print) throws IOException {
        print.println("<div class=\"collapse navbar-collapse navbar-ex1-collapse\">");
        print.println("<ul class=\"nav navbar-nav side-nav\">");
        print.println("<li>");
        print.println("<h4> <font color=\"white\">Acervo </font></h4> ");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#demo3\"><i class=\"fa fa-fw fa-arrows-v\"></i> Livro tombo <i class=\"fa fa-fw fa-caret-down\"></i></a>");
        print.println("<ul id=\"demo3\" class=\"collapse\">");
        print.println("<li>");
        print.println("<a href=\"cadastroDeItemLivroTombo.jsp\"> Novo Item </a>");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"alterarListarItemTombo.jsp\"> Listar Itens </a>");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"registrarImagemParaItemDeAcervo.jsp\"> Registrar Imagem para Item de Acervo </a>");
        print.println("/li>");
        print.println("</ul>");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#demo\"><i class=\"fa fa-fw fa-arrows-v\"></i> Livro Consignado <i class=\"fa fa-fw fa-caret-down\"></i></a>");
        print.println("<ul id=\"demo\" class=\"collapse\">");
        print.println("<li>");
        print.println("<a href=\"cadastroDeItemLivroConsignado.jsp\"> Novo Item </a>");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"alterarListarLivroConsignado.jsp\"> Listar Itens Consignados </a>");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"registrarImagemParaItemDeAcervo.jsp\">Registrar Imagem para Item de Acervo</a>");
        print.println(" </li>");
        print.println(" </ul>");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#demo2\"><i class=\"fa fa-fw fa-arrows-v\"></i> Biblioteca <i class=\"fa fa-fw fa-caret-down\"></i></a>");
        print.println("<ul id=\"demo2\" class=\"collapse\">");
        print.println("<li>");
        print.println(" <a href=\"cadastroDeLivroDaBiblioteca.jsp\">Novo Item</a>");
        print.println("</li>");
        print.println("<li>");
        print.println(" <a href=\"alterarListarItemLivroBiblioteca.jsp\">Listar Livros</a>");
        print.println("</li>");
        print.println("</ul>");
        print.println("</li>");
        print.println("</ul>");
        print.println("</div>");
    }
    
    public static void gerarMenuUsuario(JspWriter print) throws IOException {
        print.println("<div class=\"collapse navbar-collapse navbar-ex1-collapse\">");
        print.println("<ul class=\"nav navbar-nav side-nav\">");
        print.println("<li>");
        print.println("<h4> <font color=\"white\">Usuários </font></h4> ");
        print.println("</li>");
        print.println("<li>");
        print.println("<a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#demo3\"><i class=\"fa fa-fw fa-arrows-v\"></i> Gerenciar <i class=\"fa fa-fw fa-caret-down\"></i></a>");
        print.println("<ul id=\"demo3\" class=\"collapse\">");
        print.println("<li>");
        print.println("<a href=\"CadastroDeUsuario.jsp\"> Novo Usuário </a>");
        print.println("<li>");
        print.println("<a href=\"paginaInicial.jsp\"> Visualizar Usuários </a>");
        print.println("</ul>");
        print.println("</li>");
        print.println("<li>");
        print.println("</li>");
        print.println("</ul>");
        print.println("</li>");
        print.println("</ul>");
        print.println("</div>");
    }
    
    
}
