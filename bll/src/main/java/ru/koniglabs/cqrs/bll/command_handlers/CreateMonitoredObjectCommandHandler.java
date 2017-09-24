package ru.koniglabs.cqrs.bll.command_handlers;

import ru.koniglabs.cqrs.common.bll_commands.CreateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;
import ru.koniglabs.cqrs.common.interfaces.IHandleCommands;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;
import ru.koniglabs.cqrs.dal.MemoryStore;

import java.util.UUID;

/**
 * Created by nikolay on 24.09.17.
 */
public class CreateMonitoredObjectCommandHandler implements IHandleCommands<CreateMonitoredObjectCommand> {
    IMapEntities mapper;

    public CreateMonitoredObjectCommandHandler(IMapEntities mapper) {
        this.mapper = mapper;
    }

    @Override
    public void execute(CreateMonitoredObjectCommand command) {
        MonitoredObjectDal mo = (MonitoredObjectDal) mapper.map(command);
        UUID uuid = MemoryStore.getInstance().createMonitoredObject(mo);
    }
}
