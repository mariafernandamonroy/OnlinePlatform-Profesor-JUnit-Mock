package com.sofkaU.onlineplatform.onlineplatform.profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.onlineplatform.onlineplatform.curso.values.CursoId;
import com.sofkaU.onlineplatform.onlineplatform.estudiante.values.EstudianteId;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.NombreCompleto;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.FormacionAcademica;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

import java.util.List;

public class Profesor extends AggregateEvent<ProfesorId> {

    protected NombreCompleto nombreCompleto;
    protected CorreoElectronico correoElectronico;
    protected FormacionAcademica formacionAcademica;
    protected List<CursoId> cursoIds;
    protected List<EstudianteId> estudianteIds;
    protected Evaluacion evaluacion;
    protected Asesoria asesoria;

    public Profesor(ProfesorId profesorId, NombreCompleto nombreCompleto, CorreoElectronico correoElectronico) {
        super(profesorId);
    }
}
