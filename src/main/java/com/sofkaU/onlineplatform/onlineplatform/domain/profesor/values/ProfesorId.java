package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values;

import co.com.sofka.domain.generic.Identity;

public class ProfesorId extends Identity {
    private ProfesorId(String id){
        super(id);
    }

    public static ProfesorId of(String id){
        return new ProfesorId(id);
    }
}
