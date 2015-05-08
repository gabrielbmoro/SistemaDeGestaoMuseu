/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function trataSubmissaoDeFormulario(){
   var formulario = document.getElementById("cadastroDeItem");


    var xmlhttp;
    if (window.XMLHttpRequest)
    {
        xmlhttp = new XMLHttpRequest();
    }
    else
    {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("POST", "/SistemaDeGestaoMoa/CadastroLivroTombo", true);
//           xmlhttp.open("GET", "/SistemaDeGestaoMoa/DefinicaoDeSessionArquivo?idDaFoto="+,false);
//           xmlhttp.setRequestHeader("Content-Type", "multipart/form-data");
    xmlhttp.send();
    var resp = xmlhttp.response();
    if(resp!=null)
    {
        document.getElementById("idDaImagemDeModal").value=resp;
        $('#myModal').modal(show)
    }
}