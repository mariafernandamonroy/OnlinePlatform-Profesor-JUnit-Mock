package com.sofkaU.onlineplatform.onlineplatform.generico.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.generico.globalvalues.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

public class actualizarCorreoElectronico extends Command {
    private final ProfesorId profesorId;
    private final CorreoElectronico correoElectronico;

    public actualizarCorreoElectronico(ProfesorId profesorId, CorreoElectronico correoElectronico){

        this.profesorId = profesorId;
        this.correoElectronico = correoElectronico;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public CorreoElectronico getCorreoElectronico() {
        return correoElectronico;
    }
}
