/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Hola

//Manejamos el evento del boton cuyo id es guardar-pelicula

$("#guardar-pelicula").click(function () {
    alert("Probando el click del botón");
    
    $.ajax('insertar-pelicula',{
        type:'post',
        data:{
            titulo:$("#titulo").val(),
            sinopsis:$('#sinopsis').val()
        },
        dataType:'json',
        success:function(datos){
           $('#resultado').html(datos); 
        }
        
    });
});


