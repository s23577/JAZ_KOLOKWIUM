package pl.pjatk.ali.szcz.kolo.jaz23577nbp.service;

import org.springframework.stereotype.Service;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.config.RestTemplateConfig;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.repository.NBPRepository;

@Service
public class NBPService {
    private final NBPRepository nbpRepository;
    private final RestTemplateConfig restTemplateConfig;
    public NBPService(NBPRepository nbpRepository, RestTemplateConfig restTemplateConfig){
        this.nbpRepository=nbpRepository;
        this.restTemplateConfig=restTemplateConfig;
    }



}
