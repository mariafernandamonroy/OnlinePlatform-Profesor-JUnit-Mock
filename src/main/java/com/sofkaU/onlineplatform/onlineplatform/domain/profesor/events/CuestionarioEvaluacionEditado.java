package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.EvaluacionId;

public class CuestionarioEvaluacionEditado extends DomainEvent {
    private EvaluacionId evaluacionId;
    private Cuestionario cuestionario;

    public CuestionarioEvaluacionEditado(Cuestionario cuestionario) {
        super("sofkaU.onlineplatform.profesor.cuestionarioevaluacioneditado");
        this.cuestionario = cuestionario;
    }


    public Cuestionario getCuestionario() {
        return cuestionario;
    }
}
