package com.ywz.pojo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private Integer id;
    private String name;
    private Date bst;
    private Date bet;
    private String borrowers ;
    private String state;
    private String operations;

    public Integer getId() {
        return id;
    }

    public Date getBst() {
        return bst;
    }

    public void setBst(Date bst) {
        this.bst = bst;
    }

    public Book(String name, String state, String operations) {
        this.name = name;
        this.state = state;
        this.operations = operations;
    }

    public Date getBet() {
        return bet;
    }

    public void setBet(Date bet) {
        this.bet = bet;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(String borrowers) {
        this.borrowers = borrowers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }
}
