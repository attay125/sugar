package com.example.models;

import com.orm.SugarRecord;

public class StringFieldExtendedModel extends SugarRecord {
    private String string;

    public StringFieldExtendedModel() {}

    public StringFieldExtendedModel(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
