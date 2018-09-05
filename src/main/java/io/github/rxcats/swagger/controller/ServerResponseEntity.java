package io.github.rxcats.swagger.domain.entity;

import org.springframework.lang.Nullable;

import lombok.Data;

@Data
public class ServerResponseEntity<T> {

    private int code = 200;

    private T result;

    private String message = "Success";

    public static <T> ServerResponseEntity of(@Nullable T result) {
        ServerResponseEntity entity = new ServerResponseEntity<>();
        entity.result = result;
        return entity;
    }

}
