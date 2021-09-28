package com.sofkaU.onlineplatform.onlineplatform.profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;
import com.sofkaU.onlineplatform.onlineplatform.generico.events.*;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.NombreCompleto;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Profesor extends AggregateEvent<ProfesorId> {

    protected NombreCompleto nombreCompleto;
    protected CorreoElectronico correoElectronico;
    protected FormacionAcademica formacionAcademica;
    protected List<CursoId> cursoIds;
    protected List<EstudianteId> estudianteIds;
    protected Evaluacion evaluacion;
    protected Asesoria asesoria;

    public Profesor(ProfesorId profesorId, NombreCompleto nombreCompleto, CorreoElectronico correoElectronico) {
        super(profesorId);
        appendChange(new ProfesorCreado(nombreCompleto)).apply();
    }

    public void actualizarNombrecompleto(NombreCompleto nombreCompleto){
        appendChange(new NombreCompletoActualizado(nombreCompleto)).apply();
    }

    public void correoElectronicoActualizado(CorreoElectronico correoElectronico){
        appendChange(new CorreoElectronicoActualizado(correoElectronico)).apply();
    }

    public void formacionAcademicaActualizada(FormacionAcademica formacionAcademica){
        appendChange(new FormacionAcademicaActualizada(formacionAcademica)).apply();
    }

    public void asignarCursoAPrfesor(){

    }

    public void respoderPreguntaAEstudiante(){

    }

    public void agregarEvaluacion(EvaluacionId evaluacionId, Cuestionario cuestionario, Proyecto proyecto, Calificacion calificacion){
        Objects.requireNonNull(evaluacionId);
        Objects.requireNonNull(cuestionario);
        Objects.requireNonNull(proyecto);
        Objects.requireNonNull(calificacion);
        appendChange(new EvaluacionAgregada(evaluacionId,cuestionario,proyecto,calificacion)).apply();
    }

    public void editarCuestionarioEvaluacion(EvaluacionId evaluacionId, Cuestionario cuestionario){
        appendChange(new CuestionarioEvaluacionEditado(evaluacionId,cuestionario)).apply();
    }

    public void editarProyectoEvaluacion(EvaluacionId evaluacionId, Cuestionario cuestionario){
        appendChange(new ProyectoEvaluacionEditado(evaluacionId,cuestionario)).apply();
    }

    public void calcularCalificacionCuestionarioEvaluacion(EvaluacionId evaluacionId, Cuestionario cuestionario, Calificacion calificacion){
        appendChange(new CalificacionCuestionarioEvaluacionCalculada(evaluacionId,cuestionario,calificacion)).apply();
    }

    public void calcularProyectoCuestionarioEvaluacion(EvaluacionId evaluacionId, Proyecto proyecto, Calificacion calificacion){
        appendChange(new CalificacionProyectoEvaluacionCalculada(evaluacionId,proyecto,calificacion)).apply();
    }

    public void agregarAsesoria(AsesoriaId asesoriaId, Time duracion, Date fecha, String tema){
        Objects.requireNonNull(asesoriaId);
        Objects.requireNonNull(duracion);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(tema);
        appendChange(new AsesoriaAgregada(asesoriaId,duracion,fecha,tema)).apply();
    }

    public void asignarDuracionAsesoria(AsesoriaId asesoriaId, Time duracion){
        appendChange(new DuracionAsesoriaAsignada(asesoriaId,duracion)).apply();
    }

    public void asignarFechaAsesoria(AsesoriaId asesoriaId, Date fecha){
        appendChange(new FechaAsesoriaAsignada(asesoriaId,fecha)).apply();
    }

    public void asignarTemaAsesoria(AsesoriaId asesoriaId, String tema){
        appendChange(new FechaTemaAsignada(asesoriaId,tema)).apply();
    }

    public NombreCompleto nombreCompleto() {
        return nombreCompleto;
    }

    public CorreoElectronico correoElectronico() {
        return correoElectronico;
    }

    public FormacionAcademica formacionAcademica() {
        return formacionAcademica;
    }

    public List<CursoId> cursoIds() {
        return cursoIds;
    }

    public List<EstudianteId> estudianteIds() {
        return estudianteIds;
    }

    public Evaluacion evaluacion() {
        return evaluacion;
    }

    public Asesoria asesoria() {
        return asesoria;
    }
}
