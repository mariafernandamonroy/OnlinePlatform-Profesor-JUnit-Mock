package com.sofkaU.onlineplatform.onlineplatform.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.NombreCompleto;

public class NombreCompletoActualizado extends DomainEvent {
    private final NombreCompleto nombreCompleto;

    public NombreCompletoActualizado(NombreCompleto nombreCompleto) {
        super("sofkaU.onlineplatform.profesor.nombrecompletoactualizado");
        this.nombreCompleto = nombreCompleto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
