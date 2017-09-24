package ru.koniglabs.cqrs.bll.factories;

import ru.koniglabs.cqrs.common.interfaces.AbstractCommand;
import ru.koniglabs.cqrs.common.interfaces.IContainCommandHandlers;
import ru.koniglabs.cqrs.common.interfaces.IHandleCommands;

import java.util.List;

/**
 * Created by nikolay on 24.09.17.
 */
public class CommandHandlersContainer implements IContainCommandHandlers {
    private List<IHandleCommands> handlers;

    @Override
    public void registerHandler(AbstractCommand abstractCommand, IHandleCommands handler) {
        handlers.add(handler);
    }

    @Override
    public void udRegisterHandler(AbstractCommand abstractCommand, IHandleCommands handler) {

    }

    @Override
    public IHandleCommands getHandler(AbstractCommand abstractCommand) {
        return null;
    }
}
