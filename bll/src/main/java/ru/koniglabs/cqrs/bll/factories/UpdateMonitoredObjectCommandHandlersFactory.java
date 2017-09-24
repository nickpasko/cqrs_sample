package ru.koniglabs.cqrs.bll.factories;

import ru.koniglabs.cqrs.bll.command_handlers.CreateMonitoredObjectCommandHandler;
import ru.koniglabs.cqrs.bll.command_handlers.UpdateMonitoredObjectCommandHandler;
import ru.koniglabs.cqrs.bll.mappers.CreateMonitoredObjectMapper;
import ru.koniglabs.cqrs.bll.mappers.UpdateMonitoredObjectMapper;
import ru.koniglabs.cqrs.common.bll_commands.CreateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.bll_commands.UpdateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.interfaces.ICreateCommandHandlers;
import ru.koniglabs.cqrs.common.interfaces.IHandleCommands;

/**
 * Created by nikolay on 24.09.17.
 */
public class UpdateMonitoredObjectCommandHandlersFactory implements ICreateCommandHandlers<UpdateMonitoredObjectCommand>{
    @Override
    public IHandleCommands<UpdateMonitoredObjectCommand> create() {
        return new UpdateMonitoredObjectCommandHandler(new UpdateMonitoredObjectMapper());
    }
}
