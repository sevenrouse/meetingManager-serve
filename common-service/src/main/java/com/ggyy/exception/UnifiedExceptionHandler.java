package com.ggyy.exception;

import com.ggyy.util.ResultVOUtil;
import com.ggyy.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class UnifiedExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ResultVO handlerException(Exception e){
        log.info("服务器内部异常，{}", e.getMessage());
        return ResultVOUtil.fail(e.getMessage());
    }
}
