package ru.koniglabs.cqrs.bll.command_handlers;

import ru.koniglabs.cqrs.common.bll_commands.UpdateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;
import ru.koniglabs.cqrs.common.interfaces.IHandleCommands;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;
import ru.koniglabs.cqrs.dal.MemoryStore;

/**
 * Created by nikolay on 24.09.17.
 */
public class UpdateMonitoredObjectCommandHandler implements IHandleCommands<UpdateMonitoredObjectCommand> {
    IMapEntities mapper;

    public UpdateMonitoredObjectCommandHandler(IMapEntities mapper) {
        this.mapper = mapper;
    }

    @Override
    public void execute(UpdateMonitoredObjectCommand command) {
        MonitoredObjectDal mo = (MonitoredObjectDal) mapper.map(command);
        MemoryStore.getInstance().updateMonitoredObject(mo);
    }
}
