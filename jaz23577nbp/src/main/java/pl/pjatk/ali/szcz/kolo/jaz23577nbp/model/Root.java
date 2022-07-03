package pl.pjatk.ali.szcz.kolo.jaz23577nbp.model;

import java.util.ArrayList;

public class Root{
    public ArrayList<Rate> rates;
    public String table;
    public String no;
    public String effectiveDate;

    public Root(ArrayList<Rate> rates) {
        this.rates = rates;
    }

    public Root() {
    }

    public Root(ArrayList<Rate> rates, String table, String no, String effectiveDate) {
        this.rates = rates;
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
    }

    public ArrayList<Rate> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Rate> rates) {
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}