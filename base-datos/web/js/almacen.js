
//Manejamos el clickeo del boton cuyo id es "guardar_almacen"

$("#guardar_almacen").click(function () {

    //activamos ajax
    $.ajax('guardar-almacen', {
        type: 'post',
        dataType:'json',
        data: {
            numero_almacen: $("#numero_almacen").val(),
            ubicacion_almacen: $("#ubicacion_almacen").val()
        },
        success: function (datos) {
       
         $("#resultado_guardar").html(datos.mensaje);
            
        }
    })

})
