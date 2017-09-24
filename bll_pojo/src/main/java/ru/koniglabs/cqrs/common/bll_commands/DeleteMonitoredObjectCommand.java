package ru.koniglabs.cqrs.common.bll_commands;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * Created by nikolay on 24.09.17.
 */
@Data @Builder
public class DeleteMonitoredObjectCommand {
    private UUID uuid;
}
