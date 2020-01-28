package com.example.demo.common.codeDemo;


import lombok.Data;

@Data
public class ResultModel {
    private String msg;
    private Integer code;
    private Object data;
}
