package com.app.missyou.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * 统一异常
 */
@AllArgsConstructor
@Getter
public class UnifyResponse implements Serializable {
    /**
     * code
     */
    private Integer code;
    /**
     * 消息
     */
    private String message;
    /**
     * 请求消息
     */
    private String request;
}
