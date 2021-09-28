package com.sofkaU.onlineplatform.onlineplatform.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.events.EstudianteAgregado;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.NombreCompleto;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.Estudiante;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.EstudianteChange;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.events.EstudianteCreado;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;

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
        appendChange(new EstudianteAgregado(nombreCompleto)).apply();
    }

    private Estudiante(EstudianteId estudianteId){
        super(estudianteId);
        subscribe(new EstudianteChange(this));
    }

    public static Estudiante from(EstudianteId estudianteId, List<DomainEvent> events){
        var estudiante = new Estudiante(estudianteId);
        events.forEach(estudiante::applyEvent);
        return estudiante;
    }

}
