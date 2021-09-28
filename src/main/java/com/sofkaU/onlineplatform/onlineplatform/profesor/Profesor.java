package com.sofkaU.onlineplatform.onlineplatform.profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.events.*;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.NombreCompleto;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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

    private Profesor(ProfesorId profesorId){
        super(profesorId);
        subscribe(new ProfesorChange(this));
    }

    public static Profesor from(ProfesorId profesorId, List<DomainEvent> events){
        var profesor = new Profesor(profesorId);
        events.forEach(profesor::applyEvent);
        return profesor;
    }

    public void actualizarNombrecompleto(NombreCompleto nombreCompleto){
        appendChange(new NombreCompletoActualizado(nombreCompleto)).apply();
    }

    public void actualizarCorreoElectronico(CorreoElectronico correoElectronico){
        appendChange(new CorreoElectronicoActualizado(correoElectronico)).apply();
    }

    public void actualizarFormacionAcademica(FormacionAcademica formacionAcademica){
        appendChange(new FormacionAcademicaActualizada(formacionAcademica)).apply();
    }

    public void asignarCursoAProfesor(CursoId cursoId){
        appendChange(new CursoAProfesorAsignado(cursoId)).apply();
    }

    public void respoderPreguntaAEstudiante(EstudianteId estudianteId){
        appendChange(new PreguntaAEstudianteRespondida(estudianteId)).apply();
    }

    public void agregarEvaluacion(EvaluacionId evaluacionId, Cuestionario cuestionario, Proyecto proyecto, Calificacion calificacion){
        Objects.requireNonNull(evaluacionId);
        Objects.requireNonNull(cuestionario);
        Objects.requireNonNull(proyecto);
        Objects.requireNonNull(calificacion);
        appendChange(new EvaluacionAgregada(evaluacionId,cuestionario,proyecto,calificacion)).apply();
    }

    public void editarCuestionarioEvaluacion(Cuestionario cuestionario){
        appendChange(new CuestionarioEvaluacionEditado(cuestionario)).apply();
    }

    public void editarProyectoEvaluacion(Proyecto proyecto){
        appendChange(new ProyectoEvaluacionEditado(proyecto)).apply();
    }

    public void calcularCalificacionCuestionarioEvaluacion(Cuestionario cuestionario, Calificacion calificacion){
        appendChange(new CalificacionCuestionarioEvaluacionCalculada(cuestionario,calificacion)).apply();
    }

    public void calcularProyectoCuestionarioEvaluacion(Proyecto proyecto, Calificacion calificacion){
        appendChange(new CalificacionProyectoEvaluacionCalculada(proyecto,calificacion)).apply();
    }

    public void agregarAsesoria(AsesoriaId asesoriaId, Time duracion, Date fecha, String tema){
        Objects.requireNonNull(asesoriaId);
        Objects.requireNonNull(duracion);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(tema);
        appendChange(new AsesoriaAgregada(asesoriaId,duracion,fecha,tema)).apply();
    }

    public void asignarDuracionAsesoria(Time duracion){
        appendChange(new DuracionAsesoriaAsignada(duracion)).apply();
    }

    public void asignarFechaAsesoria(Date fecha){
        appendChange(new FechaAsesoriaAsignada(fecha)).apply();
    }

    public void asignarTemaAsesoria(String tema){
        appendChange(new TemaAsesoriaAsignado(tema)).apply();
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
