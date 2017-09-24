package ru.koniglabs.cqrs.bll.mappers;

import ru.koniglabs.cqrs.common.bll_commands.DeleteMonitoredObjectCommand;
import ru.koniglabs.cqrs.common.interfaces.IMapEntities;

import java.util.UUID;

/**
 * Created by nikolay on 24.09.17.
 */
public class DeleteMonitoredObjectMapper implements IMapEntities<DeleteMonitoredObjectCommand, UUID> {
    @Override
    public UUID map(DeleteMonitoredObjectCommand cmd) {
        return cmd.getUuid();
    }
}
