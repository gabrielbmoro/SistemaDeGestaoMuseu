<%-- 
    Document   : paginaInicial
    Created on : 18/05/2015, 21:07:39
    Author     : gabrielbmoro
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

                        <h1 class="page-header">
                            Bem-vindo ao SisMOA!
                        </h1>
                        <!--                        <div class="col-lg-12">
                                                    <h1 class="page-header">
                                                        Sistema de Gestão - Museu Oswaldo Aranha
                                                    </h1>
                        
                                                </div>
                                            </div>
                                             /.row 
                        
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="alert alert-info alert-dismissable">
                                                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                                        Dicas para o usuario!
                                                    </div>
                                                </div>
                                            </div>
                                             /.row 
                        
                                            <div class="row">
                                                <div class="col-lg-3 col-md-6">
                                                    <div class="panel panel-primary">
                                                        <div class="panel-heading">
                                                            <div class="row">
                                                                <div class="col-xs-9 text-right">
                                                                    <div class="huge">26</div>
                                                                    <div><h4>Cadastro de Livro Consignado</h4></div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-lg-3 col-md-6">
                                                    <a href="cadastroDeItemLivroTombo2.html">
                                                    <div class="panel panel-green">
                                                        <div class="panel-heading">
                                                            <div class="row">
                        
                                                                <div class="col-xs-9 text-right">
                                                                    <div class="huge">12</div>
                                                                    <div><h4>Cadastro do Livro Tombo</h4></div>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                    </div>
                                                        </a>
                                                </div>
                                                <div class="col-lg-3 col-md-6">
                                                    <div class="panel panel-yellow">
                                                        <div class="panel-heading">
                                                            <div class="row">
                        
                                                                <div class="col-xs-9 text-right">
                                                                    <div class="huge">124</div>
                                                                    <div><h4>Cadastro De Funcinarios</h4></div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-lg-3 col-md-6">
                                                    <div class="panel panel-red">
                                                        <div class="panel-heading">
                                                            <div class="row">
                                                                <div class="col-xs-9 text-right">
                                                                    <div class="huge">13</div>
                                                                    <div><h4>Alguma coisa</h4></div>
                                                                    <br>
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                    </div>
                                                </div>-->
                    </div>
                    <br><br><br><br><br><br><br><br><br><br><br><br><br><br>

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

        <!-- Morris Charts JavaScript -->
        <script src="js/plugins/morris/raphael.min.js"></script>
        <script src="js/plugins/morris/morris.min.js"></script>
        <script src="js/plugins/morris/morris-data.js"></script>

    </body>

</html>
