$(document).ready(function() {
    /*$('#example').DataTable( {
        "processing": true,
        "serverSide": true,
        "ajax": {
			"processing": true,
			"serverSide": true,
            "url": "https://fakestoreapi.com/products",
			"type": "GET",
			"dataType": "jsonp",
			"success":'function(result){console.log(result);}});'
            

			
        },
        
    } );*/

	$.ajax({
		searching:false,
		autoWidth:true,
		processing: true,
		"start": 0,
		url: "http://localhost:9898/api/empleado", 
	type:'GET',
	dataType: "json",
	//success: function(result){
      //console.log(result);
	success: function(data){
		var table =$('#example').DataTable( {
			"language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.11/i18n/Spanish.json"
            },
			data:data,
			columns:[
				
				{'data':'id'},
				{'data':'primerNombre'},
				{'data':'segundoNombre'},
				{'data':'primerApellido'},
				{'data':'segundoApellido'},
				{'data':'paisEmpleo'},
				{'data':'tipoIdentificacion'},
				{'data':'numeroDocumento'},
				{'data':'email'},
				{'data':'estado'},
				{'data':'fechaIngerso'},
				{'data': null, title: 'Action', wrap: true, 
				"render": function (item) { return `
				<a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons"  title="Editar" data-toggle="modal" data-target="#editEmpleadoModal" data-whatever="${item.id}">&#xE254;</i></a> <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons"  title="Eliminar"data-toggle="modal" data-target="#deleteEmpleadoModal" data-whatever="${item.id}">&#xE872;</i></a>`  } }
				,
				
				]
				

		});

		var column = table.column( $(this).attr(0) );
		column.visible( ! column.visible() );
    }});

	$( function() {
		$( "#datepickerAdd" ).datepicker(
			{}
		);
		$( "#datepickerUp" ).datepicker(
			{}
		);
	  } );
} );