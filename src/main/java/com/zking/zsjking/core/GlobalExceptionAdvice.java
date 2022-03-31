package com.zking.zsjking.core;


import com.zking.zsjking.core.configuration.ExceptionCodeConfiguration;
import com.zking.zsjking.exception.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionAdvice {
    @Autowired
    private ExceptionCodeConfiguration codeConfiguration;

    // 处理未知异常
    @ExceptionHandler(value=Exception.class) // 监听异常是非常宽泛的，并不是一个具体的异常，这个其实算是未知异常
    @ResponseBody
    @ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handleException(HttpServletRequest req,Exception e){
        //这块异常的原因，对于前端开发者或者用户来说，都是无意义的，服务器端的开发者代码逻辑有问题。我们只需要服务器端的开发人员自己知道就行了
        String url = req.getRequestURI();
        String method = req.getMethod();
        UnifyResponse message = new UnifyResponse(9999,"服务器异常",method + ":" + url);
        // 开发时候，我们需要知道异常进行调试
        System.out.println(e);
        return message;
    }

    // 处理已知异常
    @ExceptionHandler(HttpException.class)
    public ResponseEntity<UnifyResponse> handleHttpException(HttpServletRequest req, HttpException e) {
        String url = req.getRequestURI();
        String method = req.getMethod();
        // 我们应该返回一个ResponseEntity  // 设置很多属性，header body等，这种形式的控制，更加灵活一点
        UnifyResponse message = new UnifyResponse(e.getCode(),codeConfiguration.getMessage(e.getCode()),method + " " + url);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpStatusCode());
        ResponseEntity<UnifyResponse> r = new ResponseEntity<UnifyResponse>(message,headers,httpStatus);
        return r;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public UnifyResponse handleBeanValidation(HttpServletRequest req, MethodArgumentNotValidException e) {
        String url = req.getRequestURI();
        String method = req.getMethod();
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        String messages = this.formatAllErrorMessages(errors);
        return new UnifyResponse(10001,messages,method + " " + url);
    };


    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public UnifyResponse handleConstraintViolationException(HttpServletRequest req,ConstraintViolationException e) {
        String url = req.getRequestURI();
        String method = req.getMethod();
        return new UnifyResponse(10001,e.getMessage(),method + " " + url);
    }

    private String formatAllErrorMessages(List<ObjectError> errors) {
        StringBuffer errorMsg = new StringBuffer();
        errors.forEach(error ->
                errorMsg.append(error.getDefaultMessage()).append(';')
        );
        return errorMsg.toString();
    }
}
