package com.sofkaU.onlineplatform.onlineplatform.estudiante.values;

import co.com.sofka.domain.generic.Identity;

public class EstudianteId extends Identity {
    private EstudianteId(String id){
        super(id);
    }

    public static EstudianteId of(String id) {
        return new EstudianteId(id);
    }
}
