package com.sofkaU.onlineplatform.onlineplatform.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.Profesor;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands.actualizarNombrecompleto;

public class ActualizarNombreCompletoUseCase extends UseCase<RequestCommand<actualizarNombrecompleto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<actualizarNombrecompleto> actualizarNombrecompletoRequestCommand) {
        var command = actualizarNombrecompletoRequestCommand.getCommand();
        var profesor = Profesor.from(command.getProfesorId(),retrieveEvents());
        profesor.actualizarNombrecompleto(command.getNombreCompleto());
        emit().onResponse(new ResponseEvents(profesor.getUncommittedChanges()));
    }
}
