package com.example.androidgettersetter.restaurant;

public class restaurants {
    private String name;
    private String type;
    private String location;

    public restaurants(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public restaurants() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
