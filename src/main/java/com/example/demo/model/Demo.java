package com.example.demo.model;

import lombok.Getter;
import pw.jonwinters.common.annotations.EnumApi;

@Getter
@EnumApi
public enum Demo {

    FIRST("first", 1), SECOND("second", 2);

    Demo(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    private String name;

    private Integer code;
}
