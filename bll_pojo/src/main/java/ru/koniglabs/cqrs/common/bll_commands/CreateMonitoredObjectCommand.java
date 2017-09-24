package ru.koniglabs.cqrs.common.bll_commands;

import lombok.Builder;
import lombok.Data;

/**
 * Created by nikolay on 24.09.17.
 */
@Data @Builder
public class CreateMonitoredObjectCommand {
    private String host;
    private String name;
    private String description;
}
