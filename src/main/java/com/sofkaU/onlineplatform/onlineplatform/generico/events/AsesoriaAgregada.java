package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.AsesoriaId;

import java.sql.Time;
import java.util.Date;

public class AsesoriaAgregada extends DomainEvent {
    private AsesoriaId asesoriaId;
    private Time duracion;
    private Date fecha;
    private String tema;
    private Time duration;

    public AsesoriaAgregada(AsesoriaId asesoriaId, Time duracion, Date fecha, String tema) {
        super("sofkaU.onlineplatform.profesor.asesoriaagregada");
        this.asesoriaId = asesoriaId;
        this.duracion = duracion;
        this.fecha = fecha;
        this.tema = tema;
    }

    public AsesoriaId getAsesoriaId() {
        return asesoriaId;
    }

    public Time getDuracion() {
        return duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTema() {
        return tema;
    }

    public Time getDuration() {
        return duration;
    }
}
