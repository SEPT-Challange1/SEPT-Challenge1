package com.item.config;

public enum ErrorCode {
    ERROR_SYSTEM(-1, "System error"),
    ERROR_SERVICE_FAIL(-2, "Server fail");

    private Integer value;
    private String name;

    private ErrorCode(Integer value, String name) {
        this.name = name;
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}