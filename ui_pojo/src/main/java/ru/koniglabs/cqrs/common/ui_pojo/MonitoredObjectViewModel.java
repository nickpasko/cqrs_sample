package ru.koniglabs.cqrs.common.ui_pojo;

import lombok.Builder;
import lombok.Data;

/**
 * Created by nikolay on 24.09.17.
 */
@Data @Builder
public class MonitoredObjectViewModel {
    public String host;
    public String name;
    public String description;
}
