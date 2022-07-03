package pl.pjatk.ali.szcz.kolo.jaz23577nbp.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.config.ResourceNotFoundException;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.config.RestTemplateConfig;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.model.MyCurrencyModel;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.model.Rate;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.model.Root;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.repository.NBPRepository;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class NBPService {
    private final NBPRepository nbpRepository;
    private final RestTemplateConfig restTemplateConfig;

    public NBPService(NBPRepository nbpRepository, RestTemplateConfig restTemplateConfig) {
        this.nbpRepository = nbpRepository;
        this.restTemplateConfig = restTemplateConfig;
    }
    public MyCurrencyModel getNumbersOfCurrency(double price, LocalDate dateFrom, LocalDate dateTo) {

        try {
            Root data = restTemplateConfig.restTemplate().getForObject("http://api.nbp.pl/api/exchangerates/tables/a" + "/{fromDate}/{toDate}", Root.class, dateFrom, dateTo);
            ArrayList<Rate> rates = data.getRates();
            int currencyNumber = 0;
            for (Rate rate : rates) {
                if (rate.getMid() > price) {
                    currencyNumber++;
                }
            }
            MyCurrencyModel dataToSave = new MyCurrencyModel(price, dateFrom, dateTo, currencyNumber);
            return nbpRepository.save(dataToSave);
        } catch (HttpClientErrorException.NotFound e) {
            throw new ResourceNotFoundException();
        } catch (RestClientException e) {
            throw new RestClientException("");
        }
    }
}
