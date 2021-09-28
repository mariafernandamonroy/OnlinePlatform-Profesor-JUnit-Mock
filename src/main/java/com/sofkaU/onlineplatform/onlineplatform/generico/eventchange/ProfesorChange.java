package com.sofkaU.onlineplatform.onlineplatform.generico.eventchange;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.onlineplatform.onlineplatform.generico.events.ProfesorCreado;
import com.sofkaU.onlineplatform.onlineplatform.profesor.Profesor;

public class ProfesorChange extends EventChange {
    public ProfesorChange(Profesor profesor) {

        apply((ProfesorCreado event) -> {
            profesor. = event.getNombreCompleto();
        });
    }
}
