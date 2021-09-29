package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.Proyecto;

public class editarProyectoEvaluacion extends Command {
    private final ProfesorId profesorId;
    private final Proyecto proyecto;

    public editarProyectoEvaluacion(ProfesorId profesorId, Proyecto proyecto){
        this.profesorId = profesorId;
        this.proyecto = proyecto;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
