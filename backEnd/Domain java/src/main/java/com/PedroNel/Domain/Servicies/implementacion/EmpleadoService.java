package com.PedroNel.Domain.Servicies.implementacion;

import com.PedroNel.Domain.DTO.EmpleadoDTO1;
import com.PedroNel.Domain.DTO.EmpleadoDTO3;
import com.PedroNel.Domain.DTO.EmpleadoDTO4;
import com.PedroNel.Domain.DTO.EmpleadoDTO5;
import com.PedroNel.Domain.Entities.Empleado;
import com.PedroNel.Domain.Repository.EmpleadoRepository;
import com.PedroNel.Domain.Servicies.Interface.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService {

   @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public void insertarEmpleado(EmpleadoDTO1 empl) {

         int emailNumber=1;
        int id =empleadoRepository.lastIdEmpleado();
         String priNombre = empl.getPrimerNombre();
         String SecNombre = empl.getSegundoNombre();
         String priApellidos = empl.getPrimerApellido();
         String secApellido = empl.getSegundoApellido();
         String pais = empl.getPaisEmpleo();
         String tipoDoc =empl.getTipoIdentificacion();
         int nuDoc = empl.getNumeroDocumento();
        String fechaingreso = empl.getFechaIngerso();
         String areDpartamento =empl.getArea();
         String estado= empl.getEstado();
        String fechaRegistro = empl.getFechaRegistro();


        String usuarioEmail = this.generadorEmail(priNombre,priApellidos,pais);



        //crear objecto para la insercion

        Empleado emplIns = new Empleado();

        int idIns = empleadoRepository.lastIdEmpleado()+1;

        emplIns.setIdEmpleado(idIns);
        emplIns.setPrimerNombre(priNombre);
        emplIns.setSegundoNombre(SecNombre);
        emplIns.setPrimerApellido(priApellidos);
        emplIns.setSegundoApellido(secApellido);
        emplIns.setPaisEmpleo(pais);
        emplIns.setTipoIdentificacion(tipoDoc);
        emplIns.setNumeroDocumento(nuDoc);
        emplIns.setFechaIngerso(fechaingreso);
        emplIns.setArea(areDpartamento);
        emplIns.setEstado(estado);
        emplIns.setEmail(usuarioEmail);
        emplIns.setFechaRegistro(fechaRegistro);

        empleadoRepository.save(emplIns);



    }

    @Override
    public List<EmpleadoDTO3> ConsultaTabla() {
        return empleadoRepository.consultaEspecifica();
    }

    @Override
    public List<EmpleadoDTO5> ListaWiId() {
        return empleadoRepository.ListaConsultaEspecifica();
    }

    @Override
    public void actualizarEmpleado(EmpleadoDTO4 emplUp ,int id) {



        String priNom =emplUp.getPrimerNombre();

        String segNom= emplUp.getSegundoNombre();

        String priApell=emplUp.getPrimerApellido();

        String segApee= emplUp.getSegundoApellido();

        String pais =emplUp.getPaisEmpleo();

        String tipIde= emplUp.getTipoIdentificacion();

        int numerDoc =emplUp.getNumeroDocumento();

        String email = this.generadorEmail(priNom,priApell,pais);

        String fechaIngerso = emplUp.getFechaIngerso();

        String area = emplUp.getArea();

        String estado = emplUp.getEstado();

        String fechaUpd = emplUp.getFechaEdicion();

        // query de actualizar

        empleadoRepository.actualizacionEmpleado(id,priNom,segNom,priApell,segApee,pais,tipIde,numerDoc,
                email,fechaIngerso,area,estado,fechaUpd);



    }



    @Override
    public EmpleadoDTO3 consultaEmpleadoUpda(int id) {

        EmpleadoDTO3 empldt3 = new EmpleadoDTO3();

        empldt3 = empleadoRepository.consultaUpDa(id);

        return empldt3;
    }

    @Override
    public void eliminar(int id) {
        //empleadoRepository.eliminarCategoriabById(id);
        empleadoRepository.deleteById(id);
    }


    public String generadorEmail(String priNombre,String priApellidos,String pais){

        int emailNumber;

        // generar email

        String strPriNombre = priNombre.replaceAll("\\s+","");

        strPriNombre=strPriNombre.toLowerCase();

        String strPriApellidos = priApellidos.replaceAll("\\s+","");

        strPriApellidos= strPriApellidos.toLowerCase();

        String usuarioNomEmail = strPriNombre+"."+strPriApellidos;

        String dominioUrl;

        // definicion del dominio

        if(pais.equals("Colombia")){
            dominioUrl="cidenet.com.co";
        }else{
            dominioUrl="cidenet.com.us";
        }

        //definir numero URL


        int cantReptida = empleadoRepository.consultaCantRep(usuarioNomEmail+"%");

        if(cantReptida>=1){
            emailNumber=++cantReptida;
        }else{
            emailNumber=1;
        }

        // crear el email del usuario

        String usuarioEmail= usuarioNomEmail+"."+emailNumber+"@"+dominioUrl;
        return usuarioEmail;
    }


}
