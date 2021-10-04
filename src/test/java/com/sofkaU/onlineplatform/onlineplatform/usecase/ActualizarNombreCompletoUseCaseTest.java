package com.sofkaU.onlineplatform.onlineplatform.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands.actualizarNombrecompleto;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events.NombreCompletoActualizado;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events.ProfesorCreado;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.CorreoElectronico;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.NombreCompleto;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ActualizarNombreCompletoUseCaseTest {
    @Mock
    private DomainEventRepository repository;
    private static String PROFESORID = "ABC123";

    @Test
    void actualizarNombreCompletoProfesor(){
        var command = new actualizarNombrecompleto(
                ProfesorId.of(PROFESORID),
                new NombreCompleto("Tina","Rodriguez")
        );
        var useCase = new ActualizarNombreCompletoUseCase();

        Mockito.when(repository.getEventsBy(PROFESORID)).thenReturn(EventStore());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(PROFESORID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (NombreCompletoActualizado) events.get(0);
        Assertions.assertEquals("Tina",event.getNombreCompleto().value().nombre());
        Assertions.assertEquals("Rodriguez",event.getNombreCompleto().value().apellido());
        Mockito.verify(repository).getEventsBy(PROFESORID);
    }
    private List<DomainEvent> EventStore() {
        return List.of(
                new ProfesorCreado(
                        new NombreCompleto("Tina","Rodriguez"),
                        new CorreoElectronico("tina@gmail.com")
                ),
                new NombreCompletoActualizado(
                        new NombreCompleto("MaFe","Rodriguez")
                )
        );
    }
}