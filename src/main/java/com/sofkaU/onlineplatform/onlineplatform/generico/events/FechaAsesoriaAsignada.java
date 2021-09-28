package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.AsesoriaId;

import java.util.Date;

public class FechaAsesoriaAsignada extends DomainEvent {
    private final AsesoriaId asesoriaId;
    private final Date fecha;

    public FechaAsesoriaAsignada(AsesoriaId asesoriaId, Date fecha) {
        super("sofkaU.onlineplatform.profesor.fechaasesoriaasignada");
        this.asesoriaId = asesoriaId;
        this.fecha = fecha;
    }

    public AsesoriaId getAsesoriaId() {
        return asesoriaId;
    }

    public Date getFecha() {
        return fecha;
    }
}
