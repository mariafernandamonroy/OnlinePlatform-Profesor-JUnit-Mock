package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.Proyecto;

public class ProyectoEvaluacionEditado extends DomainEvent {
    private Proyecto proyecto;

    public ProyectoEvaluacionEditado(Proyecto proyecto) {
        super("sofkaU.onlineplatform.profesor.proyectoevaluacioneditado");
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
