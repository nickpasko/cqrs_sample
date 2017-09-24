package ru.koniglabs.cqrs.common.interfaces;

/**
 * Created by nikolay on 24.09.17.
 */
public interface ICreateQueryHandlers<TQuery, TEntity> {
    IHandleQueries<TQuery, TEntity> create();
}
