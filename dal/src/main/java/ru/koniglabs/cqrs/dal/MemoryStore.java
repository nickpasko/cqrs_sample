package ru.koniglabs.cqrs.dal;

import ru.koniglabs.cqrs.common.dal_pojo.MonitoredObjectDal;

import javax.naming.directory.Attributes;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static ru.koniglabs.cqrs.common.helpers.SyntacticSugar.ifNull;

/**
 * Created by nikolay on 24.09.17.
 */
public class MemoryStore {
    private static volatile Map<UUID, MonitoredObjectDal> monitoredObjects;

    private static MemoryStore instance = null;
    private static final Object lock = new Object();

    private MemoryStore() {
        monitoredObjects = new HashMap<>();
    }

    public static MemoryStore getInstance() {
        synchronized (lock) {
            return ifNull(instance, new MemoryStore());
        }
    }

    public UUID createMonitoredObject(MonitoredObjectDal mo) {
        mo.setUuid(UUID.randomUUID());
        monitoredObjects.put(mo.getUuid(), mo);
        return mo.getUuid();
    }

    public void updateMonitoredObject(MonitoredObjectDal mo) {
        monitoredObjects.put(mo.getUuid(), mo);
    }

    public void deleteMonitoredObject(UUID moId) {
        monitoredObjects.remove(moId);
    }

    public MonitoredObjectDal getMonitoredObjectByUuid(UUID uuid) {
        return monitoredObjects.get(uuid);
    }

    public Map<UUID, MonitoredObjectDal> getMonitoredObjects() {
        return monitoredObjects;
    }
}
