/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function auxiliadorDeRegistroDeImagem(element) {
    document.getElementById("idDoArquivo").value = element.value;
}

function enviarFormularioDeArquivo(){
    enviarNomeDeImage();
    
    var formulario = document.getElementById("formularioDeImage");
    
    
var xmlhttp;
            if (window.XMLHttpRequest)
            {
                xmlhttp = new XMLHttpRequest();
            }
            else
            {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
           xmlhttp.open("POST", "/SistemaDeGestaoMoa/TrataUploadDeImagem", false);
//           xmlhttp.open("GET", "/SistemaDeGestaoMoa/DefinicaoDeSessionArquivo?idDaFoto="+,false);
//           xmlhttp.setRequestHeader("Content-Type", "multipart/form-data");
            xmlhttp.send();
        
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