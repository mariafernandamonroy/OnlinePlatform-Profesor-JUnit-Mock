package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;

public class respoderPreguntaAEstudiante extends Command {
    private final ProfesorId profesorId;
    private final EstudianteId estudianteId;

    public respoderPreguntaAEstudiante(ProfesorId profesorId, EstudianteId estudianteId) {

        this.profesorId = profesorId;
        this.estudianteId = estudianteId;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }
}
