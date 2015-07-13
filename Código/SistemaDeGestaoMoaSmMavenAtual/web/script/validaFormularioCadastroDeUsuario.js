/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function enviarFormularioDeUsuario(){
    
    var formulario = document.getElementById("cadastroDeUsuario");
        
    var senha = document.getElementById("senha");
    var senha1 = document.getElementById("senha1");
    
    if(senha.valueOf(senha1)){
    
          var xmlhttp;
          
            if (window.XMLHttpRequest)
            {
                xmlhttp = new XMLHttpRequest();
            }
            else
            {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
           
        xmlhttp.open("POST", "/SistemaDeGestaoMoa/CadastroDeUsuario", false);
//           xmlhttp.open("GET", "/SistemaDeGestaoMoa/DefinicaoDeSessionArquivo?idDaFoto="+,false);
//           xmlhttp.setRequestHeader("Content-Type", "multipart/form-data");
           
        xmlhttp.send();
        
        }else{
            alert("Confirme sua senha, digitando a mesma para os dois campos de senha!");
        }
        
    }
    
function enviarNomeDeImage()
{
    
    var xmlhttp;
            if (window.XMLHttpRequest)
            {
                xmlhttp = new XMLHttpRequest();
            }
            else
            {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
           xmlhttp.open("POST", "/SistemaDeGestaoMoa/DefinicaoDeSessionArquivo?idDaFoto="+document.getElementById("idDoArquivo").value, false);
            xmlhttp.send();
    
}