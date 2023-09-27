package com.example.localdb.entity;

public abstract class Column {
    private String name;
    private String type;

    public Column(String name){
        this.name = name;
    }

    public abstract boolean validate(String value);
}
