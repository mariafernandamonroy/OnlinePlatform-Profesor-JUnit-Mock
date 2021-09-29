package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.sql.Time;

public class DuracionAsesoriaAsignada extends DomainEvent {
    private final Time duracion;

    public DuracionAsesoriaAsignada(Time duracion) {
        super("sofkaU.onlineplatform.profesor.duracionasesoriaasignada");
        this.duracion = duracion;
    }


    public Time getDuracion() {
        return duracion;
    }
}
