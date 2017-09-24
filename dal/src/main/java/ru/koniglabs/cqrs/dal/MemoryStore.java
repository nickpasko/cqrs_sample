package ru.koniglabs.cqrs.dal;

import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static ru.koniglabs.cqrs.common.helpers.SyntacticSugar.ifNull;

/**
 * Created by nikolay on 24.09.17.
 */
public class MemoryStore {
    private Map<UUID, MonitoredObjectDal> monitoredObjects;

    private static MemoryStore instance = null;

    private MemoryStore() {
        monitoredObjects = new HashMap<>();
    }

    public static MemoryStore getInstance() {
        synchronized (instance) {
            return ifNull(instance, new MemoryStore());
        }
    }

    public void saveMonitoredObject(MonitoredObjectDal mo) {
        monitoredObjects.put(mo.getUuid(), mo);
    }

    public MonitoredObjectDal getMonitoredObjectByUuid(UUID uuid) {
        return monitoredObjects.get(uuid);
    }
}
