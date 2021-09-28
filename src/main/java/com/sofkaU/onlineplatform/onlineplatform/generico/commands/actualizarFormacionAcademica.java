package com.sofkaU.onlineplatform.onlineplatform.generico.commands;

import com.sofkaU.onlineplatform.onlineplatform.profesor.values.FormacionAcademica;
import com.sofkaU.onlineplatform.onlineplatform.profesor.values.ProfesorId;

public class actualizarFormacionAcademica {
    private final ProfesorId profesorId;
    private final FormacionAcademica formacionAcademica;

    public actualizarFormacionAcademica(ProfesorId profesorId, FormacionAcademica formacionAcademica){

        this.profesorId = profesorId;
        this.formacionAcademica = formacionAcademica;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public FormacionAcademica getFormacionAcademica() {
        return formacionAcademica;
    }
}
