package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * CREATED BY Omer Faruk AY 2/12/2020
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quotes {
    private String type;
    private Value value;

    public Quotes() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quotes{" + "type='" + type + '\'' + ", value=" + value + '}';
    }
}
