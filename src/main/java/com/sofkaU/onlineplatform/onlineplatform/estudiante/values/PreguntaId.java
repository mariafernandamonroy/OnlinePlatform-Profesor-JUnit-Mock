package com.sofkaU.onlineplatform.onlineplatform.estudiante.values;

import co.com.sofka.domain.generic.Identity;

public class PreguntaId extends Identity {
    private PreguntaId(String id){
        super(id);
    }

    public static PreguntaId of(String id){
        return new PreguntaId(id);
    }
}
