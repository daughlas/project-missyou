package tech.lvjiawen.demo.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import tech.lvjiawen.demo.core.configuration.ExceptionCodeConfiguration;
import tech.lvjiawen.demo.exception.http.HttpException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {

    @Autowired
    private ExceptionCodeConfiguration codeConfiguration;

    // 处理未知异常
    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    @ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        System.out.println(e);
        String requestString = getRequestString(req);
        UnifyResponse message = new UnifyResponse(
                9999,
                "服务器异常",
                requestString);
        return message;
    }

    // 处理已知异常
    @ExceptionHandler(value=HttpException.class)
    @ResponseBody
    public ResponseEntity<UnifyResponse> handleHttpException(HttpServletRequest req, HttpException e) {
        System.out.println(e);
        String requestString = getRequestString(req);

        UnifyResponse message = new UnifyResponse(
                e.getCode(),
                codeConfiguration.getMessage(e.getCode()),
                getRequestString(req));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpStatusCode());

        ResponseEntity<UnifyResponse> r = new ResponseEntity<>(message, headers, httpStatus);

        return r;
    }

    private String getRequestString(HttpServletRequest req) {
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();
        return method + " " + requestUrl;
    }
}
