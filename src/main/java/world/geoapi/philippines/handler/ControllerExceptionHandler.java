package world.geoapi.philippines.handler;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;
import org.springframework.web.util.BindErrorUtils;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public HttpEntity<?> exception(Exception e) {
        // TODO log
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public HttpEntity<?> noResourceFoundException(NoResourceFoundException e) {
        // TODO log
        return new ResponseEntity<>(HttpStatus.NOT_FOUND.getReasonPhrase(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public HttpEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        // TODO log
        return new ResponseEntity<>(BindErrorUtils.resolveAndJoin(e.getFieldErrors()), HttpStatus.BAD_REQUEST);
    }

}
