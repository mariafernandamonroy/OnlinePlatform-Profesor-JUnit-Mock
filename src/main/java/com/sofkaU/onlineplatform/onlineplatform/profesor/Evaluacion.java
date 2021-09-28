package com.sofkaU.onlineplatform.onlineplatform.profesor;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Proyecto;

import java.util.Objects;

public class Evaluacion extends Entity<EvaluacionId> {
    private Cuestionario cuestionario;
    private Proyecto proyecto;
    private Calificacion calificacion;

    public Evaluacion(EvaluacionId evaluacionId, Cuestionario cuestionario, Proyecto proyecto, Calificacion calificacion){
        super(evaluacionId);
        this.cuestionario = cuestionario;
        this.calificacion = calificacion;
        this.proyecto = proyecto;
    }

    public void editarCuestionario(Cuestionario cuestionario){
        this.cuestionario = Objects.requireNonNull(cuestionario);
    }

    public void editarProyecto(Proyecto proyecto){
        this.proyecto = Objects.requireNonNull(proyecto);
    }

    public void calcularCalificacionProyecto(Calificacion calificacion, Proyecto proyecto){
        this.calificacion = calificacion;
        this.proyecto = Objects.requireNonNull(proyecto);
    }

    public void calcularCalificacionCuestionario(Calificacion calificacion, Cuestionario cuestionario){
        this.calificacion = calificacion;
        this.cuestionario = Objects.requireNonNull(cuestionario);
    }

    public Cuestionario cuestionario() {
        return cuestionario;
    }

    public Proyecto proyecto() {
        return proyecto;
    }

    public Calificacion calificacion() {
        return calificacion;
    }
}
