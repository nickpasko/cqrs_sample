package ru.koniglabs.cqrs.common.interfaces;

/**
 * Created by nikolay on 24.09.17.
 */
public interface IMapEntities<TFrom, TTo> {
    public TTo map(TFrom from);
}
