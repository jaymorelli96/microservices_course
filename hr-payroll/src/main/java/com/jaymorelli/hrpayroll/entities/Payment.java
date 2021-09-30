package com.jaymorelli.hrpayroll.entities;

import java.io.Serializable;
import java.util.Objects;


public class Payment implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return this.dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Integer getDays() {
        return this.days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Payment name(String name) {
        setName(name);
        return this;
    }

    public Payment dailyIncome(Double dailyIncome) {
        setDailyIncome(dailyIncome);
        return this;
    }

    public Payment days(Integer days) {
        setDays(days);
        return this;
    }

    public double getTotal() {
        return days * dailyIncome;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) o;
        return Objects.equals(name, payment.name) && Objects.equals(dailyIncome, payment.dailyIncome) && Objects.equals(days, payment.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dailyIncome, days);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", dailyIncome='" + getDailyIncome() + "'" +
            ", days='" + getDays() + "'" +
            "}";
    }

}
