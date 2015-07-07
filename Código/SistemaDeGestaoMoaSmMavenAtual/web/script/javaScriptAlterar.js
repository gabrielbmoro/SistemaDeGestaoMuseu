/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function auxiliadorAlterar(element) {
    document.getElementById("idAlterar").value = element.value;
    
}

function Alterar(){
   // enviarNomeDeImage();
    enviarIDAlterar();
    var formulario = document.getElementById("formularioAlterar");
    
    
var xmlhttp;
            if (window.XMLHttpRequest)
            {
                xmlhttp = new XMLHttpRequest();
            }
            else
            {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
           xmlhttp.open("POST", "/SistemaDeGestaoMoa/AlterarLivroTombo", false);
//           xmlhttp.open("GET", "/SistemaDeGestaoMoa/DefinicaoDeSessionArquivo?idDaFoto="+,false);
//           xmlhttp.setRequestHeader("Content-Type", "multipart/form-data");
            xmlhttp.send();
        
    }
    
function enviarIDAlterar()
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
           xmlhttp.open("POST", "/SistemaDeGestaoMoa/DefinicaoDeSessionArquivo?ID="+document.getElementById("idAlterar").value, false);
            xmlhttp.send();
    
}