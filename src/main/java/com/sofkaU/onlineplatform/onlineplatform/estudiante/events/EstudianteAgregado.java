package com.sofkaU.onlineplatform.onlineplatform.estudiante.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.NombreCompleto;

public class EstudianteAgregado extends DomainEvent {
    private final NombreCompleto nombreCompleto;

    public EstudianteAgregado(NombreCompleto nombreCompleto) {
        super("sofkaU.onlineplatform.profesor.estudianteagregado");

        this.nombreCompleto = nombreCompleto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
