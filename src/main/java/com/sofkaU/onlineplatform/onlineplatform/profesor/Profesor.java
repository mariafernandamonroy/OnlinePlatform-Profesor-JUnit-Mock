package com.sofkaU.onlineplatform.onlineplatform.profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

public class Profesor extends AggregateEvent<ProfesorId> {

    public Profesor(ProfesorId profesorId) {
        super(profesorId);
    }
}
