package com.tcs.certificacion.models;

public class DataUserPost {

    private String name;
    private String country_id;

    public DataUserPost(String name, String country_id) {
        this.name = name;
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }
}
