package ru.koniglabs.cqrs.common.interfaces;

/**
 * Created by nikolay on 24.09.17.
 */
public interface ICreateCommandHandlers<TCmd extends AbstractCommand> {
    IHandleCommands<TCmd> create();
}
