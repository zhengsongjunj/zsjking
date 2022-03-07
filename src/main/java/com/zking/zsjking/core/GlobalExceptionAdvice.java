package com.zking.zsjking.core;


import com.zking.zsjking.exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {

    // 处理未知异常
    @ExceptionHandler(value=Exception.class) // 监听异常是非常宽泛的，并不是一个具体的异常，这个其实算是未知异常
    @ResponseBody
    public UnifyResponse handleException(HttpServletRequest req,Exception e){
        //这块异常的原因，对于前端开发者或者用户来说，都是无意义的，服务器端的开发者代码逻辑有问题。我们只需要服务器端的开发人员自己知道就行了
        UnifyResponse message = new UnifyResponse(9999,"服务器异常","url");
        return message;
    }

    // 处理已知异常
    @ExceptionHandler(HttpException.class)
    public void handleHttpException(HttpServletRequest req,Exception e) {
        System.out.println("hello");
    }
}