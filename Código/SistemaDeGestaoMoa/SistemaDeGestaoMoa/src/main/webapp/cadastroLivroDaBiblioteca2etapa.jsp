<%-- 
    Document   : cadastroLivroDaBiblioteca2etapa
    Created on : 14/05/2015, 22:09:00
    Author     : Rodrigo
--%>

<%@page import="br.com.unipampa.view.GeradorDeHTML"%>
<%@page import="br.com.unipampa.model.LivroDaBiblioteca"%>
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
                                Sistema de Gestão - Museu Oswaldo Aranha
                            </h1>

                        </div>
                    </div>
                    <!-- /.row -->


                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-6">

                            <%
                                Object value = session.getAttribute("livroRecemCadastrado");
                                if (value instanceof LivroDaBiblioteca) {
                                    LivroDaBiblioteca livroDaBiblioteca = (LivroDaBiblioteca) value;
                                    if (livroDaBiblioteca.getID() != null) {
                                        out.println("<div class=\"row\">");
                                        out.println("<div class=\"col-lg-12\">");
                                        out.println("<div class=\"alert alert-info alert-dismissable \">");
                                        out.println("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>");
                                        out.println("Cadastro realizado com sucesso!");
                                        out.println("<h1>Agora insira a foto desse item de acervo.</h1>");
                                        out.println("</div>");
                                        out.println("</div>");
                                        out.println("</div>");

                                        out.print("<form method=\"POST\" action=\"./TrataUploadDeImagem\" enctype=\"multipart/form-data\">");
                                        out.print("<label>Nome da Imagem: </label><br />");
                                        out.print("<input type=\"text\" name=\"idDaFoto\" id=\"idDoArquivo\" value=\""+livroDaBiblioteca.getID()+"\" disabled /><br />");
                                        out.print("<input id=\"nomeDeArquivo\" type=\"file\" name=\"image\" /><br />");
                                        out.print("<button onclick=\"enviarFormularioDeArquivo()\">Registrar Imagem</button>");
                                        out.print("</form>");
                                    }
                                } else {
                                    out.println("<div class=\"row\">");
                                        out.println("<div class=\"col-lg-12\">");
                                        out.println("<div class=\"alert alert-danger alert-dismissable \">");
                                        out.println("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>");
                                        out.println("<h1>Por favor, realize o seu cadastro em outro momento!</h1>");
                                        out.println("</div>");
                                        out.println("</div>");
                                        out.println("</div>");
                                }
                            %>
                            <!-- Button to trigger modal -->
                            <!--<a href="#myModal" role="button" class="btn" data-toggle="modal">Launch demo modal</a>-->
                            <!-- Button to trigger modal -->

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


        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="js/plugins/morris/raphael.min.js"></script>
        <script src="js/plugins/morris/morris.min.js"></script>
        <script src="js/plugins/morris/morris-data.js"></script>
        <!-- sometime later, probably inside your on load event callback -->

        <!-- Le javascript
================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
        <script src="assets/js/jquery.js"></script>
    </body>


</html>


