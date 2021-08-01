package com.PedroNel.Domain.Controller;

import com.PedroNel.Domain.DTO.EmpleadoDTO1;
import com.PedroNel.Domain.DTO.EmpleadoDTO3;
import com.PedroNel.Domain.DTO.EmpleadoDTO4;
import com.PedroNel.Domain.DTO.EmpleadoDTO5;
import com.PedroNel.Domain.Servicies.Interface.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class EmpleadoController {


    /*@Autowired
    EmpleadoRepository empleadoRepository;*/

    @Autowired
    IEmpleadoService iEmpleadoService;

    //get
    @CrossOrigin(origins = "*")
    @GetMapping( value="/empleado")
    public List<EmpleadoDTO5> consulta(){
       return iEmpleadoService.ListaWiId();
    }

    @GetMapping(value ="/empleado/{id}",produces = {MediaType.APPLICATION_JSON_VALUE} )
    public EmpleadoDTO3 empleadoConsulta(@PathVariable int id){
        return iEmpleadoService.consultaEmpleadoUpda(id);
    }



    //post
    @CrossOrigin(origins = "*")
    @PostMapping(value="/empleado")
    public void insEmpleado(@RequestBody EmpleadoDTO1 empl){
        iEmpleadoService.insertarEmpleado(empl);
    }

    // put



    @CrossOrigin(origins = "*")
    @PutMapping(value="/empleado/{id}",
    consumes={MediaType.APPLICATION_JSON_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
    public String actualizar(@PathVariable int id,@RequestBody EmpleadoDTO4 empl){

        iEmpleadoService.actualizarEmpleado(empl,id);
        return "hola"+id;


    }
//Delete
    @CrossOrigin(origins = "*")
    @DeleteMapping(value="/empleado/{id}")
    void eliminarEmpleado(@PathVariable int id){
        iEmpleadoService.eliminar(id);
    }
}
