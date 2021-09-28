package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.AsesoriaId;

public class TemaAsesoriaAsignado extends DomainEvent {
    private final String tema;

    public TemaAsesoriaAsignado(String tema) {
        super("sofkaU.onlineplatform.profesor.temaasesoriaasignado");
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }
}
