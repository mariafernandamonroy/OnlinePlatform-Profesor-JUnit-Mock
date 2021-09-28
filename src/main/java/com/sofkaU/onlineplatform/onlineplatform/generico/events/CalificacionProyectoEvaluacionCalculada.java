package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Proyecto;

public class CalificacionProyectoEvaluacionCalculada extends DomainEvent {
    private EvaluacionId evaluacionId;
    private Proyecto proyecto;
    private Calificacion calificacion;

    public CalificacionProyectoEvaluacionCalculada(EvaluacionId evaluacionId, Proyecto proyecto, Calificacion calificacion) {
        super("sofkaU.onlineplatform.profesor.calificacionproyectoevaluacioncalculada");
        this.evaluacionId = evaluacionId;
        this.proyecto = proyecto;
        this.calificacion = calificacion;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
