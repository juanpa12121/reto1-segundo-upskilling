package com.tcs.certificacion.models;

public class DataUserGet {

    private int count;
    private String gender;
    private String name;

    private Double probability;

    public DataUserGet(int count, String gender, String name, Double probability) {
        this.count = count;
        this.gender = gender;
        this.name = name;
        this.probability = probability;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "DataUserGet{" +
                "count=" + count +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", probability=" + probability +
                '}';
    }
}
