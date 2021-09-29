package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CorreoElectronico implements ValueObject<String> {

    private final String email;

    public CorreoElectronico(String email) {
        this.email = Objects.requireNonNull(email);
    }

    public String value(){
        return value();
    }
}
