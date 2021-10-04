package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.NombreCompleto;

public class ProfesorCreado extends DomainEvent {
    private final NombreCompleto nombreCompleto;
    private final CorreoElectronico correoElectronico;

    public ProfesorCreado(NombreCompleto nombreCompleto, CorreoElectronico correoElectronico){
        super("sofkaU.onlineplatform.profesor.profesorcreado");
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public CorreoElectronico getCorreoElectronico() {
        return correoElectronico;
    }
}
