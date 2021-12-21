package exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class PrivateReplyException extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest webRequest) {
        ExceptionReply exceptionResponse = new ExceptionReply(new Date(), ex.getMessage(), webRequest.getDescription((false)));
        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler
    public final ResponseEntity<Object> handleAllExceptions(UsernamePhoneNotMatchException ex, WebRequest webRequest) {
        ExceptionReply exceptionResponse = new ExceptionReply(new Date(), ex.getMessage(), webRequest.getDescription((false)));
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public final ResponseEntity<Object> handleAllExceptions(UserNotFoundException ex, WebRequest webRequest) {
        ExceptionReply exceptionResponse = new ExceptionReply(new Date(), ex.getMessage(), webRequest.getDescription((false)));
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public final ResponseEntity<Object> handleAllExceptions(NoReviewException ex, WebRequest webRequest) {
        ExceptionReply exceptionResponse = new ExceptionReply(new Date(), ex.getMessage(), webRequest.getDescription((false)));
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public final ResponseEntity<Object> handleAllExceptions(ProductNotFoundException ex, WebRequest webRequest) {
        ExceptionReply exceptionResponse = new ExceptionReply(new Date(), ex.getMessage(), webRequest.getDescription((false)));
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }


}
