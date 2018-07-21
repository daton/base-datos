

$("#guardar-pelicula").click(function () {
    //alert("Probando el click del botón");
    //activamos ajax
    console.log("El titulo es" + $('#titulo').val())
    $.ajax('insertar-pelicula', {
        type: 'post',

        data: {
            titulo: $("#titulo").val(),
            sinopsis: $('#sinopsis').val()
        },

        success: function (datos) {
            $("#resultado").html(datos.mensaje);
            console.log(datos.mensaje);
        }

    });
});
/*
 *  borrar pelicula
 */
$("#borrarPelicula").click(function () {
   console.log("valor de id "+$("#id-pelicula").val());
    $.ajax('borrar-pelicula', {
        type: 'delete',
        dataType:'json',
        data: {
         idmalo: $("#id-pelicula").val()

        },

        success: function (estatus) {
         alert(estatus.mensaje)
        }

    });
});
/*
 * hacemos una llamada a AJAX  para buscar las peliculas
 */

$.ajax('buscar-peliculas', {
     type:'get',
     dataType:'json',
     success:function(datos){
         for(i=0;i<datos.length;i++){
             $("#tablita").append('<tr><td>'+datos[i].id+'</td><td>'+
                     datos[i].titulo+'</td><td>'+datos[i].sinopsis+'</td></tr>')
         }
     }
    }
);
