package com.sofkaU.onlineplatform.onlineplatform.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

import java.sql.Time;

public class asignarDuracionAsesoria extends Command {
    private final ProfesorId profesorId;
    private final Time duracion;

    public asignarDuracionAsesoria(ProfesorId profesorId, Time duracion){

        this.profesorId = profesorId;
        this.duracion = duracion;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public Time getDuracion() {
        return duracion;
    }
}
