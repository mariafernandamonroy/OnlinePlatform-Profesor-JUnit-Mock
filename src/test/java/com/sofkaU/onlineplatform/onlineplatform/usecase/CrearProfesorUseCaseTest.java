package com.sofkaU.onlineplatform.onlineplatform.usecase;

import static org.junit.jupiter.api.Assertions.*;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands.crearProfesor;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events.ProfesorCreado;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.NombreCompleto;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CrearProfesorUseCaseTest  {
    private static String PROFESORID = "ABC123";

    @Test
    void crearProfesor(){
        var command = new crearProfesor(
                ProfesorId.of(PROFESORID),
                new NombreCompleto("Ligia","Bernal"),
                new CorreoElectronico("ligy@gmail.com")
        );
        var useCase = new CrearProfesorUseCase();


        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(PROFESORID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (ProfesorCreado) events.get(0);
        Assertions.assertEquals("Ligia",event.getNombreCompleto().value().nombre());
        Assertions.assertEquals("Bernal",event.getNombreCompleto().value().apellido());
        Assertions.assertEquals("ligy@gmail.com",event.getCorreoElectronico());
    }

}