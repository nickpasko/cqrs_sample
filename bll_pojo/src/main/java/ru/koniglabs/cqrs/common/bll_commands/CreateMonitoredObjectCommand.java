package ru.koniglabs.cqrs.common.bll_commands;

import lombok.Builder;
import lombok.Data;
import ru.koniglabs.cqrs.common.interfaces.AbstractCommand;

/**
 * Created by nikolay on 24.09.17.
 */
@Data @Builder
public class CreateMonitoredObjectCommand extends AbstractCommand {
    private String host;
    private String name;
    private String description;
}
