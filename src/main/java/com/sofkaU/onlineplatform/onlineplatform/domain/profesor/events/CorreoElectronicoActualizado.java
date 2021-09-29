package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.CorreoElectronico;

public class CorreoElectronicoActualizado extends DomainEvent {
    private final CorreoElectronico correoElectronico;

    public CorreoElectronicoActualizado(CorreoElectronico correoElectronico) {
        super("sofkaU.onlineplatform.profesor.correoelectronicoactualizado");
        this.correoElectronico = correoElectronico;
    }

    public CorreoElectronico getCorreoElectronico() {
        return correoElectronico;
    }
}
