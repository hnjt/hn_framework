package com.hn.hn_core_server.model;

import java.io.Serializable;

public class TestModel implements Serializable {

    private Integer id;
    private String tableName;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "id=" + id +
                ", tableName='" + tableName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
