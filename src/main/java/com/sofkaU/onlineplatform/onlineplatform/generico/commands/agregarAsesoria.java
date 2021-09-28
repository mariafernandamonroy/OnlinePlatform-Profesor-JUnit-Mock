package com.sofkaU.onlineplatform.onlineplatform.generico.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.AsesoriaId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

import java.sql.Time;
import java.util.Date;

public class agregarAsesoria extends Command {
    private final ProfesorId profesorId;
    private final AsesoriaId asesoriaId;
    private final Time duracion;
    private final Date fecha;
    private final String tema;

    public agregarAsesoria(ProfesorId profesorId, AsesoriaId asesoriaId, Time duracion, Date fecha, String tema){

        this.profesorId = profesorId;
        this.asesoriaId = asesoriaId;
        this.duracion = duracion;
        this.fecha = fecha;
        this.tema = tema;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
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
}
