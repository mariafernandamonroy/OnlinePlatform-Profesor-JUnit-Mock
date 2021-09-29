package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.Proyecto;

public class calcularProyectoCuestionarioEvaluacion extends Command {
    private final ProfesorId profesorId;
    private final Proyecto proyecto;
    private final Calificacion calificacion;

    public calcularProyectoCuestionarioEvaluacion(ProfesorId profesorId, Proyecto proyecto, Calificacion calificacion){

        this.profesorId = profesorId;
        this.proyecto = proyecto;
        this.calificacion = calificacion;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
