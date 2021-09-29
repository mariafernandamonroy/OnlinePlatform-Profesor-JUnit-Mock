package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.FormacionAcademica;

public class FormacionAcademicaActualizada extends DomainEvent {
    private final FormacionAcademica formacionAcademica;

    public FormacionAcademicaActualizada(FormacionAcademica formacionAcademica) {
        super("sofkaU.onlineplatform.profesor.formacionacademicaactualizada");
        this.formacionAcademica = formacionAcademica;
    }

    public FormacionAcademica getFormacionAcademica() {
        return formacionAcademica;
    }
}
