package com.kandoka.exception;

import com.kandoka.common.lang.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 定义全局异常
 * @Author handong3
 * @Date 2020/12/15 11:33
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) {
        log.error("------------------>捕捉到全局异常", e);
        if(e instanceof HwException) {
            //...
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("message", e.getMessage());
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
    @ExceptionHandler(value = HwException.class)
    @ResponseBody
    public Result jsonErrorHandler(HttpServletRequest req, HwException e) {
        return Result.fail(e.getMessage(), "some error data");
    }
}


