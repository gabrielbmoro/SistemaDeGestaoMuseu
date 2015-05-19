<%-- 
    Document   : CadastroDeUsuario
    Created on : 19/05/2015, 16:31:26
    Author     : neto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CRUD Usuarios</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method="POST" action="./CadastroDeUsuario" >
            Nome: <input type="text" name="nome"><br /><br />
            CPF: <input type="text" name="cpf"><br /><br />
            Endereço: <input type="text" name="endereco"><br /><br />
            Login: <input type="text" name="login"><br /><br />
            Senha: <input type="text" name="senha"><br /><br />
            <input type="submit" value="Salvar"> <br /><br />
        </form>
        
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        
    </body>
</html>
