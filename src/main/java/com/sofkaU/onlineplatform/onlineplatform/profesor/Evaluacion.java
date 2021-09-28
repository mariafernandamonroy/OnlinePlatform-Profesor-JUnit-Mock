package com.sofkaU.onlineplatform.onlineplatform.profesor;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Proyecto;

public class Evaluacion extends Entity<EvaluacionId> {

    private final Cuestionario cuestionario;
    private final Proyecto proyecto;
    private final Calificacion calificacion;

    public Evaluacion(EvaluacionId evaluacionId, Cuestionario cuestionario, Proyecto proyecto, Calificacion calificacion){
        super(evaluacionId);
        this.cuestionario = cuestionario;
        this.calificacion = calificacion;
        this.proyecto = proyecto;
    }

    public Cuestionario cuestionario() {
        return cuestionario;
    }

    public Proyecto proyecto() {
        return proyecto;
    }

    public Calificacion calificacion() {
        return calificacion;
    }
}
