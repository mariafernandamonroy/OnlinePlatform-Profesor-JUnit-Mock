package com.sofkaU.onlineplatform.onlineplatform.estudiante;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.AsesoriaId;

import java.util.Objects;

public class Aporte extends Entity {

    private String descripcionAporte;
    private int limiteCaracteres;

    public Aporte(AsesoriaId asesoriaId, String descripcionAporte, int limiteCaracteres ){
        super(asesoriaId);
        this.descripcionAporte = descripcionAporte;
        this.limiteCaracteres = limiteCaracteres;
    }

    public void escribirAporte(String descripcionAporte){
        this.descripcionAporte = Objects.requireNonNull(descripcionAporte);
    }

    public void asignarLimiteCaracteres(int limiteCaracteres){
        this.limiteCaracteres = Objects.requireNonNull(limiteCaracteres);
    }
}
