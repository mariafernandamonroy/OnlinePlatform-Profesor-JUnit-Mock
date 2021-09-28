package com.sofkaU.onlineplatform.onlineplatform.generico.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Calificacion;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Cuestionario;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.EvaluacionId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.Proyecto;

public class EvaluacionAgregada extends DomainEvent {
    public EvaluacionAgregada(EvaluacionId evaluacionId, Cuestionario cuestionario, Proyecto proyecto, Calificacion calificacion) {
        super("sofkaU.onlineplatform.profesor.evaluacioncreada");
    }
}
