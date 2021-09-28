package com.sofkaU.onlineplatform.onlineplatform.estudiante;


import co.com.sofka.domain.generic.Entity;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.PreguntaId;

import java.util.Objects;

public class Pregunta extends Entity<PreguntaId> {

    private String descripcionPregunta;
    private int limiteCaracteres;

    public Pregunta(PreguntaId preguntaId, String descripcionPregunta, int limiteCaracteres ) {
        super(preguntaId);
        this.descripcionPregunta = descripcionPregunta;
        this.limiteCaracteres = limiteCaracteres;
    }

    public void escribirPregunta(String descripcionPregunta){
        this.descripcionPregunta = Objects.requireNonNull(descripcionPregunta);
    }

    public void asignarLimiteCaracteres(int limiteCaracteres){
        this.limiteCaracteres = Objects.requireNonNull(limiteCaracteres);
    }
}
