package pl.pjatk.ali.szcz.kolo.jaz23577nbp.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handlerResourceNotFoundException(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Resource not found");
    }

    @ExceptionHandler(RestClientException.class)
    public ResponseEntity<String> handlerRestClientException(){
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT)
                .body("Can not connect with Client!");
    }
}
