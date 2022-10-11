    $(document).ready(function () {

    $("#loginUsuarios").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });
    $("#Registro_usuarios").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });


});

function autenticarUsuario() {

    let username = $("#usuario").val();
    let contrasena = $("#clave").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            username: username,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#ingreso-mal").addClass("d-none");
                let username = parsedResult['username'];
                document.location.href = "home.html?username=" + username;
            } else {
                $("#ingreso-mal").removeClass("d-none");
            }
        }
    });
}
function registrarUsuario() {
    //let tipo_usuario = document..getElementsById("Tipo_Usuario").value();
    //let tipo_usuario = $("#Tipo_Usuario:checked").val();         // Captura de datos por inpur para almacenar en base de datos
    var tipo = document.getElementsByName('Tipo_Usuario');
    var tipo_usuario;
    for (var i = 0; i < tipo.length; i++) {
        if (tipo[i].checked) {
            tipo_usuario = tipo[i].value;
        }
    }
    let nombre = $("#nombre").val();
    let apellido = $("#apellido").val();
    let username = $("#username").val();
    let email = $("#correo").val();
    let contrasena = $("#clave1").val();
    let confirmacion_contrasena = $("#clave2").val();
    let telefono = $("#telefono").val();
    
    let saldo= 0;



    if (contrasena == confirmacion_contrasena) {
        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({
                username: username,
                contrasena: contrasena,
                email: email,
                
                nombre: nombre,
                apellido: apellido,
                
                telefono: telefono,
                tipo_usuario: tipo_usuario,
                
                saldo: saldo


            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#ingreso-mal").addClass("d-none");
                    let username = parsedResult['username'];
                    document.location.href = "login.html?username=" + username;
                } else {
                    $("#ingreso-mal").removeClass("d-none");
                    $("#ingreso-mal").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        $("#ingreso-malr").removeClass("d-none");
        $("#ingreso-mal").html("Las contraseñas no coinciden");
    }
}