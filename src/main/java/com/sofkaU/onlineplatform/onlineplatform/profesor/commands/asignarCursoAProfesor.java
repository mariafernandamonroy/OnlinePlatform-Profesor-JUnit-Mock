package com.sofkaU.onlineplatform.onlineplatform.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

public class asignarCursoAProfesor extends Command {
    private final ProfesorId profesorId;
    private final CursoId cursoId;

    public asignarCursoAProfesor(ProfesorId profesorId, CursoId cursoId){

        this.profesorId = profesorId;
        this.cursoId = cursoId;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public CursoId getCursoId() {
        return cursoId;
    }
}
