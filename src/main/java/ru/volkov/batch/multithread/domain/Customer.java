package ru.volkov.batch.multithread.domain;

import java.time.LocalDateTime;

public class Customer {

    private int id;
    private String name;
    private LocalDateTime date;
    private int cardBskNum;

    public Customer() {
    }

    public Customer(int id, String name, LocalDateTime date, int cardBskNum) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.cardBskNum = cardBskNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getCardBskNum() {
        return cardBskNum;
    }

    public void setCardBskNum(int cardBskNum) {
        this.cardBskNum = cardBskNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", cardBskNum=" + cardBskNum +
                '}';
    }
}
