package com.sofkaU.onlineplatform.onlineplatform.generico.commands;

import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

public class asignarCursoAProfesor {
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
