package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;

public class PreguntaAEstudianteRespondida extends DomainEvent {
    private final EstudianteId estudianteId;

    public PreguntaAEstudianteRespondida(EstudianteId estudianteId) {
        super("sofkaU.onlineplatform.profesor.preguntaaestudianterespondida");
        this.estudianteId = estudianteId;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }
}
