package com.PedroNel.Domain.Servicies.Interface;

import com.PedroNel.Domain.DTO.EmpleadoDTO1;
import com.PedroNel.Domain.DTO.EmpleadoDTO3;
import com.PedroNel.Domain.DTO.EmpleadoDTO4;
import com.PedroNel.Domain.DTO.EmpleadoDTO5;

import java.util.List;

public interface IEmpleadoService {

    public void insertarEmpleado(EmpleadoDTO1 empl);

    public List<EmpleadoDTO3> ConsultaTabla();

    public List<EmpleadoDTO5>ListaWiId();

    public void actualizarEmpleado(EmpleadoDTO4 emplUp,int id);



    public EmpleadoDTO3 consultaEmpleadoUpda(int id);

    public void eliminar(int id);
}
