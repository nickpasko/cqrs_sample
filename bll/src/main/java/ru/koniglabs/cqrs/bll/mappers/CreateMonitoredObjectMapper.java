package ru.koniglabs.cqrs.bll.mappers;

import ru.koniglabs.cqrs.common.bll_commands.CreateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;

/**
 * Created by nikolay on 24.09.17.
 */
public class CreateMonitoredObjectMapper implements IMapEntities<CreateMonitoredObjectCommand, MonitoredObjectDal>{
    @Override
    public MonitoredObjectDal map(CreateMonitoredObjectCommand cmd) {
        return MonitoredObjectDal.builder()
                .host(cmd.getHost())
                .name(cmd.getName())
                .description(cmd.getDescription())
                .build();
    }
}
