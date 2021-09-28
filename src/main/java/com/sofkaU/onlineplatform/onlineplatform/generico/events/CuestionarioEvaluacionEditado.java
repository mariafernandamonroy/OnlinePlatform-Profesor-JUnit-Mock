package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;

public class CuestionarioEvaluacionEditado extends DomainEvent {
    private EvaluacionId evaluacionId;
    private Cuestionario cuestionario;

    public CuestionarioEvaluacionEditado(EvaluacionId evaluacionId, Cuestionario cuestionario) {
        super("sofkaU.onlineplatform.profesor.cuestionarioevaluacioneditado");
        this.evaluacionId = evaluacionId;
        this.cuestionario = cuestionario;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }
}
