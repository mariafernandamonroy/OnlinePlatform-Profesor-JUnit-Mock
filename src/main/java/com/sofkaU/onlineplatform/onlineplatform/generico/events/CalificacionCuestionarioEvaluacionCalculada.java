package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;

public class CalificacionCuestionarioEvaluacionCalculada extends DomainEvent {
    private Cuestionario cuestionario;
    private Calificacion calificacion;

    public CalificacionCuestionarioEvaluacionCalculada(Cuestionario cuestionario, Calificacion calificacion) {
        super("sofkaU.onlineplatform.profesor.calificacioncuestionarioevaluacioncalculada");
        this.cuestionario = cuestionario;
        this.calificacion = calificacion;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
