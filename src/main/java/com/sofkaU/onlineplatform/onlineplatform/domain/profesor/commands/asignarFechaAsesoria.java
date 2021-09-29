package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;

import java.util.Date;

public class asignarFechaAsesoria extends Command {
    private final ProfesorId profesorId;
    private final Date fecha;

    public asignarFechaAsesoria(ProfesorId profesorId, Date fecha){

        this.profesorId = profesorId;
        this.fecha = fecha;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public Date getFecha() {
        return fecha;
    }
}
