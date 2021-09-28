package com.sofkaU.onlineplatform.onlineplatform.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.NombreCompleto;

import java.util.List;

public class Estudiante extends AggregateEvent<EstudianteId> {
    protected NombreCompleto nombreCompleto;
    protected CorreoElectronico correoElectronico;
    protected int totalPuntos;
    protected List<CursoId> cursosIds;
    protected Pregunta pregunta;
    protected Aporte aporte;

    public Estudiante(EstudianteId estudianteId, NombreCompleto nombreCompleto, CorreoElectronico correoElectronico, int totalPuntos, List<CursoId> cursosIds, Pregunta pregunta, Aporte aporte) {
        super(estudianteId);
    }

}
