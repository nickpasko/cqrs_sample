package ru.koniglabs.cqrs.bll.factories;

import ru.koniglabs.cqrs.bll.command_handlers.CreateMonitoredObjectCommandHandler;
import ru.koniglabs.cqrs.bll.command_handlers.DeleteMonitoredObjectCommandHandler;
import ru.koniglabs.cqrs.bll.mappers.CreateMonitoredObjectMapper;
import ru.koniglabs.cqrs.bll.mappers.DeleteMonitoredObjectMapper;
import ru.koniglabs.cqrs.common.bll_commands.CreateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.bll_commands.DeleteMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.interfaces.ICreateCommandHandlers;
import ru.koniglabs.cqrs.common.interfaces.IHandleCommands;

/**
 * Created by nikolay on 24.09.17.
 */
public class DeleteMonitoredObjectCommandHandlersFactory implements ICreateCommandHandlers<DeleteMonitoredObjectCommand>{
    @Override
    public IHandleCommands<DeleteMonitoredObjectCommand> create() {
        return new DeleteMonitoredObjectCommandHandler(new DeleteMonitoredObjectMapper());
    }
}
