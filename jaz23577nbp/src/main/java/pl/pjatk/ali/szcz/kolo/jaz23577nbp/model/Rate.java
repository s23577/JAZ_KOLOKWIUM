package pl.pjatk.ali.szcz.kolo.jaz23577nbp.model;

public class Rate{
    public String effectiveDate;
    public double mid;
    public String code;

    public Rate(String effectiveDate, double mid, String code) {
        this.effectiveDate = effectiveDate;
        this.mid = mid;
        this.code = code;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

