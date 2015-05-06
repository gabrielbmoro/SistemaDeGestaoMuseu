<%-- 
    Document   : registrarImagemParaItemDeAcervo
    Created on : 01/05/2015, 12:25:10
    Author     : Gabriel B Moro
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.unipampa.model.ItemTombo"%>
<%@page import="br.com.unipampa.controller.RestauraItens"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="script/auxiliadorDeRegistroDeImagem.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Foto para Determinado Item de Acervo</h1>
        <label>Escolha algum item para registrar uma foto:</label>

        <table>
            <tr>
                <td>Identificador</td>
                <td>Outro Código</td>
                <td>Tipo de Objeto</td>
                <td>Cultura</td>
            </tr>
            <%
                RestauraItens restauradorDeItens = new RestauraItens();

                List<ItemTombo> listaDeItem = restauradorDeItens.restauraItensDoAcervo();
                for (ItemTombo itemTemp : listaDeItem) {
                    out.println("<tr>");
                    out.println("<td><input type=\"radio\" name=\"idDaFoto\" value=\"" + String.valueOf(itemTemp.getID()) + "\" onclick=\"auxiliadorDeRegistroDeImagem(this)\" />" + String.valueOf(itemTemp.getID()) + " </td>");
                    out.println("<td>" + itemTemp.getOutroCodigo() + "</td>");
                    out.println("<td>" + itemTemp.getTipoObjeto() + "</td>");
                    out.println("<td>" + itemTemp.getCultura() + "</td>");
                    out.println("</tr>");
                }
            %>
        </table>
        <form id="formularioDeImage" method="POST" action="./TrataUploadDeImagem" enctype="multipart/form-data">
            <label>Nome da Imagem: </label><br />
            <input type="text" name="idDaFoto" id="idDoArquivo" disabled /><br />
            <input id="nomeDeArquivo" type="file" name="image" /><br />
            <button onclick="enviarFormularioDeArquivo()">Registrar Imagem</button>
        </form>
    </body>
</html>
