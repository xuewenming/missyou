package com.app.missyou.exception.http;

/**
 * NotFoundException
 * 资源未知异常
 */
public class NotFoundException extends HttpException{

    public NotFoundException(Integer code) {
        this.httpStatusCode = 404;
        this.code = code;
    }

}
