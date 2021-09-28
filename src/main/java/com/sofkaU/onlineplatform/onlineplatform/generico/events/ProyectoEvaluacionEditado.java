package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;

public class ProyectoEvaluacionEditado extends DomainEvent {
    private Cuestionario cuestionario;

    public ProyectoEvaluacionEditado(Cuestionario cuestionario) {
        super("sofkaU.onlineplatform.profesor.proyectoevaluacioneditado");
        this.cuestionario = cuestionario;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }
}
