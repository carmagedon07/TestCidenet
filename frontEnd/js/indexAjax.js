

$(document).ready(function () {

  
  var id;
  
  //load
  $.get("http://127.0.0.1:9898/api/empleado", { page: 1 }, function (response) {
    console.log(response);
    response.forEach((element, index) => {
      id=element.id;
      //console.log('<a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" data-id='+'"'+id+'"'+' title="Edit">&#xE254;</i></a>');
      $("#datos").append(
        `
        <tr>
          <td>${element.primerNombre}</td>
          <td>${element.segundoNombre}</td>
          <td>${element.primerApellido}</td>
          <td>${element.segundoApellido}</td>
          <td>${element.paisEmpleo}</td>
          <td>${element.tipoIdentificacion}</td>
          <td>${element.numeroDocumento}</td>
          <td>${element.email}</td>
          <td>${element.estado}</td>
          <td>${element.fechaIngerso}</td>

        <td>
          <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
          <a href="#DeletModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
        </td>
        </tr>
        `
      );
    });

  });



});
