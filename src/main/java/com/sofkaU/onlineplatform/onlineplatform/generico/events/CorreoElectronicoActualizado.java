package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.CorreoElectronico;

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
