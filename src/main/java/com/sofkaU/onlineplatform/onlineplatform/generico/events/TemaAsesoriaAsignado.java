package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.AsesoriaId;

public class TemaAsesoriaAsignado extends DomainEvent {
    private final AsesoriaId asesoriaId;
    private final String tema;

    public TemaAsesoriaAsignado(AsesoriaId asesoriaId, String tema) {
        super("sofkaU.onlineplatform.profesor.temaasesoriaasignado");
        this.asesoriaId = asesoriaId;
        this.tema = tema;
    }
}
