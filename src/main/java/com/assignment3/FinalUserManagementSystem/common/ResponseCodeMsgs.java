package com.assignment3.FinalUserManagementSystem.common;

import java.util.HashMap;
import java.util.Map;

public enum ResponseCodeMsgs {

    SUCCESS_CODE(200, "Success"),
    INTERNAL_SERVER_ERROR_CODE(500, "Internal server error"),
    INVALID_REQUEST_PARAMETERS(407, "Invalid request parameter");

    public static final String SUCCESS = "Success";
    public static final String DATA_SAVED_SUCCESSFULLY = "Success";
    public static final String INTERNAL_SERVER_ERROR_MSG = "Internal server error";
    public static final String UNAUTHORIZED_ACCESS_ERROR_MSG = "Unauthorized access";
    public static final String INVALID_REQUEST_PARAMETER_MSG = "Invalid request parameter";
    private static Map<Integer, ResponseCodeMsgs> valueToTextMapping;
    private final Integer value;
    private final String text;

    ResponseCodeMsgs(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

    private static void initMapping() {
        valueToTextMapping = new HashMap<>();
        for (ResponseCodeMsgs s : values()) {
            valueToTextMapping.put(s.value, s);
        }
    }

    public Integer getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

}