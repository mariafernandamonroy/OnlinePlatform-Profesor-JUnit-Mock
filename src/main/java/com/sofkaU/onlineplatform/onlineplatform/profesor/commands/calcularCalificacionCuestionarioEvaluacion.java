package com.sofkaU.onlineplatform.onlineplatform.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

public class calcularCalificacionCuestionarioEvaluacion extends Command {
    private final ProfesorId profesorId;
    private final Cuestionario cuestionario;
    private final Calificacion calificacion;

    public calcularCalificacionCuestionarioEvaluacion(ProfesorId profesorId, Cuestionario cuestionario, Calificacion calificacion){

        this.profesorId = profesorId;
        this.cuestionario = cuestionario;
        this.calificacion = calificacion;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
