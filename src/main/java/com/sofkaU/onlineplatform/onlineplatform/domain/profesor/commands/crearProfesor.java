package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.NombreCompleto;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;

public class crearProfesor extends Command {

    private final ProfesorId profesorId;
    private final NombreCompleto nombreCompleto;
    private final CorreoElectronico correoElectronico;

    public crearProfesor(ProfesorId profesorId, NombreCompleto nombreCompleto, CorreoElectronico correoElectronico){

        this.profesorId = profesorId;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public CorreoElectronico getCorreoElectronico() {
        return correoElectronico;
    }
}
