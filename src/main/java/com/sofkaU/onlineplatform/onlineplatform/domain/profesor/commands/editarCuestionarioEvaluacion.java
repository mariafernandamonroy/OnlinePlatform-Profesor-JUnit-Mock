package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;

public class editarCuestionarioEvaluacion extends Command {
    private final ProfesorId profesorId;
    private final Cuestionario cuestionario;

    public editarCuestionarioEvaluacion(ProfesorId profesorId, Cuestionario cuestionario){
        this.profesorId = profesorId;
        this.cuestionario = cuestionario;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }
}
