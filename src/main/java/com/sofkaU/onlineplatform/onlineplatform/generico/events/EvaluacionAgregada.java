package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Proyecto;

public class EvaluacionAgregada extends DomainEvent {
    private final EvaluacionId evaluacionId;
    private final Cuestionario cuestionario;
    private final Proyecto proyecto;
    private final Calificacion calificacion;

    public EvaluacionAgregada(EvaluacionId evaluacionId, Cuestionario cuestionario, Proyecto proyecto, Calificacion calificacion) {
        super("sofkaU.onlineplatform.profesor.evaluacioncreada");
        this.evaluacionId = evaluacionId;
        this.cuestionario = cuestionario;
        this.proyecto = proyecto;
        this.calificacion = calificacion;
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
