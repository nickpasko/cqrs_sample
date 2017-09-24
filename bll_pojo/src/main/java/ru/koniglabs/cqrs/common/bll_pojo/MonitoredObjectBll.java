package ru.koniglabs.cqrs.common.bll_pojo;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * Created by nikolay on 24.09.17.
 */
@Data @Builder
public class MonitoredObjectBll {
    private UUID uuid;
    private String host;
    private String name;
    private String description;
}
