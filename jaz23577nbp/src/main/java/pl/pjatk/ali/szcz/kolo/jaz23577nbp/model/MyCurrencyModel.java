package pl.pjatk.ali.szcz.kolo.jaz23577nbp.model;


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
    private String code;
    @ApiModelProperty
    private LocalDate fromDate;
    @ApiModelProperty
    private LocalDate toDate;
    @ApiModelProperty
    private LocalDateTime createdAt = LocalDateTime.now();
    @ApiModelProperty
    private Double average;

    public MyCurrency(){

    }

    public MyCurrency(Double average){
        this.average=average;
    }

    public MyCurrency(String code, LocalDate fromDate, LocalDate toDate, double average) {
        this.code = code;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.average = average;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
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


    public String getCode() {
        return code;
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
}
