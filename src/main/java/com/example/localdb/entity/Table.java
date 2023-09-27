package com.example.localdb.entity;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private String name;
    private List<Row> rows = new ArrayList<>();
    private List<Column> columns = new ArrayList<>();

    public Table(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}
