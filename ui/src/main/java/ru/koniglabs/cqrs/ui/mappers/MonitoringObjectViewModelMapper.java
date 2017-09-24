package ru.koniglabs.cqrs.ui.mappers;

import ru.koniglabs.cqrs.common.bll_pojo.MonitoredObjectBll;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;
import ru.koniglabs.cqrs.common.ui_pojo.MonitoredObjectViewModel;

/**
 * Created by nikolay on 24.09.17.
 */
public class MonitoringObjectViewModelMapper implements IMapEntities<MonitoredObjectBll, MonitoredObjectViewModel> {
    @Override
    public MonitoredObjectViewModel map(MonitoredObjectBll from) {
        return MonitoredObjectViewModel.builder()
                .host(from.getHost())
                .name(from.getName())
                .description(from.getDescription())
                .build();
    }
}
