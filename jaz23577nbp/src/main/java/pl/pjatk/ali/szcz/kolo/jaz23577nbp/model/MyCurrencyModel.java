package pl.pjatk.ali.szcz.kolo.jaz23577nbp.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@ApiModel
public class MyCurrencyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty
    private Long id;
    @ApiModelProperty
    private double price;
    @ApiModelProperty
    private LocalDate fromDate;
    @ApiModelProperty
    private LocalDate toDate;
    @ApiModelProperty
    private int currencyNumbers;
    @ApiModelProperty
    private LocalDateTime createdAt = LocalDateTime.now();

    public MyCurrencyModel(){

    }
    public MyCurrencyModel(double cena){
        this.price=cena;
    }

    public MyCurrencyModel(double price, LocalDate fromDate, LocalDate toDate, int currencyNumbers) {
        this.price = price;
        this.fromDate = fromDate;
        this.currencyNumbers=currencyNumbers;
        this.toDate = toDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Long getId() {
        return id;
    }

    public int getCurrencyNumbers() {
        return currencyNumbers;
    }

    public void setCurrencyNumbers(int currencyNumbers) {
        this.currencyNumbers = currencyNumbers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
