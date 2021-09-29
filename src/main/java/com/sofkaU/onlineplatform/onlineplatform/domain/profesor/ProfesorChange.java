package com.sofkaU.onlineplatform.onlineplatform.domain.profesor;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events.*;

import java.util.ArrayList;
import java.util.List;

public class ProfesorChange extends EventChange {
    public ProfesorChange(Profesor profesor) {

        apply((ProfesorCreado event) -> {
            profesor.nombreCompleto = event.getNombreCompleto();
        });

        apply((NombreCompletoActualizado event) -> {
            profesor.nombreCompleto = event.getNombreCompleto();
        });

        apply((CorreoElectronicoActualizado event) -> {
            profesor.correoElectronico = event.getCorreoElectronico();
        });

        apply((FormacionAcademicaActualizada event) -> {
            profesor.formacionAcademica = event.getFormacionAcademica();
        });

        apply((CursoAProfesorAsignado event) -> {
            List<CursoId> cursoIds = new ArrayList<>();
            cursoIds.add(event.getCursoId());
            profesor.cursoIds = cursoIds;
        });

        apply((PreguntaAEstudianteRespondida event) -> {
            List<EstudianteId> estudianteIds = new ArrayList<>();
            estudianteIds.add(event.getEstudianteId());
            profesor.estudianteIds = estudianteIds;
        });

        apply((EvaluacionAgregada event) -> {
            profesor.evaluacion = new Evaluacion(
                    event.getEvaluacionId(),
                    event.getCuestionario(),
                    event.getProyecto(),
                    event.getCalificacion()
            );
        });

        apply((CuestionarioEvaluacionEditado event) -> {
            profesor.editarCuestionarioEvaluacion(event.getCuestionario());
        });

        apply((ProyectoEvaluacionEditado event) -> {
            profesor.editarProyectoEvaluacion(event.getProyecto());
        });

        apply((CalificacionCuestionarioEvaluacionCalculada event) -> {
            profesor.calcularCalificacionCuestionarioEvaluacion(event.getCuestionario(), event.getCalificacion());
        });

        apply((CalificacionProyectoEvaluacionCalculada event) -> {
            profesor.calcularProyectoCuestionarioEvaluacion(event.getProyecto(), event.getCalificacion());
        });

        apply((AsesoriaAgregada event) -> {
            profesor.asesoria = new Asesoria(
                    event.getAsesoriaId(),
                    event.getDuracion(),
                    event.getFecha(),
                    event.getTema()
            );
        });

        apply((DuracionAsesoriaAsignada event) -> {
            profesor.asignarDuracionAsesoria(event.getDuracion());
        });

        apply((FechaAsesoriaAsignada event) -> {
            profesor.asignarFechaAsesoria(event.getFecha());
        });

        apply((TemaAsesoriaAsignado event) -> {
            profesor.asignarTemaAsesoria(event.getTema());
        });
    }
}
