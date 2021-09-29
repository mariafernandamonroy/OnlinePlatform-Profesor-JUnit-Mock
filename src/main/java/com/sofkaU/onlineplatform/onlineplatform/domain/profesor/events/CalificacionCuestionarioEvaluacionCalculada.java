package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.Cuestionario;

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
