<%-- 
    Document   : alterarListarItemTombo
    Created on : 27/05/2015, 14:09:20
    Author     : neto
--%>

<%@page import="br.com.unipampa.model.LivroDaBiblioteca"%>
<%@page import="br.com.unipampa.view.GeradorDeHTML"%>
<%@page import="br.com.unipampa.controller.RestauraItens"%>
<%@page import="java.util.List"%>
<%@page import="br.com.unipampa.model.LivroDaBiblioteca"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.unipampa.dao.DAOLivroDaBiblioteca"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SisMoa</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/sb-admin.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="css/plugins/morris.css" rel="stylesheet">
        <script src="js/bootstrap.js" type="text/javascript"></script>

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <script src="script/auxiliadorDeRegistroDeImagem.js" type="text/javascript"></script>

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>
        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="paginaInicial.html" style="margin: auto 700%" >SisMoa</a>
                </div>
                <!-- Top Menu Items -->
                <%
                    GeradorDeHTML.gerarAreaDeNotificacao(out);
                %>
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <%
                    GeradorDeHTML.gerarMenuPadrao(out);
                %>
            </nav>
            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">
                                Listar Livros da Biblioteca
                            </h1>

                        </div>
                    </div>
                    <!-- /.row -->


                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-6">

                            <%
                                RestauraItens restauradorDeItens = new RestauraItens();

                                List<LivroDaBiblioteca> listaDeItem = restauradorDeItens.restauraLivroDABiblioteca();
                                out.println("<table border= \"1\"  id= \"livro\" class=\"table table-striped table-advance table-hover display\" >");
                                if (listaDeItem != null) {

                                    out.println("<tr>");
                                    out.println("<td> <b>"+ "ID" + "</b> </td>");
                                    out.println("<td> <b>"+ "Codigo de Registro" + "</b> </td>");
                                    out.println("<td><b>" + "Nome do Livro" + "</b></td>");
                                    out.println("<td> <b>" + "Nome do Autor" + "</b> </td>");
                                    out.println("<td> <b>" + "Ano de Lancamento" + "</b> </td>");
                                    out.println("<td> <b>" + "Grafica" + "</b> </td>");
                                    out.println("<td> <b>" + "Região" + "</b> </td>");
                                    out.println("<td> <b>" + "Pais" + "</b> </td>");
                                    out.println("<td> <b>" + "Opcao " + "</b> </td>");
                                    
                                    out.println("</tr>");

                                    for (LivroDaBiblioteca itemTemp : listaDeItem) {

                                        out.println("<tr>");
                                        out.println("<td>" + itemTemp.getID()+ "</td>");
                                        out.println("<td>" + itemTemp.getOutroCodigo()+ "</td>");
                                        out.println("<td>" + itemTemp.getNomeLivro() + "</td>");
                                        out.println("<td>" + itemTemp.getNomeAutor() + "</td>");
                                        out.println("<td>" + itemTemp.getAnoLacamento() + "</td>");
                                        out.println("<td>" + itemTemp.getGrafica() + "</td>");
                                        out.println("<td>" + itemTemp.getRegiao() + "</td>");
                                        out.println("<td>" + itemTemp.getPais() + "</td>");
                                        out.println("<td>"+
                                                "<div class=\"btn-group\">"+
                                                " <h:form>"+
                                               " <button class=\"alert-danger\" >"+"<span class=\"fa fa-close\"></span>" 
                                                +" <button class=\"alert-info\" style=\"margin-right:40px;float:top\" >"+"<span class=\"fa fa-pencil\"></span>" +"</button>"
                                               +" </h:form>"+
                                                "<div>"+
                                                "</td>");
                                     out.println("</tr>");
                                        

                                     
                                    }
                                }
                                out.println("</table>");
                                
                            %>

                        </div>  

                    </div>
     
                         
                            
                    <!-- /.row -->

                    <!-- /.row -->

                    <!-- /.row -->

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- /#page-wrapper -->

        </div>
    </body>

    <script type="text/javascript" charset="utf8" src="DataTables-1.10.6/media/js/jquery.js"></script>
    <script type="text/javascript" charset="utf8" src="DataTables-1.10.6/media/js/jquery.dataTables.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#livro').DataTable();
        });
    </script>

</html>
