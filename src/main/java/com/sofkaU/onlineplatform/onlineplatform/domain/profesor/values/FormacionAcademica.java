package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class FormacionAcademica implements ValueObject<FormacionAcademica.Props> {
    private final String tituloUniversitario;
    private final List<String> certificadosAcademicos;
    private final String especialidad;

    public FormacionAcademica(String tituloUniversitario, List<String> certificadosAcademicos, String especialidad) {
        this.tituloUniversitario = Objects.requireNonNull(tituloUniversitario);
        this.certificadosAcademicos = Objects.requireNonNull(certificadosAcademicos);
        this.especialidad = Objects.requireNonNull(especialidad);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tituloUniversitario() {
                return tituloUniversitario;
            }

            @Override
            public List<String> certificadosAcademicos() {
                return certificadosAcademicos;
            }

            @Override
            public String especialidad() {
                return especialidad;
            }
        };
    }

    public interface Props{
        String tituloUniversitario();
        List<String> certificadosAcademicos();
        String especialidad();

    }
}
