package com.sofkaU.onlineplatform.onlineplatform.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.Profesor;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands.crearProfesor;

public class CrearProfesorUseCase extends UseCase<RequestCommand<crearProfesor>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<crearProfesor> crearProfesorRequestCommand) {
        var command = crearProfesorRequestCommand.getCommand();
        var profesor = new Profesor(
                command.getProfesorId(),
                command.getNombreCompleto(),
                command.getCorreoElectronico()
        );
        emit().onResponse(new ResponseEvents(profesor.getUncommittedChanges()));
    }
}
