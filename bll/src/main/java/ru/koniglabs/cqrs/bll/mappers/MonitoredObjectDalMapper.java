package ru.koniglabs.cqrs.bll.mappers;

import com.sun.corba.se.spi.monitoring.MonitoredObject;
import ru.koniglabs.cqrs.common.bll_pojo.MonitoredObjectBll;
import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;

/**
 * Created by nikolay on 24.09.17.
 */
public class MonitoredObjectDalMapper implements IMapEntities<MonitoredObjectBll, MonitoredObjectDal>{
    @Override
    public MonitoredObjectDal map(MonitoredObjectBll from) {
        return MonitoredObjectDal.builder()
                .uuid(from.getUuid())
                .host(from.getHost())
                .name(from.getName())
                .description(from.getDescription())
                .build();
    }
}
