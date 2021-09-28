package com.sofkaU.onlineplatform.onlineplatform.generico.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

public class asignarTemaAsesoria extends Command {
    private final ProfesorId profesorId;
    private final String tema;

    public asignarTemaAsesoria(ProfesorId profesorId, String tema){

        this.profesorId = profesorId;
        this.tema = tema;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public String getTema() {
        return tema;
    }
}
