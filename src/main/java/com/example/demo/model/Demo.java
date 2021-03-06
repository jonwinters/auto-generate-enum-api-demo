package com.example.demo.model;

import lombok.Getter;
import pw.jonwinters.common.annotations.EnumApi;
import pw.jonwinters.common.annotations.EnumCode;
import pw.jonwinters.common.annotations.EnumName;
import pw.jonwinters.common.model.Document;

@Getter
@EnumApi(value = "/demos")
public enum Demo {

    FIRST("first", 1), SECOND("second", 2);

    Demo(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    @EnumName
    private String name;

    @EnumCode
    private Integer code;
}
