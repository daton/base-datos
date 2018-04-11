

//alert("primer apliccion con ajax");
console.log("Para depurar el gooogle chrome");

//El principio de ajax!!!!

//Programamos el evento de boton ingrear


$("#ingresar").click(function(){
  //  $("#respuesta").html("Haz oprimido eñ boton!!!");
   // $("#ingresar").hide();
   //Primero invocamos a ajax
   
   $.ajax('autenticate-tonto',{
       type:'post',
       data:{
           usuario:$("#usuario").val(),
           password:$("#password").val()
       },
       success:function(gato){
           $("#respuesta").html(gato);
         $("#bienvenido").show();
         $("#ingresar").hide();
       
       }
   })
   
})

$("#respuesta").click(function(){
 //   $("#ingresar").show();
})

