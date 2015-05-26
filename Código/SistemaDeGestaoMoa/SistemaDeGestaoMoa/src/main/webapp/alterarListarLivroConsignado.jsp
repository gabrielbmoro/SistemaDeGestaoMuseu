<%-- 
    Document   : alterarListarLivroTombo
    Created on : 19/05/2015, 23:29:30
    Author     : Wolle
--%>

<%@page import="br.com.unipampa.controller.RestauraItens"%>
<%@page import="java.util.List"%>
<%@page import="br.com.unipampa.model.ItemConsignado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.unipampa.dao.DAOItemTombo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            RestauraItens restauradorDeItens = new RestauraItens();

            List<ItemConsignado> listaDeItem = restauradorDeItens.restauraItemConsignado();
            out.println("<table>");
            if (listaDeItem != null) {
                for (ItemConsignado itemTemp : listaDeItem) {
                    out.println("<tr>");
                    out.println("<td>" + "Data Do Emprestimo" + "</td>");
                    out.println("<td>" + "Data De Devolucao" + "</td>");
                    out.println("<td>" + "Responsavel Da Familia " + "</td>");
                    out.println("</tr>");

                    out.println("<tr>");
                    out.println("<td>" + itemTemp.getDataDoEmprestimo() + "</td>");
                    out.println("<td>" + itemTemp.getDataDeDevolucao() + "</td>");
                    out.println("<td>" + itemTemp.getResponsavelDaFamilia() + "</td>");
                    out.println("</tr>");
                }
            }
            out.println("</table>");
        %>

    </body>
</html>