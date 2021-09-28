package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Proyecto;

public class CalificacionProyectoEvaluacionCalculada extends DomainEvent {
    private Proyecto proyecto;
    private Calificacion calificacion;

    public CalificacionProyectoEvaluacionCalculada(Proyecto proyecto, Calificacion calificacion) {
        super("sofkaU.onlineplatform.profesor.calificacionproyectoevaluacioncalculada");
        this.proyecto = proyecto;
        this.calificacion = calificacion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
