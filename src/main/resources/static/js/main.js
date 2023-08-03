//Botones filtro
$('.boton-consola').click(function() {

    $('.boton-consola').removeClass('active');
    $(this).addClass('active');


});


//Datatable
    $(document).ready(function () {
        $('#tabla').DataTable({
            "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.15/i18n/Spanish.json"
            },

            "pageLength": 25

        });


    });





