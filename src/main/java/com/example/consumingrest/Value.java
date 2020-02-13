package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * CREATED BY Omer Faruk AY 2/12/2020
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private Long id;
    private String quote;

    public Value() {
    }

    @Override
    public String toString() {
        return "Value{" + "id=" + id + ", quote='" + quote + '\'' + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
