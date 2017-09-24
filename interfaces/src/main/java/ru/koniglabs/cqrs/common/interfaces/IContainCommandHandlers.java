package ru.koniglabs.cqrs.common.interfaces;

/**
 * Created by nikolay on 24.09.17.
 */
public interface IContainCommandHandlers<TCmd extends AbstractCommand> {
    void registerHandler(TCmd cmd, IHandleCommands<TCmd> handler);
    void udRegisterHandler(TCmd cmd, IHandleCommands<TCmd> handler);
    IHandleCommands<TCmd> getHandler(TCmd cmd);
}
