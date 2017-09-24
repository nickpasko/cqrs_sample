package ru.koniglabs.cqrs.bll.command_handlers;

import ru.koniglabs.cqrs.common.bll_commands.DeleteMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;
import ru.koniglabs.cqrs.common.interfaces.IHandleCommands;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;
import ru.koniglabs.cqrs.dal.MemoryStore;

import java.util.UUID;

/**
 * Created by nikolay on 24.09.17.
 */
public class DeleteMonitoredObjectCommandHandler implements IHandleCommands<DeleteMonitoredObjectCommand> {
    IMapEntities mapper;

    public DeleteMonitoredObjectCommandHandler(IMapEntities mapper) {
        this.mapper = mapper;
    }

    @Override
    public void execute(DeleteMonitoredObjectCommand command) {
        UUID moId = (UUID) mapper.map(command);
        MemoryStore.getInstance().deleteMonitoredObject(moId);
    }
}
