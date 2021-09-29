package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;

public class CursoAProfesorAsignado extends DomainEvent {
    private final CursoId cursoId;

    public CursoAProfesorAsignado(CursoId cursoId) {
        super("sofkaU.onlineplatform.profesor.cursoasignadoaprofesor");
        this.cursoId = cursoId;
    }

    public CursoId getCursoId() {
        return cursoId;
    }
}
