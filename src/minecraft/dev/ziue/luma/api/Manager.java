package dev.ziue.luma.api;

import dev.ziue.luma.api.event.EventManager;

public class Manager {

    private EventManager eventManager;

    public void registerManagers() {
        eventManager = new EventManager();
    }

}
