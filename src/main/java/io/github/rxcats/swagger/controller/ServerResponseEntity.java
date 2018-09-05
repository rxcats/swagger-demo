package io.github.rxcats.swagger.controller;

import org.springframework.lang.Nullable;

import lombok.Data;

@Data
public class ServerResponseEntity {

    private int code = 200;

    private Object result;

    private String message = "Success";

    public static ServerResponseEntity of(@Nullable Object result) {
        ServerResponseEntity res = new ServerResponseEntity();
        res.result = result;
        return res;
    }

}
