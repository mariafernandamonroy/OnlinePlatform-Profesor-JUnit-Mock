package com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCompleto implements ValueObject<NombreCompleto.Props> {

    private final String nombre;
    private final String apellido;

    public NombreCompleto(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    public interface Props{
        String nombre();
        String apellido();
    }
}
