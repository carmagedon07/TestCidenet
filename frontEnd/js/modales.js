$(document).ready(function() {

    console.log("hola, soy modal");



      $('#addEmpleadoModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        //var modal = $(this)
        //modal.find('.modal-title').text('New message to ' + recipient)
        //modal.find('.modal-body input').val(recipient)
        
        
        
        
        console.log(recipient);
       

        $("#addEmpleadoModal").submit(function(){
            var PriNombre=$("#add_priNombre").val();
            var segNombre=$("#add_SegNombre").val();
            var priApellidos=$("#add_pApellidos").val();
            var segApellidos=$("#add_sApellidos").val();
            var tipoDoc=$("#add_tipoIden").val();
            var numDoc=$("#add_Numero").val();
            var area=$("#add_area").val();
            var fechaIn=$("#datepickerAdd").val(); 
            var Estado=$("#add_estado").val();
            var fechaRes=moment().format('L');
            var pai=$("#add_Pais").val();

            var empleado =
            {
                primerNombre:PriNombre,
                segundoNombre:segNombre,
                primerApellido:priApellidos,
                segundoApellido:segApellidos,
                paisEmpleo:pai,                
                tipoIdentificacion:numDoc,
                numeroDocumento:fechaIn, 
                estado:Estado,
                fechaIngerso:fechaIn,
                fechaRegistro:fechaRes
            };

            /*$.post("http://localhost:9898/api/empleado",empleado,function(response){
                console.log(response);
                alert("entro");
            })*/

            $.ajax({
                type:'POST',
                contentType:"application/json",
                dataType: "json",
                data:JSON.stringify(empleado),
                success:function(){
                    alert("se registro un empleado");
                },
            })
        });
        

      });

      $('#editEmpleadoModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') 
        SVGAElement.get
     
        var PriNombre;
            var segNombre;
            var priApellidos;
            var segApellidos;
            var tipoDoc;
            var numDoc;
            var pai
            var fechaIn;           
            var area;
            var estado;
            var area;
        var fechaPd;
       

        $.get("http://localhost:9898/api/empleado/"+recipient,function(response){
            console.log(response);
      

             var editarModal =document.getElementById('editEmpleadoModal');

             var editarModalPnombre = editarModal.querySelector('up_priNombre');
             editarModalPnombre=response.primerNombre;

             var editarModalPsenombre = editarModal.querySelector('up_Seganombre');
             editarModalPnombre=response.segundoNombre;

             var editarModalpApellidos = editarModal.querySelector('up_pApellidos');
             editarModalpApellidos=response.primerApellido;

             var editarModalsApellidos = editarModal.querySelector('up_sApellidos');
             editarModalpApellidos=response.segundoApellido;

             var editarModalpai = editarModal.querySelector('up_Pais');
             editarModalpai=response.paisEmpleo;

             var editarModalNumero = editarModal.querySelector('up_Numero');
             editarModalNumero=response.numeroDocumento;

             var editarModalTipoId = editarModal.querySelector('up_tipoIden');
             editarModalTipoId=response.tipoIdentificacion;

             var editarModalFechIn = editarModal.querySelector('datepickerUp');
             editarModalFechIn=response.tipoIdentificacion;

             var editarModalEstado = editarModal.querySelector('up_estado');
             editarModalFechIn=response.estado;

             fechaPd =moment().format('L');


             PriNombre=$("#up_priNombre").val();
             segNombre=$("#up_SegNombre").val();
             priApellidos=$("#up_pApellidos").val();
             segApellidos=$("#up_sApellidos").val();
             tipoDoc=$("#up_tipoIden").val();
             numDoc=$("#up_Numero").val();
             pai=$("#up_Pais").val();
             fechaIn=$("#datepickerUp").val();            
             estado=$("#up_estado").val();
             area=$("#up_area").val();
        })

        
        
        $.ajax({
            processing: true,
            url: "https://fakestoreapi.com/products/"+recipient, 
        type:'GET',
        dataType: "json",
        success: function(data){
            console.log(data);
        }   
        })
      });

      $('#deleteEmpleadoModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        //var modal = $(this)
        //modal.find('.modal-title').text('New message to ' + recipient)
        //modal.find('.modal-body input').val(recipient)
        var fecha=moment().format('L');
        console.log(recipient);
        console.log(fecha);
        
        $.ajax({
            processing: true,
            url: "https://fakestoreapi.com/products/"+recipient, 
        type:'GET',
        dataType: "json",
        success: function(data){
            console.log(data);
        }   
        })
      });
} );