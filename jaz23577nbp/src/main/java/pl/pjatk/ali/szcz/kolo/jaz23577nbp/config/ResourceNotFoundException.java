package pl.pjatk.ali.szcz.kolo.jaz23577nbp.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException() {
        System.out.println("Record not found");
    }
}
