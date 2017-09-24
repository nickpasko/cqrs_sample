package ru.koniglabs.cqrs.bll.mappers;

import ru.koniglabs.cqrs.common.bll_pojo.MonitoredObjectBll;
import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;

/**
 * Created by nikolay on 24.09.17.
 */
public class MonitoringObjectBllMapper implements IMapEntities<MonitoredObjectDal, MonitoredObjectBll> {
    @Override
    public MonitoredObjectBll map(MonitoredObjectDal from) {
        return MonitoredObjectBll.builder()
                .uuid(from.getUuid())
                .host(from.getHost())
                .name(from.getName())
                .description(from.getDescription())
                .build();
    }
}
