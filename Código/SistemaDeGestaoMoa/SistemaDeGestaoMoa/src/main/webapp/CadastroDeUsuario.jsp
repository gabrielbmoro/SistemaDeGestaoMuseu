<%-- 
    Document   : CadastroDeUsuario
    Created on : 19/05/2015, 16:31:26
    Author     : neto
--%>

<%@page import="br.com.unipampa.view.GeradorDeHTML"%>
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

                <!-- /.navbar-collapse -->
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
                            <!--method="POST" action="./CadastroLivroTombo"-->
                            <form id="cadastroDeItem" method="POST" action="./CadastroDeUsuario">
                                <div class="form-group">
                                    <div class="col-lg-12">
                                        <div >
                                            <h3> Formulário de Cadastro De Usuários</h3>
                                                <br />
                                                <label>Nome:</label> 
                                                <input class="form-control" type="text" name="nome" ><br />
                                                <label>CPF:</label> 
                                                <input class="form-control" type="text" name="cpf"><br />
                                                <label>Endereço:</label> 
                                                <input  class="form-control" type="text" name="endereco"><br />
                                                <label>Login:</label> 
                                                <input class="form-control" type="text" name="login"><br />
                                                <label>Senha:</label> 
                                                <input class="form-control" type="password" name="senha"><br />
                                                <label>Repita a Senha:</label> 
                                                <input class="form-control" type="password" name="senha"><br />
                                                <input class="btn btn-primary" type="submit" value="Salvar"> <br />
                                            
                                            <!--<input class="btn btn-primary" type="submit" value="Registrar Item em Acervo" />-->
                                            <!-- Button to trigger modal -->

                                        </div>
                                        <!-- set up the modal to start hidden and fade in and out -->

                                    </div>
                                </div>
                            </form>

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

        <div id="myModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <!-- dialog body -->
                    <div class="modal-body">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        Hello world!
                    </div>
                    <!-- dialog buttons -->
                    <div class="modal-footer"><button type="button" class="btn btn-primary">OK</button></div>
                </div>
            </div>
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



