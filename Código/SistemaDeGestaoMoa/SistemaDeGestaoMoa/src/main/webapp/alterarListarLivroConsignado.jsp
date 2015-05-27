<%-- 
    Document   : alterarListarLivroTombo
    Created on : 19/05/2015, 23:29:30
    Author     : Wolle
--%>

<%@page import="br.com.unipampa.view.GeradorDeHTML"%>
<%@page import="br.com.unipampa.controller.RestauraItens"%>
<%@page import="java.util.List"%>
<%@page import="br.com.unipampa.model.ItemConsignado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.unipampa.dao.DAOItemTombo"%>
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
                                Ligar Livro Consignado
                            </h1>

                        </div>
                    </div>
                    <!-- /.row -->


                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-6">

                            <%
                                RestauraItens restauradorDeItens = new RestauraItens();

                                List<ItemConsignado> listaDeItem = restauradorDeItens.restauraItemConsignado();
                                out.println("<table border= \"1\"  id= \"livro\" class=\"table table-striped table-advance table-hover display\" >");
                                if (listaDeItem != null) {

                                    out.println("<tr>");
                                    out.println("<td> <b>"+ "Data Do Emprestimo" + "</b> </td>");
                                    out.println("<td><b>" + "Data De Devolucao" + "</b></td>");
                                    out.println("<td> <b>" + "Responsavel Da Familia " + "</b> </td>");
                                    out.println("<td> <b>" + "Ações " + "</b> </td>");
                                    out.println("</tr>");

                                    for (ItemConsignado itemTemp : listaDeItem) {

                                        out.println("<tr>");
                                        out.println("<td>" + itemTemp.getDataDoEmprestimo() + "</td>");
                                        out.println("<td>" + itemTemp.getDataDeDevolucao() + "</td>");
                                        out.println("<td>" + itemTemp.getResponsavelDaFamilia() + "</td>");
                                        out.println("<td>"+
                                                "<div class=\"btn-group\">"+
                                                " <h:form>"+
                                               " <button class=\"alert-danger\" >"+"<span class=\"fa fa-close\"></span>" + "</button>"
                                               + "<button class=\"alert-info\" style=\"margin-left:30px;float:top\" ><span class=\"fa fa-pencil\"></span></button>"+
                                               " </h:form>"+
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