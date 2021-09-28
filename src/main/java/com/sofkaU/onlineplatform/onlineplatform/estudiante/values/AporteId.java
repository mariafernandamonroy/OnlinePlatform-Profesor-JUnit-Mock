package com.sofkaU.onlineplatform.onlineplatform.estudiante.values;

import co.com.sofka.domain.generic.Identity;

public class AporteId extends Identity {
    private AporteId(String id){
        super(id);
    }

    public static AporteId of(String id){
        return new AporteId(id);
    }

}
