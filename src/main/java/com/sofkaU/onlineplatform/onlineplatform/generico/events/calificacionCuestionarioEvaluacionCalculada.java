package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;

public class calificacionCuestionarioEvaluacionCalculada extends DomainEvent {
    private EvaluacionId evaluacionId;
    private Cuestionario cuestionario;
    private Calificacion calificacion;

    public calificacionCuestionarioEvaluacionCalculada(EvaluacionId evaluacionId, Cuestionario cuestionario, Calificacion calificacion) {
        super("sofkaU.onlineplatform.profesor.calificacioncuestionarioevaluacioncalculada");
        this.evaluacionId = evaluacionId;
        this.cuestionario = cuestionario;
        this.calificacion = calificacion;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
