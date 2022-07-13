package com.app.missyou.core;

import com.app.missyou.core.configuration.ExceptionCodeConfiguration;
import com.app.missyou.exception.http.HttpException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

/**
 * 全局异常拦截器
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionAdvice {

    @Autowired
    private ExceptionCodeConfiguration exceptionCodeConfiguration;

    private static final String request = "%s  %s";


    @ResponseBody
    @ExceptionHandler(HttpException.class)
    public ResponseEntity<UnifyResponse> handleHttpException(HttpServletRequest req, HttpException e) {
        String uri = req.getRequestURI();
        String method = req.getMethod();
        UnifyResponse resp = new UnifyResponse(e.getCode(), exceptionCodeConfiguration.getMessage(e.getCode()), String.format(request, method, uri));
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        // 自定义httpStatus错误状态码
        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpStatusCode());
        ResponseEntity<UnifyResponse> r = new ResponseEntity<>(resp, httpHeaders, httpStatus);
        return r;
    }

    /**
     * http url中Bean校验异常
     * @param req
     * @param e
     * @return com.app.missyou.core.UnifyResponse
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public UnifyResponse handleConstraintException(HttpServletRequest req, ConstraintViolationException e) {
        String uri = req.getRequestURI();
        String method = req.getMethod();
        String message = e.getMessage();
        // 进行定制化自定义提示格式
//        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        return new UnifyResponse(10001, message, method + " " + uri);
    }

    /**
     * bean 校验异常
     * @param req
     * @param e
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public UnifyResponse handleBeanValidation(HttpServletRequest req, MethodArgumentNotValidException e) {
        String uri = req.getRequestURI();
        String method = req.getMethod();

        BindingResult bindingResult = e.getBindingResult();
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        StringBuffer errorMsg = new StringBuffer();
        allErrors.forEach(error -> errorMsg.append(error.getDefaultMessage()).append(";"));
        return new UnifyResponse(10001, errorMsg.toString(), method + " " + uri);
    }

    /**
     * 处理通用Exception
     * 未知异常
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    // 返回错误状态码
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        log.error("未知异常：", e);
        String uri = req.getRequestURI();
        String method = req.getMethod();
        UnifyResponse resp = new UnifyResponse(9999, "服务器异常", method + " " + uri);
        return resp;
    }

}
