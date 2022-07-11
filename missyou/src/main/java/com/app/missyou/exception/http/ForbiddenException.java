package com.app.missyou.exception.http;

/**
 * 无权限异常
 */
public class ForbiddenException extends HttpException{

    public ForbiddenException(Integer code) {
        this.code = code;
        this.httpStatusCode = 403;
    }
}
