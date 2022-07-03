package pl.pjatk.ali.szcz.kolo.jaz23577nbp.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.service.NBPService;

@RestController
@RequestMapping("/kolokwium")
public class NBPController {
    private final NBPService nbpService;
    public NBPController(NBPService nbpService){
        this.nbpService=nbpService;
    }




}
