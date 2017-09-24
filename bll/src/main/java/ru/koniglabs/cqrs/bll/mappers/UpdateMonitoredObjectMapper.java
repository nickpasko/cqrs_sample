package ru.koniglabs.cqrs.bll.mappers;

import ru.koniglabs.cqrs.common.bll_commands.UpdateMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;

/**
 * Created by nikolay on 24.09.17.
 */
public class UpdateMonitoredObjectMapper implements IMapEntities<UpdateMonitoredObjectCommand, MonitoredObjectDal> {
    @Override
    public MonitoredObjectDal map(UpdateMonitoredObjectCommand cmd) {
        return MonitoredObjectDal.builder()
                .uuid(cmd.getUuid())
                .host(cmd.getHost())
                .name(cmd.getName())
                .description(cmd.getDescription())
                .build();
    }
}
