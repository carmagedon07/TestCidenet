package com.PedroNel.Domain.Repository;

import com.PedroNel.Domain.DTO.EmpleadoDTO3;
import com.PedroNel.Domain.DTO.EmpleadoDTO5;
import com.PedroNel.Domain.Entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer > {

// insert

    //--Query incremento id

    @Query(value = "SELECT * FROM empleado\n" +
            "            ORDER BY id_empleado DESC\n" +
            "            offset 0 limit 1",nativeQuery = true)
    public int lastIdEmpleado();

    //- Query validacion de existencia de correo

    @Query(value = "select count(*)\n" +
            "  from empleado\n" +
            "  where id_empleado= :idEmpleado",nativeQuery = true)
    public int  contadorById(@Param("idEmpleado")int idEmpleado);

    // el metodo que se utiliza para insert  es del framework (save)

//query

    // por documento
    @Query(value = "SELECT * FROM empleado WHERE numero_documento = :numeroDocumento and tipo_identificacion= :tipoIdentificacion"
            , nativeQuery = true)
    Empleado encontrarPorNumeroTipoEmailAddress(int numeroDocumento,String tipoIdentificacion);

    // global

    @Query("SELECT new com.PedroNel.Domain.DTO.EmpleadoDTO3(e.primerNombre,e.segundoApellido,e.primerApellido," +
            "e.segundoApellido,e.paisEmpleo,e.tipoIdentificacion,e.numeroDocumento,e.email,e.estado,e.fechaIngerso)" +
            " FROM Empleado e ORDER BY e.idEmpleado ASC ")
      List<EmpleadoDTO3> consultaEspecifica();

    @Query("SELECT new com.PedroNel.Domain.DTO.EmpleadoDTO5(e.idEmpleado,e.primerNombre,e.segundoApellido,e.primerApellido," +
            "e.segundoApellido,e.paisEmpleo,e.tipoIdentificacion,e.numeroDocumento,e.email,e.estado,e.fechaIngerso)" +
            " FROM Empleado e ORDER BY e.idEmpleado ASC ")
    List<EmpleadoDTO5> ListaConsultaEspecifica();

    // consulta para contar email identicos

    @Query(value = " SELECT COUNT(email) FROM empleado WHERE email LIKE %:strEmail"//LIKE 'Ped%'
            , nativeQuery = true)
    int consultaCantRep(@Param("strEmail")String strEmail);

    // Consulta de un empleado



    @Query("SELECT new com.PedroNel.Domain.DTO.EmpleadoDTO3(e.primerNombre,e.segundoApellido,e.primerApellido," +
            "e.segundoApellido,e.paisEmpleo,e.tipoIdentificacion,e.numeroDocumento,e.email,e.estado,e.fechaIngerso)" +
            " FROM Empleado e WHERE e.idEmpleado=:idEmpleado ")
    EmpleadoDTO3 consultaUpDa(@Param("idEmpleado")int idEmpleado);



// update

    @Modifying
    @Transactional
    @Query(value = "UPDATE empleado\n" +
            "\tSET email=:email, estado=:estado, " +
            "fecha_ingerso=:fechaIngerso, number_doc=:numberDoc,pais_empleo=:paisEmpleo, " +
            "primer_apellido=:primerApellido, segundo_apellido=:segundoApellido, segundo_nombre=:segundoNombre,primer_nombre=:primerNombre," +
            "fecha_Edicion=:fechaUltimaEdicion ,area_departamento=:areaDepartamento," +
            "tipo_identificacion=:tipoIdentificacion WHERE id_empleado = :idEmpleado",nativeQuery = true)
    public void actualizacionEmpleado(@Param("idEmpleado")int idEmpleado,
                                      @Param("primerNombre")String primerNombre,
                                      @Param("segundoNombre")String segundoNombre,
                                      @Param("primerApellido")String primerApellido,
                                      @Param("segundoApellido")String segundoApellido,
                                      @Param("paisEmpleo")String paisEmpleo,
                                      @Param("tipoIdentificacion")String tipoIdentificacion,
                                      @Param("numberDoc")int numberDoc,
                                      @Param("email")String email,
                                      @Param("fechaIngerso") String fechaIngerso,
                                      @Param("areaDepartamento")String areaDepartamento,
                                      @Param("estado")String estado,
                                      @Param("fechaUltimaEdicion") String fechaUltimaEdicion
                                      );

// delete
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM \n" +
            "\tWHERE id_empleado=:idEmpleado",nativeQuery = true)
    public void eliminarCategoriabById(@Param("idEmpleado")int idEmpleado);






}
