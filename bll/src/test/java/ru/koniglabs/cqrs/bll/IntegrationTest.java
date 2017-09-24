package ru.koniglabs.cqrs.bll;

import org.junit.Test;
import ru.koniglabs.cqrs.bll.factories.CreateMonitoredObjectCommandHandlersFactory;
import ru.koniglabs.cqrs.bll.factories.DeleteMonitoredObjectCommandHandlersFactory;
import ru.koniglabs.cqrs.bll.factories.UpdateMonitoredObjectCommandHandlersFactory;
import ru.koniglabs.cqrs.common.bll_commands.CreateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.bll_commands.DeleteMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.bll_commands.UpdateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.interfaces.ICreateCommandHandlers;
import ru.koniglabs.cqrs.common.interfaces.IHandleCommands;
import ru.koniglabs.cqrs.dal.MemoryStore;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by nikolay on 24.09.17.
 */
public class IntegrationTest {
    @Test
    public void testCreate_Update_DeleteMo_Ok() {
        ICreateCommandHandlers handlerFactory = new CreateMonitoredObjectCommandHandlersFactory();
        IHandleCommands handler = handlerFactory.create();
        CreateMonitoredObjectCommand createCmd = CreateMonitoredObjectCommand
                .builder()
                    .host("localhost")
                    .name("bebebe")
                    .description("test MO 1")
                    .build();
        handler.execute(createCmd);
        UUID newMoId = MemoryStore.getInstance().getMonitoredObjects().get(0).getUuid();

        handlerFactory = new UpdateMonitoredObjectCommandHandlersFactory();
        handler = handlerFactory.create();
        UpdateMonitoredObjectCommand updateCmd = UpdateMonitoredObjectCommand
                .builder()
                .uuid(newMoId)
                .host("localhost")
                .name("bebebe2")
                .description("test MO 1")
                .build();
        handler.execute(updateCmd);
        assertEquals("bebebe2", MemoryStore.getInstance().getMonitoredObjectByUuid(newMoId).getName());

        handlerFactory = new DeleteMonitoredObjectCommandHandlersFactory();
        handler = handlerFactory.create();
        DeleteMonitoredObjectCommand deleteCmd = DeleteMonitoredObjectCommand
                .builder()
                .uuid(newMoId)
                .build();
        handler.execute(deleteCmd);
        assertNull(MemoryStore.getInstance().getMonitoredObjectByUuid(newMoId));
    }
}
