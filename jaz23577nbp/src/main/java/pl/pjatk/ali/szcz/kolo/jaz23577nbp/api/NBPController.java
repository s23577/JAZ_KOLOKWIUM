package pl.pjatk.ali.szcz.kolo.jaz23577nbp.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.model.MyCurrencyModel;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.service.NBPService;

import java.time.LocalDate;

@RestController
@RequestMapping("/kolokwium")
public class NBPController {
    private final NBPService nbpService;
    public NBPController(NBPService nbpService){
        this.nbpService=nbpService;
    }

    @ApiOperation("Get amount of currencies which are above the average price")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Data properly loaded"),
            @ApiResponse(code = 504, message = "Connection with NBP failed."),
            @ApiResponse(code = 404, message = "Unproper url provided. Try to add proper data. Check it on NBP API documentation.")
    })
    @GetMapping("/getAmount/{price}/{fromDate}/{toDate}")
    public ResponseEntity<MyCurrencyModel> getCurrencyNumber(@PathVariable String price, @PathVariable String fromDate, @PathVariable String toDate){
        LocalDate from_date = LocalDate.parse(fromDate);
        LocalDate to_date = LocalDate.parse(toDate);
        double priceDouble = Double.parseDouble(price);
        return ResponseEntity.ok(nbpService.getNumbersOfCurrency(priceDouble, from_date, to_date));
    }




}
