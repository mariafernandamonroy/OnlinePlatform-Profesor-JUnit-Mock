package com.sofkaU.onlineplatform.onlineplatform.profesor.values;

import co.com.sofka.domain.generic.Identity;

public class EvaluacionId extends Identity {
    private EvaluacionId(String id){
        super(id);
    }

    public static EvaluacionId of(String id){
        return new EvaluacionId(id);
    }
}
