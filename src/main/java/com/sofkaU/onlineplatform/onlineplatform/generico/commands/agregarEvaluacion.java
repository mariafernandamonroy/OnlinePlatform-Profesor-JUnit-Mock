package com.sofkaU.onlineplatform.onlineplatform.generico.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.*;

public class agregarEvaluacion extends Command {
    private final ProfesorId profesorId;
    private final EvaluacionId evaluacionId;
    private final Cuestionario cuestionario;
    private final Proyecto proyecto;
    private final Calificacion calificacion;

    public agregarEvaluacion(ProfesorId profesorId, EvaluacionId evaluacionId, Cuestionario cuestionario, Proyecto proyecto, Calificacion calificacion) {

        this.profesorId = profesorId;
        this.evaluacionId = evaluacionId;
        this.cuestionario = cuestionario;
        this.proyecto = proyecto;
        this.calificacion = calificacion;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
