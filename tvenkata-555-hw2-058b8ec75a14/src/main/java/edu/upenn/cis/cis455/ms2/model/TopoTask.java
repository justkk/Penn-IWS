package edu.upenn.cis.cis455.ms2.model;

import java.util.UUID;

public class TopoTask {

    private String id = UUID.randomUUID().toString();
    private Object object;

    public TopoTask(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }
}