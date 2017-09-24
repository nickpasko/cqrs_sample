package ru.koniglabs.cqrs.ui.mappers;

import ru.koniglabs.cqrs.common.bll_commands.CreateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;
import ru.koniglabs.cqrs.common.ui_pojo.MonitoredObjectViewModel;

/**
 * Created by nikolay on 24.09.17.
 */
public class MonitoringObjectBllMapper implements IMapEntities<MonitoredObjectViewModel, CreateMonitoredObjectCommand> {
    @Override
    public CreateMonitoredObjectCommand map(MonitoredObjectViewModel from) {
        return CreateMonitoredObjectCommand.builder()
                .host(from.getHost())
                .name(from.getName())
                .description(from.getDescription())
                .build();
    }
}