package org.launchcode.codingevents.models;

import java.util.Collection;

public class Event {
    private String name;
    private String description;
    private final int id;
    private static int nextId = 1;

    public Event(String name, String description){
        this.name = name;
        this.description = description;
        id = nextId;
        nextId ++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
