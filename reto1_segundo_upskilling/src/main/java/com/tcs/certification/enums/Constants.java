package com.tcs.certification.enums;



public enum Constants {

    ACTOR_NAME("Juan Pablo");


    private final String constant;

    Constants(String constant) {
        this.constant = constant;
    }

    public String getConstant() {
        return constant;
    }
}
