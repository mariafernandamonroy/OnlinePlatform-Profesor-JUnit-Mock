package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values;

import co.com.sofka.domain.generic.Identity;

public class AsesoriaId extends Identity {
    private AsesoriaId(String id){
        super(id);
    }

    public static AsesoriaId of(String id){
        return new AsesoriaId(id);
    }
}
