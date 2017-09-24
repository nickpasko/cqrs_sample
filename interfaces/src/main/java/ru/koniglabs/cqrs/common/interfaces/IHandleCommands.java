package ru.koniglabs.cqrs.common.interfaces;

/**
 * Created by nikolay on 24.09.17.
 */
public interface IHandleCommands<TCmd extends AbstractCommand> {
    void execute(TCmd command);
}
