package ru.koniglabs.cqrs.common.bll_commands;

import lombok.Builder;
import lombok.Data;
import ru.koniglabs.cqrs.common.interfaces.AbstractCommand;

import java.util.UUID;

/**
 * Created by nikolay on 24.09.17.
 */
@Data @Builder
public class UpdateMonitoredObjectCommand extends AbstractCommand {
    private UUID uuid;
    private String host;
    private String name;
    private String description;
}
