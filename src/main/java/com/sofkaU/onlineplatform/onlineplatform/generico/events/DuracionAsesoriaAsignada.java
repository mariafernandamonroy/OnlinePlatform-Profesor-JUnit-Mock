package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.AsesoriaId;

import java.sql.Time;

public class DuracionAsesoriaAsignada extends DomainEvent {
    private final AsesoriaId asesoriaId;
    private final Time duracion;

    public DuracionAsesoriaAsignada(AsesoriaId asesoriaId, Time duracion) {
        super("sofkaU.onlineplatform.profesor.duracionasesoriaasignada");
        this.asesoriaId = asesoriaId;
        this.duracion = duracion;
    }

    public AsesoriaId getAsesoriaId() {
        return asesoriaId;
    }

    public Time getDuracion() {
        return duracion;
    }
}
