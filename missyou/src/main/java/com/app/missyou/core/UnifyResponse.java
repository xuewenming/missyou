package com.app.missyou.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 统一异常
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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
     * 请求方式+请求路径
     */
    private String request;
}
