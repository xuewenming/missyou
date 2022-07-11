package com.app.missyou.exception.http;

import lombok.Getter;

/**
 * HttpException
 * Http相关异常
 */
@Getter
public class HttpException extends RuntimeException {
    protected Integer code;
    protected Integer httpStatusCode = 500;
}
